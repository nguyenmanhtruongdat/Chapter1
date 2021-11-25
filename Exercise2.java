import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {

		String string;

		Scanner Keyboard = new Scanner(System.in);

		System.out.print("Enter a string:");
		string = Keyboard.nextLine();

		System.out.print("The length of string: " + string.length());
	}

}
