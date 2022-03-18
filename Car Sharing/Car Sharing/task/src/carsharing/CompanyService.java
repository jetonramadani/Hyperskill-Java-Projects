package carsharing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CompanyService {
    private final Connection conn;

    public CompanyService(Connection connection) throws SQLException {
        this.conn = connection;
        this.recreateTable();
    }

    private void recreateTable() throws SQLException {
        Statement stmt = this.conn.createStatement();
        CarService.dropCar(conn);
        stmt.execute("DROP TABLE IF EXISTS COMPANY");
        String sql = "CREATE TABLE   COMPANY " +
                "(ID INTEGER PRIMARY KEY AUTO_INCREMENT, " +
                "NAME VARCHAR(255) UNIQUE NOT NULL)";
        stmt.executeUpdate(sql);
        stmt.close();
    }

    public String getCompaniesAsString() throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute("SELECT * FROM COMPANY");
        ResultSet resultSet = stmt.getResultSet();
        StringBuilder res = new StringBuilder("Company list:\n");
        boolean found = false;
        while (resultSet.next()) {
            Company company = Company.getCompany(resultSet);
            res.append(company).append("\n");
            found = true;
        }
        stmt.close();
        if (!found) {
            return "The company list is empty!";
        }
        return res.toString();
    }

    public Company getCompanyById(int id) throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute(String.format("SELECT * FROM COMPANY WHERE ID=%d", id));
        ResultSet resultSet = stmt.getResultSet();
        Company company = null;
        if (resultSet.next()) {
            company = Company.getCompany(resultSet);
        }
        stmt.close();
        return company;
    }

    public void createCompany(String name) throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute(String.format("INSERT INTO COMPANY(name) VALUES('%s')", name));
        stmt.close();
    }

}
