import java.util.Scanner;

public class Challenge02_02{
	public static void main(String []args ){  
		//scanner setup
		Scanner userInput = new Scanner(System.in);
		//calculator addition
		System.out.println("What is your first number:: ");
		double firstNumber = userInput.nextDouble();
		System.out.println("What is your second number:: ");
		double secondNumber = userInput.nextDouble();
		String st1 = userInput.nextLine ();
		System.out.println("Would you like to add, subtract, multiply, or divide the first number by the second number:: ");
		String w = userInput.nextLine ();
		
		//if statements to make sure user puts in one of the four operations
		if (!w.equalsIgnoreCase("add") && !w.equalsIgnoreCase("subtract") && !w.equalsIgnoreCase("multiply") && !w.equalsIgnoreCase("divide") ){
			System.out.println("Please put in add, subtract, multiply, or divide");}
		
		//if statements if the user wants to add
		if(w.equalsIgnoreCase("add")){
		System.out.println("The sum of your inputs is " + (firstNumber + secondNumber));}
		
		//if statements if the user wants to subtract
		if (w.equalsIgnoreCase("subtract")){
		System.out.println("The difference of the two numbers is " + (firstNumber - secondNumber));}
		
		//if statements if the user wants to multiply 
		if (w.equalsIgnoreCase("multiply")){
		System.out.println("The product of the two numbers is " + (firstNumber * secondNumber));}
		
		//if statements if the user wants to divide
		if (w.equalsIgnoreCase("divide")){
		System.out.println("The quotient of the two numbers is" + (firstNumber / secondNumber));}
	}
}
