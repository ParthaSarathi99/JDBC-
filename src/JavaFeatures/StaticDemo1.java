package JavaFeatures;

import static java.lang.System.out;
import static java.lang.Math.*;
import static java.util.Collections.*;
import java.util.*;

public class StaticDemo1 {
	public static void main(String[] args) {
		//instead of Math.sqrt need to use only sqrt
	      double var1= sqrt(5.0);
	      //instead of Math.tan need to use only tan
	      double var2= tan(30);
	      //need not to use System in both the below statements
	      out.println("Square of 5 is:"+var1);
	      out.println("Tan of 30 is:"+var2);
	      
	      ArrayList a=new ArrayList();
	      a.add(10);
	      a.add(56);
	      a.add(5);
	      sort(a);
	      System.out.println(a);
	      
	}

}
