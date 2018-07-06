import java.util.Scanner;

public class lab02_05{
	public static void main (String []args){
		//Scanner setup
		Scanner userInput = new Scanner(System.in);
		//simple calculator
		//ask user for first and second number
		System.out.println("What is your first number:: ");
		double firstNumber = userInput.nextDouble();
		System.out.println("What is your second number:: ");
		double secondNumber = userInput.nextDouble();
		//division
		System.out.println(firstNumber / secondNumber);
	}
}