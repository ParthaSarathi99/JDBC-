package JavaFeatures;

import java.util.Arrays;
import java.util.List;

public class LambdaDemo {
	
	public static void main(String[] args)
	{
		new Thread(new Runnable(){ 
		
		public void run() { 
		System.out.println("Before Java8, too much code for too little to do"); } 
		}).start(); 

	//Java 8 way: 
	new Thread( () -> System.out.println("In Java8, Lambda expression rocks !!") ).start();
	System.out.println("--------****************** ----------------");
	//Iterating over List using Lambda expressions
	
	List features = Arrays.asList("Lambdas", "Default Method", "Stream API", "Date and Time API"); 
	features.forEach(n -> System.out.println(n)); 
	System.out.println("--------****************** ----------------");
	// Even better use Method reference feature of Java 8 
	// method reference is denoted by :: (double colon) operator 
	// looks similar to scope resolution operator of C++ 
	features.forEach(System.out::println);
}
}