package JavaFeatures;
@FunctionalInterface
interface MyFunctionalInterface {
	//A method with no parameter
    public String sayHello();
}

interface MyFunctionalInterface2 {
	//A method with single parameter
    public int incrementByFive(int a);
}

interface StringConcat {

    public String sconcat(String a, String b);
}

public class LambdaExpresions {
	
	public static void main(String[] args) {
		// Lambda Expression with no parameter
		MyFunctionalInterface msg = () -> {return "Hello";};
        System.out.println(msg.sayHello());
        
        //lambda expression with single parameter num
        MyFunctionalInterface2 f = (num) -> num+5;
        System.out.println(f.incrementByFive(22));
           
        // lambda expression with multiple arguments
        StringConcat s = (str1, str2) -> str1 + str2;
        System.out.println("Result: "+s.sconcat("Hello ", "Java 8"));
	}

}
