//Remove an element from the ArrayList
package tathastuIntern;
import java.util.*;

public class Program9{
	public static void main(String []args) {
		ArrayList a=new ArrayList();
		a.add(10);
		a.add(70);
		a.add(19);
		a.add(18);
		a.add(29);
		System.out.println("Elements of the ArrayList are: "+a);
		
		a.remove(2);
		a.add(4,78);
		System.out.println("New ArrayList is: "+a);
	}
}
