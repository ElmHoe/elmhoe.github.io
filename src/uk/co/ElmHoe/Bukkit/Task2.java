package uk.co.ElmHoe.Bukkit;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

/* 			 All Code Seen / Wrote here.
 * 			 Copyright | All Rights Reserved.
 * 			 HyperCloudLDA - Joshua F.
 * 			 2015
 */


public class FruitMachine {
	public static void main(String[] args) {
		/* 		Strings & Imports.	 */
        SimpleDateFormat date = new SimpleDateFormat("dd_MM_YYYY");
        SimpleDateFormat sdf = new SimpleDateFormat("HH.mm.ss");
        Calendar cal = Calendar.getInstance();
		Random IntegerGenerator = new Random(); //Sets the random number generator and imports it.
		Scanner scr = new Scanner(System.in);//Sets the scanner and imports it.
        String datee = date.format(cal.getTime()) + "-" + sdf.format(cal.getTime());;
		String PlayersName;
		int TheUsersScore = 0; // Starting Score for the user.
		int ComputersScore = 0; // Starting Score for the Computer.
		Boolean DoesTheUserWantToContinuePlaying = true; // As its called.
		/*		Logging Location		*/
		PrintWriter writer = null;
		String logLoc = System.getProperty("user.dir");
		try {
			writer = new PrintWriter(logLoc + "\\Task2Logging." + datee + ".yml", "UTF-8");
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (UnsupportedEncodingException e1) {
			e1.printStackTrace();
		}
		// Initial INTs/Strings and Booleans. Initialised ready to be used..
		//Note they must be initialised or else it wouldn't work. 

		// Printing
		writer.println("#Logging Begun. " + datee);
		System.out.println("Please enter your name."); // Asks the user to enter their name.
		PlayersName = scr.nextLine(); // Inputs the users name.
		String getUser = System.getProperty("user.name");
		writer.println("The following person has started the game:");
		writer.println(PlayersName);
		writer.println("They were logged in as:");
		writer.println(getUser);

		while (DoesTheUserWantToContinuePlaying) { // Does the user want to play? Default set to true to run it, but is a while statement so if its set to false, it will terminate.
			int RandomInteger1 = IntegerGenerator.nextInt(6) + 1; // First Random Integer Generated. Make sure this is within the while loop to constantly regenerate it.
			int RandomInteger2 = IntegerGenerator.nextInt(6) + 1;// Third Random Integer Generated.
			int RandomInteger3 = IntegerGenerator.nextInt(6) + 1;// Second Random Integer Generated.
			System.out.println("The numbers are as follows " + Integer.toString(RandomInteger1) + " <.> " + Integer.toString(RandomInteger2) + " <.> " + Integer.toString(RandomInteger3)); // Prints out what the random integers are
			writer.println("The numbers are as follows " + Integer.toString(RandomInteger1) + " <.> " + Integer.toString(RandomInteger2) + " <.> " + Integer.toString(RandomInteger3));
			if (RandomInteger1 == RandomInteger2
					&& RandomInteger2 == RandomInteger3) { // Make sure that the integers generated either match or done.
				System.out.println("Congratulations " + PlayersName + ", all 3 of your numbers matched! + 2 to your score!");// This tells the player that they won the round and got an extra +2
				writer.println("Congratulations " + PlayersName + ", all 3 of your numbers matched! + 2 to your score!");// This tells the player that they won the round and got an extra +2
				TheUsersScore = TheUsersScore + 2; // Adds a score to the user.
			} else if (RandomInteger1 == RandomInteger2) { //Checks if Int1 = Int2
				TheUsersScore = TheUsersScore + 1; //Adds a score to the user.
				System.out.println("Congratulations " + PlayersName + ", 2 of your numbers matched! + 1 to your score!");// This tells the player that they won the round and got an extra +1
				writer.println("Congratulations " + PlayersName + ", 2 of your numbers matched! + 1 to your score!");// This tells the player that they won the round and got an extra +1
			} else if (RandomInteger2 == RandomInteger3) { //Checks if Int2 = Int3
				TheUsersScore = TheUsersScore + 1; //Adds a score to the user.
				System.out.println("Congratulations " + PlayersName + ", 2 of your numbers matched! + 1 to your score!");// This tells the player that they won the round and got an extra +1
				writer.println("Congratulations " + PlayersName + ", 2 of your numbers matched! + 1 to your score!");// This tells the player that they won the round and got an extra +1
			} else if (RandomInteger1 == RandomInteger3) { //Checks if Int1 = Int2
				TheUsersScore = TheUsersScore + 1; //Adds a score to the user.
				System.out.println("Congratulations " + PlayersName + ", 2 of your numbers matched! + 1 to your score!");// This tells the player that they won the round and got an extra +1
				writer.println("Congratulations " + PlayersName + ", 2 of your numbers matched! + 1 to your score!");// This tells the player that they won the round and got an extra +1
			} else { //Else if none are correct, nvm ggwp.
				ComputersScore = ComputersScore + 1;
				System.out.println("Unlucky " + PlayersName + "! None of your numbers matched, PC has won this round.!"); // This tells the player that the PC won the round
				writer.println("Unlucky " + PlayersName + "! None of your numbers matched, PC has won this round.!"); // This tells the player that the PC won the round

			}
			System.out.println("Your score is " + TheUsersScore); //Displays Users Score.
			System.out.println("The computers score is " + ComputersScore); //Displays Computers Score
			System.out.println("Would you like to continue? <Y/N> or <H> for Help!"); //Asks the user if they want to continue.
			String cont = scr.nextLine(); 									//Picks up if the user either said yes to continue, or anything else to terminate.
			if (cont.equalsIgnoreCase("Y")) {
				writer.println("Use is continuing to play the game after entering " + cont);
				DoesTheUserWantToContinuePlaying = true;				 	//Not needed but it's there to inform you that the user wants to play still.
			}else if (cont.equalsIgnoreCase("h")){
				
				System.out.println("Welcome to the help section.");
				System.out.println("");
				System.out.println("The way the game works is it generates 3 numbers");
				System.out.println("It then works out if 3 numbers are equal.");
				System.out.println("If that's true, it will add +2 score to the user.");
				System.out.println("If only 2 are the same, it will give the user +1");
				System.out.println("But if none are the same, the computer will score +1.");
				System.out.println("Simple as that.");
				System.out.println("");
				System.out.println("To play again type 'y'");
				System.out.println("To end the game, type 'n'");
				System.out.println("");
				System.out.println("");

				writer.println("User had asked for the help section - Loaded help section.");
				System.out.println("Enter your answer. Either <Y/N>");
				String continueHelp = scr.nextLine();
				if (continueHelp.equalsIgnoreCase("y")){
					DoesTheUserWantToContinuePlaying = true;				 	//Not needed but it's there to inform you that the user wants to play still.

				}else{
					writer.println("Reply was either N or invalid after help, terminating.");
					writer.println("Terminating Game.");
					writer.println("The Users Score This Game Was:");
					writer.println(TheUsersScore);
					writer.println("The Computers Score This Game Was:");
					writer.println(ComputersScore);
					System.out.println("You've either entered N or entered an incorrect input return, Terminating.");
					writer.close();
					DoesTheUserWantToContinuePlaying = false;
					scr.close();

				}
			} else {
				writer.println("====================================");
				writer.println("Reply was either N or anything else.");
				writer.println("Game has been toggled to terminate.");
				writer.println("Reply was "+cont);
				writer.println("====================================");
				writer.println("Terminating Game.");
				writer.println("The Users Score This Game Was:");
				writer.println(TheUsersScore);
				writer.println("The Computers Score This Game Was:");
				writer.println(ComputersScore);
				writer.println("");
				writer.println("");
				writer.println("Debugging:");
				writer.println("Logged in as: " + System.getProperty("user.name"));
				writer.println("Java Vendor: " + System.getProperty("java.vendor"));
				writer.println("URL: " + System.getProperty("java.vendor.url"));
				writer.println("Version of Java: " + System.getProperty("java.version"));
				writer.println("OS: " + System.getProperty("os.name"));
				writer.println("OS Version: " + System.getProperty("os.version"));
				writer.println("Location: " + System.getProperty("user.dir"));
				System.out.println("You've either entered N or entered an incorrect input return, Terminating.");
				DoesTheUserWantToContinuePlaying = false; 					//Sets the game to done, and terminates the while loop.
				scr.close(); 	//Terminates the scanner - the scanner can be a memory leak if not properly closed.			
				writer.close();
			}
		}

	}
}
