package Model.Connect;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectDB {
    private static final String URL = "************************";
    private static final String driver = "*******************";
    private static final String name = "**************";
    private static final String pass = "******************";
    private Connection connection = null;

    public Connection getConnection() {
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(URL, name, pass);
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return connection;
    }
}
