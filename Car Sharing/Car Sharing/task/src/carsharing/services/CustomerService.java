package carsharing.services;

import carsharing.models.Company;
import carsharing.models.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerService {
    private final Connection conn;

    public CustomerService(Connection connection) throws SQLException {
        this.conn = connection;
        this.recreateTable();
    }

    public void updateCustomer(int userId, Integer carId) throws SQLException {
        Statement stmt = this.conn.createStatement();
        String sql = "UPDATE CUSTOMER " +
                "SET RENTED_CAR_ID=" + carId + " " +
                "WHERE ID=" + userId;
        stmt.executeUpdate(sql);
        stmt.close();
    }

    private void recreateTable() throws SQLException {
        Statement stmt = this.conn.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS CUSTOMER " +
                "(ID INTEGER PRIMARY KEY AUTO_INCREMENT, " +
                "NAME VARCHAR(255) UNIQUE NOT NULL, " +
                "RENTED_CAR_ID INT, " +
                "CONSTRAINT fk_car FOREIGN KEY (RENTED_CAR_ID) REFERENCES CAR(ID))";
        stmt.executeUpdate(sql);
        stmt.close();
    }

    public String getCustomersAsString() throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute("SELECT * FROM CUSTOMER");
        ResultSet resultSet = stmt.getResultSet();
        StringBuilder res = new StringBuilder("Customer list:\n");
        boolean found = false;
        while (resultSet.next()) {
            Customer customer = Customer.getCustomer(resultSet);
            res.append(customer).append("\n");
            found = true;
        }
        stmt.close();
        if (!found) {
            return "The customer list is empty!";
        }
        return res.toString();
    }

    public Customer getCustomerById(int id) throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute(String.format("SELECT * FROM CUSTOMER WHERE ID=%d", id));
        ResultSet resultSet = stmt.getResultSet();
        Customer customer = null;
        if (resultSet.next()) {
            customer = Customer.getCustomer(resultSet);
        }
        stmt.close();
        return customer;
    }

    public void createCustomer(String name) throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute(String.format("INSERT INTO CUSTOMER(name) VALUES('%s')", name));
        stmt.close();
    }

}
