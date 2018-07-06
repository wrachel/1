import java.util.Scanner;

public class lab02_07{
	public static void main(String []args){
		Scanner userInput = new Scanner(System.in);
		//calculate volume of cylinder
		//ask user for radius
		System.out.println("What is the radius:: ");
		double radius = userInput.nextDouble ();
		//ask user for height
		System.out.println("What is the height:: ");
		double height = userInput.nextDouble ();
		//make pi a constant
		final double pi = 3.1415;
		// calculations to find the volume
		double rbyheight = height*(radius*radius);
		System.out.println("The volume of this cylinder is" + rbyheight*pi);
	}
}