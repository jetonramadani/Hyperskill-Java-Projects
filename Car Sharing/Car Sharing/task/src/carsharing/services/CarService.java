package carsharing.services;

import carsharing.models.Car;
import carsharing.models.Customer;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarService {
    private final Connection conn;

    public CarService(Connection connection) throws SQLException {
        this.conn = connection;
        this.recreateTable();
    }

    private void recreateTable() throws SQLException {
        Statement stmt = this.conn.createStatement();
        String sql = "CREATE TABLE IF NOT EXISTS CAR " +
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

    public Car getCarById(int id) throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute(String.format("SELECT * FROM CAR WHERE ID=%d", id));
        ResultSet resultSet = stmt.getResultSet();
        Car customer = null;
        if (resultSet.next()) {
            customer = Car.getCar(resultSet);
        }
        stmt.close();
        return customer;
    }

    public List<Car> getCarsAsList(int compId) throws SQLException {
        Statement stmt = this.conn.createStatement();
        stmt.execute(String.format("SELECT * FROM CAR WHERE COMPANY_ID=%d", compId));
        ResultSet resultSet = stmt.getResultSet();
        List<Car> res = new ArrayList<>();
        while (resultSet.next()) {
            Car car = Car.getCar(resultSet);
            res.add(car);
        }
        stmt.close();
        return res;
    }
}