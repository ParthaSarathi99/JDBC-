package JavaFeatures;

public class VariableArgsDemo {
	
	// Takes string as a argument followed by varargs
    static void fun2(String str, int ...a)
    {
        System.out.println("String: " + str);
        System.out.println("Number of arguments is: "+ a.length);
 
        // using for each loop to display contents of a
        for (int i: a)
            System.out.print(i + " ");
 
        System.out.println();
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Calling fun2() with different parameter
        fun2("RMI", 100, 200);
        fun2("JDBC", 1, 2, 3, 4, 5);
        fun2("Swings");
	}

}
