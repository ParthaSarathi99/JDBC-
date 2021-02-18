import java.sql.*;
import java.util.Scanner;
public class UpdateDemo {

	public static void main(String[] args) {
		Connection con;
		PreparedStatement pstmt;
		ResultSet rs;
		int cnt=0;
		String sqlUpdate;
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
		  //create  the connection object 
		  con=DriverManager.getConnection(  
				  "jdbc:oracle:thin:@localhost:1521:xe","hr","raj");  
		
			 sqlUpdate = "UPDATE candidates " 
		                + "SET last_name = ? "
		                + "WHERE id = ?";
			 pstmt = con.prepareStatement(sqlUpdate);
			 
			 //// prepare data for update
			 Scanner s=new Scanner(System.in);
			 System.out.println("enter Employee id:");
			 int eid=s.nextInt();
			 System.out.println("enter employee's new last name :");
			 String lastname=s.next();
						 
	            pstmt.setString(1, lastname);
	            pstmt.setInt(2, eid);
	            
	            int rowAffected = pstmt.executeUpdate();
	            System.out.println(String.format("Row affected %d", rowAffected));
	            
	         // reuse the prepared statement
	            lastname = "Grohe";
	            eid = 101;
	            pstmt.setString(1, lastname);
	            pstmt.setInt(2, eid);
	 
	            rowAffected = pstmt.executeUpdate();
	            System.out.println(String.format("Row affected %d", rowAffected));
	            con.close();
		}
catch(Exception e)
{
	System.out.println(e);
	}

}
}