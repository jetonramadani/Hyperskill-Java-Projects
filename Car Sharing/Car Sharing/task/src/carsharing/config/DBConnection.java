package carsharing.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
    private static Connection conn;

    public DBConnection(String dbName) throws SQLException, ClassNotFoundException {
        createConnection(dbName);
    }

    private static void createConnection(String dbName) throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName("org.h2.Driver");
            conn = DriverManager.getConnection("jdbc:h2:file:../task/src/carsharing/db/" + dbName);
            conn.setAutoCommit(true);
//            Statement stmt = conn.createStatement();
//            stmt.execute("DROP TABLE IF EXISTS CUSTOMER");
//            stmt.execute("DROP TABLE IF EXISTS CAR");
//            stmt.execute("DROP TABLE IF EXISTS COMPANY");
        }
    }

    public void closeConnection() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
