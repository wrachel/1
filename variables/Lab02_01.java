import java.util.Scanner;

public class Lab02_01{
	public static void main(String []args){
		Scanner userInput = new Scanner(System.in);
		System.out.print("What is your name:: ");
		String firstName = userInput.nextLine();
		String firstname = userInput.nextLine();
		System.out.print("What is your last name:: ");
		String lastName = userInput.nextLine();
		String lastName = userInput.nextLine();
		System.out.println("\nHello" + firstName + " " + lastName + "How are you doing?");
		
		//Ask user for first and last name
		System.out.prit("What is your first name:: ");
		String firstName = userInput.nextLine();
		System.out.print("What is your last name:: ");
		String lastName = userInput.nextLine();
		String fullName = firstName + " " + lastName;
		System.out.println("\nHello" + fullName + ". How are you doing?");
		
		//Ask user for age
		System.out.print("What is your age?");
		int age = userInput.nextLine();
		System.out.println("I see" + firstName + " " + lastName + ". You are" + age + " years old."); 
		
	}
}