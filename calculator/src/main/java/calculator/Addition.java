package calculator;
import java.util.*;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter first number: ");
		int a= sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		int c= a+b;
		System.out.println("Addition of "+a+" and "+b+ " is: "+c);
		System.out.println("Calculator program ended.");
		sc.close();
		

	}

}
