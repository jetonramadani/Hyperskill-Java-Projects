package carsharing;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Car {
    private int id;
    private String name;
    private int companyId;

    public Car(int id, String name, int companyId) {
        this.id = id;
        this.name = name;
        this.companyId = companyId;
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

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public static Car getCar(ResultSet resultSet) throws SQLException {
        return new Car(resultSet.getInt("ID"), resultSet.getString("NAME"), resultSet.getInt("COMPANY_ID"));
    }

    @Override
    public String toString() {
        return String.format("%d. %s", this.id, this.name);
    }
}
