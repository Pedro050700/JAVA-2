package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionsBanco {
	public static Connection getConnections() throws SQLException {
		return DriverManager.getConnection("jdbc:mysql://localhost/test","root","123456");
	}
}
