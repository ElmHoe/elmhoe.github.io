    public static void main(String[] args) {
        String PlayerName; //variable for the players name
        Boolean keepPlaying = true;
        Boolean playAgain = true;
        Scanner inputVal = new Scanner(System.in); //scanner variable for the players name
        System.out.println("What is your name?"); //prints out to the screen "what is your name?" to get the players name
        PlayerName = inputVal.nextLine(); //Saves the players name
        System.out.println(" "); //Prints out a space between the next line
        int PlayerScore = 0; //sets the players score to 0
        int ComputerScore = 0; //sets the computers score to 0
        Random rand = new Random(); //random number generator variable
        while (keepPlaying){
            System.out.println("Here are the random numbers: "); //Prints out to the screen "here are the random numbers: "
            int num1 = rand.nextInt(6)+1; //Generates a random number between 1-6
            System.out.print(num1); //Prints out the random number it just generated
            int num2 = rand.nextInt(6)+1;
            System.out.print("-"+num2); //Prints out the next random number next to the last one
            int num3 = rand.nextInt(6)+1;
            System.out.print("-"+num3);
            if (num1 == num2 && num1 == num3){ //Checks if all 3 numbers are the same
                System.out.println(" ");
                System.out.println("Well done "+PlayerName+", you earned 2 points!"); //Tells the player that they just got 2 points
                PlayerScore += 2; //Gives the player +2 points to their total score
            }
            if (num1 == num2 || num2 == num3 || num1 == num3) //Checks if any 2 of the numbers are the same
            {
                System.out.println(" ");
                System.out.println("Well done "+PlayerName+", you earned 1 point");
                PlayerScore += 1;
            }
            else{
                System.out.println(" ");
                System.out.println("Oh well "+PlayerName+", the computer earned 1 point");
                ComputerScore += 1; //adds 1 point to the total of the computers score
            }
            System.out.println(" ");
            System.out.println("Your score is: "+PlayerScore); //Shows the player what their current score is
            System.out.println("The computers score is: "+ComputerScore); //Shows the player what the computers current score is
            System.out.println(" ");
            System.out.println(PlayerName+", would you like to play again?");
            String playAgainAnswer = inputVal.nextLine();
            
            keepPlaying = checkAnswer(playAgainAnswer);
        }
    }
    
    public static boolean checkAnswer(String answer)
    {
    	Boolean correctAnswer = false;
    	Scanner sc = new Scanner(System.in);
    	while (!correctAnswer)
    	{
    		if (answer.equalsIgnoreCase("yes"))
    		{
                return true;
            }
    		else if (answer.equalsIgnoreCase("h"))
    		{
                System.out.println(" ");
                System.out.println("===Welcome to my fruit machine game!===");
                System.out.println("===You can enter any name you want to the software===");
                System.out.println("===If you want to play again, type -yes-===");
                System.out.println("===If you don't want to play again, type -no-===");
                System.out.println(" ");
                System.out.println("Would you like to play again?");
                answer = sc.nextLine();
            }
            else if (answer.equalsIgnoreCase("no"))
            {
                System.out.println("Peace fam.");
                return false;
            }
            else
            {
                System.out.println("Unknown answer");
                System.out.println("Would you like to play again?");
                answer = sc.nextLine();
            }
    	}
    	sc.close();
    	return false;
    }
}
