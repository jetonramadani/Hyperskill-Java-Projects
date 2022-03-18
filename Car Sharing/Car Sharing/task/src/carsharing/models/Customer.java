package carsharing.models;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Customer {
    private int id;
    private String name;
    private int rentedCarId;

    public Customer(int id, String name, int rentedCarId) {
        this.id = id;
        this.name = name;
        this.rentedCarId = rentedCarId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRentedCarId() {
        return rentedCarId;
    }

    public void setRentedCarId(int rentedCarId) {
        this.rentedCarId = rentedCarId;
    }

    public static Customer getCustomer(ResultSet resultSet) throws SQLException {
        return new Customer(resultSet.getInt("ID"), resultSet.getString("NAME"), resultSet.getInt("RENTED_CAR_ID"));
    }

    @Override
    public String toString() {
        return String.format("%d. %s", this.id, this.name);
    }
}
