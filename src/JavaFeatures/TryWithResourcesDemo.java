package JavaFeatures;
import java.io.*;
public class TryWithResourcesDemo {

	public static void main(String[] args) {
		//try (Connection con = MySQLJDBCUtil.getConnection())
		try(BufferedReader br=new BufferedReader(new FileReader("d:\\myfile.txt")))
		{
		String str;
		while((str=br.readLine())!=null)
		{
		System.out.println(str);
		}
		}catch(IOException ie)
		{  System.out.println(ie);  }
		}
	}


