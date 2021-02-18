import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BlobDemo {
	Connection con;
	PreparedStatement pstmt
	ResultSet rs;
	
	void createConnection()
	{
		try{  
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/mysqljdbc","root","redhat");
	}catch(Exception e)
		{
		System.out.println(e);
		}
	}
	
	public  void writeBlob(int candidateId, String filename) {
        // update sql
        String updateSQL = "UPDATE candidates "
                + "SET resume = ? "
              + "WHERE id=?";
        try { 
        	pstmt   = con.prepareStatement(updateSQL);
        
     // read the file
        File file = new File(filename);
        FileInputStream input = new FileInputStream(file);

        // set parameters
        pstmt.setBinaryStream(1, input);
        pstmt.setInt(2, candidateId);
        // store the resume file in database
        System.out.println("Reading file " + file.getAbsolutePath());
        System.out.println("Store file in the database.");
        pstmt.executeUpdate();
        con.close();
	}
        catch(Exception e)
        {
        	System.out.println("Exception is"+e);
        }	}

	public static void main(String[] args) {
		BlobDemo bd1=new BlobDemo();
		bd1.createConnection();
		bd1.writeBlob(133, "johndoe_resume.pdf");
			}}
