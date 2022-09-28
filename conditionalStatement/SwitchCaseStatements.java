package conditionalStatement;
import java.util.*;

public class SwitchCaseStatements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int daysOfWeeks = sc.nextInt();
		switch(daysOfWeeks) {
		case 1 : System.out.println("MONDAY");
		break;
		case 2 : System.out.println("TUESDAY");
		break;
		case 3 : System.out.println("WEDNESDAY");
		break;
		case 4 : System.out.println("THRUSDAY");
		break;
		case 5 : System.out.println("UNKOWN DAY");
		}
				
//		int daysOfWeek = 4;
//		switch(daysOfWeek){
//		case 1:
//			System.out.println("TODAY IS MONDAY");
//			break;
//		case 2 :
//			System.out.println("TODAY IS TUESDAY");
//			break;
//		case 3:
//			System.out.println("TODAY IS WEDNESDAY");
//			break;
//		case 4:
//			System.out.println("TODAY IS THRUSDAY");
//			break;
//		default:
//			System.out.println("DUNNO THE DAY");
//		}
		

	}

}
