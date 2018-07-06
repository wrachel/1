import java.util.Scanner;

public class lab02_08{
	public static void main(String []args){
		Scanner userInput = new Scanner(System.in);
		//calculate surface area of a cylinder
		//ask user for radius
		System.out.println("What is the radius:: ");
		double radius = userInput.nextDouble ();
		//ask user for height
		System.out.println("What is the height:: ");
		double height = userInput.nextDouble ();
		//make pi a final(constant)
		final double pi = 3.1415;
		//calculate surface area
		double twopirheight = 2*pi*radius*height;
		double twopir = 2*pi*radius*radius;
		System.out.println("The surface area of the cylinder is " + (twopirheight + twopir));
	}
}