package RockPaperScissors;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {

		System.out.println();
		System.out.println();
		game();
		System.out.println("Thank you");
	}

	public static void game() {
		Scanner sc = new Scanner(System.in);
		String[] rps = { "r", "p", "s" };
		String computerMove = rps[new Random().nextInt(rps.length)];

		String playerMove;

		while (true) {
			System.out.println("Enter your move ");
			System.out.println("");
			System.out.println(" R for rock   ");
			System.out.println(" P for PAPER ");
			System.out.println(" S for SCISSORS ");
			System.out.println("Enter your move (r, p, or s)");
			playerMove = sc.nextLine();
			playerMove = playerMove.toLowerCase();
			if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
				break;
			}
			System.out.println(playerMove + " is not a valid move. Please enter valid move.");
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Computer played: " + computerMove);

		if (playerMove.equals(computerMove)) {
			System.out.println("");
			System.out.println("The game was a tie!");
		}

		else if (playerMove.equals("r")) {
			if (computerMove.equals("p")) {
				System.out.println();
				System.out.println("You lose!");
			} else if (computerMove.equals("s")) {
				System.out.println();
				System.out.println("You win!");
			}
		}

		else if (playerMove.equals("p")) {
			if (computerMove.equals("r")) {
				System.out.println();
				System.out.println("You win!");

			} else if (computerMove.equals("s")) {
				System.out.println();
				System.out.println("You lose!");
			}
		}

		else if (playerMove.equals("s")) {
			if (computerMove.equals("p")) {
				System.out.println("");
				System.out.println("You win!");
			} else if (computerMove.equals("r")) {
				System.out.println("");
				System.out.println("You lose");
			}
		}
		System.out.println("");
		System.out.println("Want to Play again:");
		System.out.println();
		System.out.println("Enter Y for yes enter N for NO: ");

		String playAgain = sc.nextLine();

		if (playAgain.equals("y")) {
			game();
		}
	}
}