package carsharing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static String getDbName(String[] args) {
        for (int i = 0; i < args.length; ++i) {
            if (args[i].equals("-databaseFileName")) {
                if (i + 1 < args.length) {
                    return args[i + 1];
                }
            }
        }
        return "test";
    }

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // write your code here
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:file:../task/src/carsharing/db/" + getDbName(args));
        conn.setAutoCommit(true);
        Statement stmt = conn.createStatement();
        stmt.execute("DROP TABLE IF EXISTS COMPANY");
        String sql = "CREATE TABLE   COMPANY " +
                "(ID INTEGER, " +
                "NAME VARCHAR(255))";
        stmt.executeUpdate(sql);
        stmt.close();
        conn.close();
    }
}