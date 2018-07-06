import java.util.Scanner;

public class lab02_03{
	public static void main (String []args){
		//Scanner setup
		Scanner userInput = new Scanner(System.in);
		//simple calculator
		//ask user for first and second number
		System.out.println("What is your first number:: ");
		int firstNumber = userInput.nextInt();
		System.out.println("What is your second number:: ");
		int secondNumber = userInput.nextInt();
		//subtracting
		System.out.println(firstNumber - secondNumber);
	}
}