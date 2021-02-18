package JavaFeatures;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertImage {

	public static void main(String[] args) {
		try{  
			Class.forName("oracle.jdbc.driver.OracleDriver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:oracle:thin:@localhost:1521:xe","raj","rehat");  
			              
			PreparedStatement ps=con.prepareStatement
					("insert into training values(?,?,?,?,?)");  
			ps.setInt(1, 200); 
			ps.setString(2, "Mittu");
			ps.setString(3, "AE");
			ps.setInt(4,80); 
						  
			FileInputStream fin=new FileInputStream("c:\\flower.jpg");  
			ps.setBinaryStream(5,fin,fin.available());  
			int i=ps.executeUpdate();  
			System.out.println(i+" records affected");  
			          
			con.close();  
			}catch (Exception e) {e.printStackTrace();}  
			}  
	}

}
