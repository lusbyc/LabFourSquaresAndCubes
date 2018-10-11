import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int i = 1;
		int userInput = 0;
		String cont = "y";

		System.out.println("Learn your squares and cubes!");

		while (cont.equalsIgnoreCase("y")) {

			System.out.println();
			System.out.println("Enter an integer: ");
			System.out.println();
			userInput = scan.nextInt();
			System.out.println();

			// This line contains the formatting for the table header
			System.out.printf("%-10s %-12s %-14s\n", "Number", "Squared", "Cubed");
			System.out.printf("%-10s %-12s %-14s\n", "=======", "=======", "======");

			for (i = 1; i <= userInput; i++)

				// This line contains formatting for the table and functions to calculate the squares and cubes
				System.out.printf("%-10s %-12s %-14s\n", i, (int) (Math.pow(i, 2)), (int) (Math.pow(i, 3)));

			System.out.println();
			System.out.println("Continue? (y/n): ");
			cont = scan.next();

		}

		System.out.println();
		System.out.println("Thanks for playing!");

		scan.close();

	}
}
