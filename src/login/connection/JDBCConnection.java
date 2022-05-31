package login.connection;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCConnection {

    private static JDBCConnection instance;
    private Connection connection;

    public static JDBCConnection getInstance() {
        if (instance == null) {
            instance = new JDBCConnection();
        }
        return instance;
    }

    private JDBCConnection() {

    }

    public void connectToDatabase() throws SQLException {
        String server = "localhost";
        String port = "3306";
        String database = "quanlybanhang";
        String userName = "root";
        String password = "";
        connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
} 
