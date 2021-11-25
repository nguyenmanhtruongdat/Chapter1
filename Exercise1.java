import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {

		double n;

		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the number n: ");
		n = keyboard.nextDouble();

		double sin = Math.sin(n);
		double cos = Math.cos(n);
		double sqrt = Math.sqrt(n);

		System.out.println("Sin(n): " + sin);
		System.out.println("Cos(n): " + cos);
		System.out.println("Square root of n: " + sqrt);

	}

}
