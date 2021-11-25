import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {

		double a;
		double b;

		Scanner Keyboard = new Scanner(System.in);

		System.out.print("Please enter the length of the rectangle: ");
		a = Keyboard.nextDouble();
		System.out.print("Please enter the width of the rectangle: ");
		b = Keyboard.nextDouble();

		System.out.println("The area of the rectangle is: " + (a * b) );
		System.out.println("The perimeter of the rectangle is: " + ( (a + b)*2) );

	}

}
