package connectionWithDB;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class FirstJDBC {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/advjava";
			String username = "root";
			String password = "mayur551211";
			Connection conn = DriverManager.getConnection(url, username, password);
			if(conn.isClosed())
			{
				System.out.println("connection is closer");
			}
			else {
				System.out.println("connection is created");
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
