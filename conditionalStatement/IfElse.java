package conditionalStatement;
import java.util.*;
public class IfElse {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
//		int age = sc.nextInt();
//		if(age >= 18) {
//			System.out.println("You are an Adult");}
//		else {
//				System.out.println("You are not an Adult");}
		
//		int number = sc.nextInt();
//		if (number % 2 ==0) {
//			System.out.println("The number is even");
//		}else {
//			System.out.println("The number is odd");
//		}

		int a = sc.nextInt();	
		int b = sc.nextInt();
		if (a == b) {
			System.out.println("Both number are equal");
		}
		else if (a < b) {
			System.out.println("a is lesser than b");
				}
		
		else {
			System.out.println("a is greater than b");
		}
	}

}