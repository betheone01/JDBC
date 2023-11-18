package UpdateQuery;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection conn;
		try(Scanner sc=new Scanner (System.in)) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "mayur551211";
			 conn = DriverManager.getConnection(url, username, password);
			
			String q="update  table1 set tName=? ,tCity=? where tId=?";
		
		 System.out.println("enter the name");
		 String name=sc.next();
		 
		 
		 System.out.println("enter the city");
		 String city=sc.next();
		 System.out.println("Enter the id  for which you want the update the data");
		 int id=sc.nextInt();
		 
		 PreparedStatement pst=	conn.prepareStatement(q);
		 pst.setString(1, name);
		 
		 pst.setString(2, city);
		 pst.setInt(3, id);
		 pst.executeUpdate();
		 System.out.println("Updated the data for id  ..."+id);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
