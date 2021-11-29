//Basic calculator
package tathastuIntern;
import java.util.*;
public class Program1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double a=sc.nextInt();
		System.out.println("Enter the second number: ");
		double b=sc.nextInt();
		System.out.println("Enter the operator: ");
		char c=sc.next().charAt(0);
		
		switch(c) {
		case '+':{
			System.out.println("The sum of two numbers "+a+" and "+b+" is: "+(a+b));	
			break;
		}
		case '-':{
			System.out.println("The difference of two numbers "+a+" and "+b+" is: "+(a-b));	
			break;
		}
		case '*':{
			System.out.println("The product of two numbers "+a+" and "+b+" is: "+(a*b));	
			break;
		}
		case '/':{
			System.out.println("The division of two numbers "+a+" and "+b+" is: "+(a/b));	
			break;
		}
		default:
			System.out.println("Invalid Operator");
		}
		
	}

}
