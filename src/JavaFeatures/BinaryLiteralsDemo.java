package JavaFeatures;

public class BinaryLiteralsDemo {
	public static void main(String args[]) {
		
		// Before Java 7
		  // In order to use Binary Numbers as Integral types
		  // Integer class static method parseInt was used. 
		  // This method Parses the string argument as a signed 
		  // integer in the radix specified by the second argument.
		  int number = Integer.parseInt("1011", 2);
		   
		  System.out.println("The value of number is : " + number);
		   
		  // After Java 7
		  // Binary Literals were introduced which were represented by
		  // prefix such as 0b and 0B. The prefix denoted that number
		  // coming after that is binary number
		  int number2 = 0b1011;  // 0b or 0B
		   
		  System.out.println("The value of number2 is : " + number2);
		  
		  
        byte ten = 10; // Representing 10 in base10 format
        byte tenBinary = 0b1010; // Representing 10 in binary format
        System.out.println("Normal Format : " + ten);
        System.out.println("Binary Format : " + tenBinary);
        // Checks whether the value is same or not
        System.out.println("is Dec == to binary : " + (ten == tenBinary));
 
        // We can use _ in binary literals,
        byte seven = 0b000_0111;
        // having underscore in binary literals
        System.out.println("Binary Literal with Underscores : " + seven);
    }
}
