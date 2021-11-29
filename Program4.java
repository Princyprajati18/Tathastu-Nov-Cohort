//Palindrome
package tathastuIntern;
import java.util.Scanner;
public class Program4 {
    static boolean Pal(String st) {
    	st.trim();
		char c[]=st.toCharArray();
		int l=c.length;
        int i=0, j=l-1 ;
			while(i<j) {
				if(c[i]!=c[j]) {
					return false;
				}
				i++;
				j--;
			}
		
    	return true;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String s=sc.nextLine();
		if(Pal(s)) {
					System.out.println("The string is palindrome.");
				}
		else
				System.out.println("The string is not palindrome.");
			
		

}
}
