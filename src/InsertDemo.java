import java.sql.*;

public class InsertDemo {
		public static void main(String[] args) {
		Connection con;
		Statement stmt;
		ResultSet rs;
		int cnt=0;
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mysqljdbc","root","redhat");
			
           String str = "INSERT INTO skills(name)" + "VALUES('Spring Boot')";

			stmt=con.createStatement();
			int rowcount = stmt.executeUpdate(str);
			if(rowcount >0)
			{
				System.out.println("Record Inserted Successfully");
			}
			
			String str1 = "select count(id) from skills";
             rs=stmt.executeQuery(str1)  ; 
             while(rs.next())
            		 {
            cnt=rs.getInt(1);}
            System.out.println("Total no. of records is: "+cnt);
            con.close();
			}
		
		catch(Exception ce) {
			System.out.println(ce);
		}

	}


}
