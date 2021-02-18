package JavaFeatures;

interface TestInterface
{
    // abstract method
    public void square (int a);
 
    // default method
    default void show()
    {
        System.out.println("Default Method Executed");
    }
    
 // static method
    static void show1()
    {
        System.out.println("Static Method Executed");
    }
}
public class DefaultMethodDemo implements TestInterface{
	 // Implementation of square abstract method
    public void square (int a)
    {
        System.out.println(a*a);
    }
    
	public static void main(String[] args) {
		DefaultMethodDemo d = new DefaultMethodDemo();
        d.square(4);
 
        // default method executed
        d.show();
        
     // Static method executed
        TestInterface.show1();

	}

}
