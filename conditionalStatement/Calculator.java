package conditionalStatement;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number ");
		float a = sc.nextFloat();
		
		System.out.println("Enter the second number ");
		float b =  sc.nextFloat();
		
		System.out.println("Enter the operation ");
		sc.nextLine();							/*this line & next line is doubt?*/
		char operation = sc.nextLine().charAt(0); 
		
		float result = 0;
		
		switch(operation) {
		case '+':
			result = a + b;
			break;
		case '-':
			result = a - b;
			break;
		case '*':
			result = a * b;
			break;
		case  '/':
			result = a / b;
			break;
		default:
			System.out.println("INVALID OPERATION");
			
		
			
		}
		System.out.println("Result is " + result);
	}

}
