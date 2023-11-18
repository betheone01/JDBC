package retrievingTheData;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connection.ConnectionProvider;

public class RetrievingTheData {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection conn=ConnectionProvider.getConnection();
		
		String query="select * from table1";
		
		Statement st=conn.createStatement();
		ResultSet rst=st.executeQuery(query);
		
		while(rst.next())
		{
			int id=rst.getInt(1);
			String name=rst.getString(2);
			String city=rst.getString(3);
			System.out.print(id+" ");
			System.out.print(name+" ");
			System.out.print(city+" ");
			System.out.println();
			
		}
		
	}

}
