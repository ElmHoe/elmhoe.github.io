package uk.co.ElmHoe.Bukkit;

import java.util.Random;
import java.util.Scanner;
 /* ALL Code here is Copyright to ElmHoe under HyperCloudLDA
 *  For educational use only, not to be copied or manipulated word to word.
 *  Code can be used if changed, but not word to word the same.
 */
public class FruitMachine {
	public static void main(String[] args) {
		Random IntegerGenerator = new Random(); //Sets the random number generator and imports it.
		Scanner scr = new Scanner(System.in);//Sets the scanner and imports it.

		// Initial INTs/Strings and Booleans. Initialised ready to be used..
		//Note they must be initialised or else it wouldn't work. 
		String PlayersName;
		int TheUsersScore = 0; // Starting Score for the user.
		int ComputersScore = 0; // Starting Score for the Computer.
		Boolean DoesTheUserWantToContinuePlaying = true; // As its called.

		// Printing
		System.out.println("Please enter your name."); // Asks the user to enter their name.
		PlayersName = scr.nextLine(); // Inputs the users name.
		while (DoesTheUserWantToContinuePlaying) { // Does the user want to play? Default set to true to run it, but is a while statement so if its set to false, it will terminate.
			int RandomInteger1 = IntegerGenerator.nextInt(6) + 1; // First Random Integer Generated. Make sure this is within the while loop to constantly regenerate it.
			int RandomInteger2 = IntegerGenerator.nextInt(6) + 1;// Third Random Integer Generated.
			int RandomInteger3 = IntegerGenerator.nextInt(6) + 1;// Second Random Integer Generated.
			System.out.println("The numbers are as follows " + Integer.toString(RandomInteger1) + " <.> " + Integer.toString(RandomInteger2) + " <.> " + Integer.toString(RandomInteger3)); // Prints out what the random integers are

			if (RandomInteger1 == RandomInteger2
					&& RandomInteger2 == RandomInteger3) { // Make sure that the integers generated either match or done.
				System.out.println("Congratulations " + PlayersName + ", all 3 of your numbers matched! + 2 to your score!");// This tells the player that they won the round and got an extra +2
				TheUsersScore = TheUsersScore + 2; // Adds a score to the user.
			} else if (RandomInteger1 == RandomInteger2) { //Checks if Int1 = Int2
				TheUsersScore = TheUsersScore + 1; //Adds a score to the user.
				System.out.println("Congratulations " + PlayersName + ", 2 of your numbers matched! + 1 to your score!");// This tells the player that they won the round and got an extra +1
			} else if (RandomInteger2 == RandomInteger3) { //Checks if Int2 = Int3
				TheUsersScore = TheUsersScore + 1; //Adds a score to the user.
				System.out.println("Congratulations " + PlayersName + ", 2 of your numbers matched! + 1 to your score!");// This tells the player that they won the round and got an extra +1
			} else if (RandomInteger1 == RandomInteger3) { //Checks if Int1 = Int2
				TheUsersScore = TheUsersScore + 1; //Adds a score to the user.
				System.out.println("Congratulations " + PlayersName + ", 2 of your numbers matched! + 1 to your score!");// This tells the player that they won the round and got an extra +1
			} else { //Else if none are correct, nvm ggwp.
				ComputersScore = ComputersScore + 1;
				System.out.println("Unlucky " + PlayersName + "! None of your numbers matched, PC has won this round.!"); // This tells the player that the PC won the round

			}
			System.out.println("Your score is " + TheUsersScore); //Displays Users Score.
			System.out.println("The computers score is " + ComputersScore); //Displays Computers Score
			System.out.println("Would you like to continue? <Y/N>"); //Asks the user if they want to continue.
			String cont = scr.nextLine(); //Picks up if the user either said yes to continue, or anything else to terminate.
			if (cont.equalsIgnoreCase("Y")) {
				DoesTheUserWantToContinuePlaying = true; //Not needed but it's there to inform you that the user wants to play still.
			} else {
				System.out
						.println("You've either entered N or entered an incorrect input return, Terminating.");
				DoesTheUserWantToContinuePlaying = false; //Sets the game to done, and terminates the while loop.
				scr.close(); //Terminates the scanner - the scanner can be a memory leak if not properly closed.
			}
		}

	}
}
