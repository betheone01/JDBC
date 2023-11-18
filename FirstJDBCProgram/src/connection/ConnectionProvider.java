package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionProvider {

	private static Connection conn;
	public static Connection getConnection()
	{
		try {
			if(conn==null)
			{
				String url = "jdbc:mysql://localhost:3306/youtube";
				String username = "root";
				String password = "mayur551211";
				conn=DriverManager.getConnection(url,username,password);
				
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		return conn;
	}
	
}
