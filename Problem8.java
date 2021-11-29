//Mirror inverse
package tathastuIntern;
import java.util.*;
public class Program8 {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0; i<n; i++) {
			if(a[a[i]]==i) {
				count++;
				continue;
			}
			else
				System.out.println("The array is not the mirror inverse of itself");
			break;
		}
        if(count==a.length) {
        	System.out.println("The array is the mirror inverse of itself");
        }
  }
}
