package carsharing;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CarService {
    private final Connection conn;

    public CarService(Connection connection) throws SQLException {
        this.conn = connection;
        this.recreateTable();
    }

    public static void dropCar(Connection connection) throws SQLException {
        Statement statement = connection.createStatement();
        statement.execute("DROP TABLE IF EXISTS CAR");
        statement.close();
    }

    private void recreateTable() throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute("DROP TABLE IF EXISTS CAR");
        String sql = "CREATE TABLE CAR " +
                "(ID INTEGER PRIMARY KEY AUTO_INCREMENT, " +
                "NAME VARCHAR(255) UNIQUE NOT NULL, " +
                "COMPANY_ID INT NOT NULL, " +
                "CONSTRAINT fk_company FOREIGN KEY (COMPANY_ID) REFERENCES COMPANY(ID))";
        stmt.executeUpdate(sql);
        stmt.close();
    }

    public String getCarsAsString(int compId) throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute(String.format("SELECT * FROM CAR WHERE COMPANY_ID=%d", compId));
        ResultSet resultSet = stmt.getResultSet();
        StringBuilder res = new StringBuilder("Car list:\n");
        boolean found = false;
        int i = 1;
        while (resultSet.next()) {
            Car car = Car.getCar(resultSet);
            res.append(i++).append(". ").append(car.getName()).append("\n");
            found = true;
        }
        stmt.close();
        if (!found) {
            return "The car list is empty!";
        }
        return res.toString();
    }

    public void createCar(String name, int compId) throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute(String.format("INSERT INTO CAR(NAME, COMPANY_ID) VALUES('%s', %d)", name, compId));
    }

}