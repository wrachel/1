import java.util.Scanner;

public class lab02_06{
	public static void main (String []args){
		//Scanner setup
		Scanner userInput = new Scanner(System.in);
		//BMI calculator
		//ask user for name
		System.out.println("What is your name:: ");
		String name = userInput.nextLine();
		//ask user for weight
		System.out.println("What is your weight:: ");
		double weight = userInput.nextDouble();
		//ask user for height
		System.out.println("what is your height:: ");
		double height = userInput.nextDouble ();
		//calculate BMI
		double weightbyheight = weight/(height*height);
		double conversionvalue = 703.0;
		System.out.println(name + ", your BMI is " + weightbyheight*conversionvalue);
		System.out.printf("%.4f", weightbyheight*conversionvalue);
	}
}