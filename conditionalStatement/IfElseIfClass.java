package conditionalStatement;

public class IfElseIfClass {

	public static void main(String[] args) {
	
		int num = 33;
		
		if(num <= 20) {
			System.out.println("num is less than 20");
		}else if (num >20 && num < 30 ) {
			System.out.println("num is equal to 30");
			
		}else {
			System.out.println("num is greater than 30");
		}

	}

}
