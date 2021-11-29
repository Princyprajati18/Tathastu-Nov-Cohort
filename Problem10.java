//Transpose of a matrix
package tathastuIntern;
import java.util.*;
public class Program10 {
  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the square matrix:");
		int n=sc.nextInt();
        int a[][]=new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int k=0; k<n; k++) {
			for(int l=0; l<n; l++) {
				if(k<l) {
					break;
				}
				else {
				int temp=a[k][l];
				a[k][l]=a[l][k];
				a[l][k]=temp;
				}
			}
		}
		for(int k=0; k<n; k++) {
			for(int l=0; l<n; l++) {
				System.out.print(a[k][l]+" ");
			}
			System.out.println(" ");
		}
	}
}
