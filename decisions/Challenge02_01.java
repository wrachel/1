import java.util.Scanner;

public class Challenge02_01{
	public static void main (String []args){
		//Scanner setup
		Scanner userInput = new Scanner(System.in);
		//BMI calculator
		// ask user for name
		System.out.println("What is your name:: ");
		String name = userInput.nextLine();
		// ask user for weight
		System.out.println("What is your weight:: ");
		double weight = userInput.nextDouble();
		// ask user for height
		System.out.println("what is your height:: ");
		double height = userInput.nextDouble ();
		//calculations to find bmi
		double weightbyheight = weight/(height*height);
		double conversionvalue = 703.0;
		System.out.println(name + ", your BMI is " + weightbyheight*conversionvalue);
		System.out.printf("%.4f", weightbyheight*conversionvalue);
		double w = weightbyheight*conversionvalue;
		
		System.out.println(w);
		//tell user if they are underweight, healthy, or overweight
		if (w<18.5){
		System.out.println(name + ", you are underweight :(");}
		
		if(w>=18.5 && w<25){
		System.out.println(name + ", you are healthy :)");}
		
		if (w<=29.9 && w>=25){
		System.out.println(name + ", you are overweight :(");}
		
		if (w>=30){
		System.out.println(name + ", you are obese :(");}
		
	}
}