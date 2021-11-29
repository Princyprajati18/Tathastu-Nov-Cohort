//Fibonacci sequence
package tathastuIntern;
import java.util.*;
public class Program2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of terms: ");
		int n=sc.nextInt(); 
        int a=0, b=1;
        System.out.print(a+" "+b+" ");
		for(int i=0; i<=n; i++) {
			int c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}

}
