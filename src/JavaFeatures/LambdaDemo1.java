package JavaFeatures;

import java.util.HashMap;
import java.util.Map;
public class LambdaDemo1 {
	 public static void main(String[] args) {
		 
	        Map <String, String> books = new HashMap <> ();
	        books.put("Let Us C", "Yashwant Kanetkar");
	        books.put("Object Oriented Programming using Java", "Simon Kendal");
	        books.put("Java: Graphical User Interfaces", "David Etheridge");
	 
books.forEach((key, value) -> System.out.println("Book Name:- " + key + ", Author:- " + value));
	 
	        System.out.println();
	 
	        books.forEach((key, value) -> {
	            System.out.println("Book Name:- " + key + " Author:- " + value);
	        });
	        
	        System.out.println();
	        
	       
	    }
}
