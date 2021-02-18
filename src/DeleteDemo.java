import java.sql.*;
public class DeleteDemo {

	public static void main(String[] args) {
		Connection con;
		Statement stmt;
		int cnt=0;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mysqljdbc","root","redhat");
			
			//"Delete from candidates where rtrim(last_name) like \'Y\'"
			
		String sql = "Delete from candidates where rtrim(last_name) like\'Y%g\';";
	        System.out.println(" ");
	        stmt = con.createStatement();
	         cnt=stmt.executeUpdate(sql);
	         
	         if(cnt >0)
				{
	        System.out.println("Record for Young is deleted");
				}
	         else
	         {
	        	 System.out.println("Record Not found");
	         }
	        con.close();        	
		}
		
		catch(Exception ce) {
			System.out.println(ce);
		}

	}

}
