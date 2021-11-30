//Diamond pattern
package tathastuIntern;
import java.util.Scanner;
public class Program6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        int c=n-1;
        for(int i=1; i<=n; i++) {
        	for(int j=1; j<=c; j++) {
        		System.out.print(" ");
        	}
        	for(int k=1; k<=i; k++) {
        		System.out.print("* ");
        	}
        	System.out.println("");
        	c--;
        }
        	c=0;
        	for(int i=n; i>0; i--) {
        		for(int j=0; j<c; j++) {
        			System.out.print(" ");
        		}
        		int l=2*(n-i)-1;
        		for(int k=0; k<i; k++) {
            		System.out.print("* ");
            	}
            	System.out.println("");
            	c++;
        	}
        	}
	}
