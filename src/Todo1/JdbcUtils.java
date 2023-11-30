package Todo1;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	static Connection doConnection() throws Exception {
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		Class.forName(driverClassName);
		String ConnectionUrl = "jdbc:mysql://localhost:3306/cdac_nov_23?useSSL=false";
		String userId = "root";
		String password = "root";
		
		Connection dbConnection = DriverManager.getConnection(ConnectionUrl, userId, password);
		
		return dbConnection;
	}
}
