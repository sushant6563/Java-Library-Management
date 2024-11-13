public class DatabaseSQLConnection {
}


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConnection {

    // MySQL Database credentials
    private static final String URL = "jdbc:mysql://localhost:3306/library_management"; // Change to your database URL
    private static final String USER = "root"; // MySQL username (default: root)
    private static final String PASSWORD = "your_password"; // MySQL password

    private static Connection connection = null;

    // Create a connection to the database
    public static Connection getConnection() {
        if (connection != null) {
            return connection; // Return existing connection
        }

        try {
            // Load MySQL JDBC driver (optional for newer versions of Java, but can be included for compatibility)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Database connected successfully!");

        } catch (SQLException | ClassNotFoundException e) {
            System.err.println("Connection failed: " + e.getMessage());
        }

        return connection;
    }

    // Close the connection
    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Database connection closed.");
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
