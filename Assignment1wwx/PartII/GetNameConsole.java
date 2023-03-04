import java.util.Scanner;

public class GetNameConsole {

	public static void main(String[] args) {
		System.out.print("Enter your name: ");
		try (Scanner in = new Scanner(System.in)) {
			String name = in.nextLine();
			System.out.print("Hello, "+ name);
		}
	}
}
