package JavaFeatures;

import java.util.Optional;
public class OptionalDemo {

	public static void main(String[] args) {
		
		/*String[] str = new String[10];  
        String lowercaseString = str[5].toLowerCase();  
        System.out.print(lowercaseString);  
        System.out.print("------------------------");*/
        
		   String[] str = new String[10];  
		 //  str[5] = "Java 8";// Setting value for 5th index
	        Optional<String> checkNull = Optional.ofNullable(str[5]);  
	        if(checkNull.isPresent()){  // check for value is present or not  
	            String lowercaseString = str[5].toLowerCase();  
	            System.out.print(lowercaseString);  
	        }else  
	            System.out.println("Null String");  
	    }  
	}


