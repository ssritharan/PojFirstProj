import java.util.Scanner;

public class AskingQuestions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner keyboard = new Scanner(System.in);

	    int num1, num2;

	    System.out.print( "First temperature? " );
	    num1 = keyboard.nextInt();

	    System.out.print( "Second temperature? " );
	    num2 = keyboard.nextInt();

	    System.out.println("The max value is : " + Math.max(num1, num2));

	}

}
