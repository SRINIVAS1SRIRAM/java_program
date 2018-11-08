package typeCasting;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;


public class EmployeeTable {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("org.h2.Driver");
			Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/test", "Srinivas", "sri555");
			Statement statement = conn.createStatement();
			ResultSet rs=statement.executeQuery("select * from Employee");
			ResultSetMetaData rsmd=rs.getMetaData();
			
			int colCount=rsmd.getColumnCount();
			
			for(int count=1;count<=colCount;count++)
			{
				System.out.print(rsmd.getColumnName(count)+"::::");
			}
			
			System.out.println();
			
			while(rs.next())
			{
				System.out.print(rs.getInt(1)+"::::");
				System.out.print(rs.getString(2)+"::::");
				System.out.println(rs.getInt(3));
			}
			statement.close();
			conn.close();
		}
		catch(Exception e) {
			System.out.println("Exception Arised"+e);
		}

	}

}
