package insertDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertJDBC {

	public static void main(String[] args) throws SQLException
	{
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "mayur551211";
			Connection conn = DriverManager.getConnection(url, username, password);
			
			String q="create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";
			Statement stmt=conn.createStatement();
			stmt.executeUpdate(q);
			System.out.println("table is created in database");
			conn.close();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
