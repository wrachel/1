import java.util.Scanner;

public class inputs {
  public static void main (String[] args) {
    //Setup Scanner
    Scanner userInput = new Scanner(System.in);

    //Ask user for first and last name
    System.out.print("What is your first name:: ");
    String firstName = userInput.nextLine();
    System.out.print("What is your last name:: ");
    String lastName = userInput.nextLine();
    String fullName = firstName + " " + lastName;
    System.out.println("\nHello " + fullName + ". How are you doing?");

    //Ask user for age
    System.out.print("What is your age:: ");
    int age = userInput.nextInt();
	String st1 = input.nextLine ();
    System.out.println("I see " + fullName + ". You are " + age + " years old.");
	input.nextLine(); 

    //Ask user for their car
    System.out.println("What car do you drive:: ");
	// String st1 = input.nextLine ();
    String yourCar = userInput.nextLine();
    System.out.println("Nice " + yourCar + firstName + ".");
  }
}
//© 2018 GitHub, Inc.