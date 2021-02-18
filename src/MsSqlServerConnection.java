import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MsSqlServerConnection {

	public static void main(String[] args) {
		
		 Connection con = null;
		 Statement stmt;
		ResultSet rs;
		String url ="jdbc:sqlserver://RASHMI-LAPY\\SQLEXPRESS;databaseName=AdventureWorks2019;integratedSecurity=true";
		
		try{  
			 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			System.out.println("Connecting to database...");
			con=DriverManager.getConnection(url);
			
			stmt=con.createStatement();  
			rs=stmt.executeQuery("select * from HumanResources.Department");  
			
			// Extract data from result set
			while(rs.next())  {
			System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)
			+" "+rs.getDate(4));  
			 
			}
		 rs.close();
	     stmt.close();
	     con.close();
		}
		    catch(Exception e){ 
				
				System.out.println(e);
				}  			}	}

	
