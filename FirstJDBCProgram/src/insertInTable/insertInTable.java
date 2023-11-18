package insertInTable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class insertInTable {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		try(Scanner sc=new Scanner (System.in)) {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/youtube";
			String username = "root";
			String password = "mayur551211";
			Connection conn = DriverManager.getConnection(url, username, password);
			
			String q="insert into table1(tName,tCity)values (?,?)";
		 PreparedStatement pst=	conn.prepareStatement(q);
		 System.out.println("enter the name");
		 pst.setString(1, sc.next());
		 System.out.println("enter the city");
		 pst.setString(2, sc.next());
		 pst.executeUpdate();
		 System.out.println("Inserted ...");
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
