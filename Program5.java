//Permutation and Combination
package tathastuIntern;
import java.util.*;
public class Program5 {
    static int fact(int n) {
    	int f=1;
    	for(int i=1; i<=n; i++) {
    		f=f*i;
    	}
    	return f;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Press\n1.C for Combination\n2.P for Permutation");
		char c=sc.next().charAt(0);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.println("Enter the value of r: ");
		int r=sc.nextInt();
		
		switch(c) {
		case 'C':{
			int factn=fact(n);
			int factr=fact(r);
			int factnr=fact(n-r);
						
			int com=factn/(factnr*factr);
			System.out.println(com);
			break;
		}
		
	case 'P':{
		int factn=fact(n);
		int factnr=fact(n-r);
		
		int per=factn/factnr;
		System.out.println(per);
		break;
	}
	}
	}
}
