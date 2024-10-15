import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestJdbc {
    private static final String urlConnection = "jdbc:mysql://localhost:3306/btjdbc2";

    private String username = "root";
    private String password = "123456";

    public Connection connectionDB() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(urlConnection, username, password);
            System.out.println("connection successful");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
