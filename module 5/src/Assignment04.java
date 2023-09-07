// CSE 110     : 14869 / Online
// Assignment  : 04
// Author      : Max Comfort & 1219098192
// Description : A program to play a game of Master Mind with the user,
// the game tells the user how many digits they guessed correctly until 
//they guess the correct number. User is then prompted if they want to 
//play again

import java.util.*;

public class Assignment04 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); //initilize Scanner java.util
        String playAgain; //initialize the play again string
        boolean startGame = true; //initialize main loop and start game

        
       while (startGame) {
           System.out.println();
           System.out.println("----- MASTERMIND -----");
           System.out.println("Guess the 4 digit number!\n");
           
           String answer = getRandomNumber(); //retrieve random number from getRandomNumber method and initialize it as answer variable
           //System.out.println(answer); //for developer to check their work
           String guess = ""; //initialize user's guess
           int digitsMatched; //variable for counter of digits matched by user in guess
           int numOfGuesses = 0; //initialize number of guesses


            while (!guess.equals(answer)){ //while user's guess does not equal answer
                numOfGuesses++; //counter for number of guesses
                digitsMatched = 0; //initialize digits matched to zero
                System.out.printf("Guess %d: ", numOfGuesses); //display guess # and prompt user for input
                guess = in.nextLine(); //input of user's guess

                for (int i =0; i < answer.length(); i++){ //for loop to compare characters between user's guess and answer
                    if (guess.charAt(i) == answer.charAt(i)){
                    digitsMatched++; //counter for number of digits matched
                    }
                }
                System.out.printf("You matched %d\n\n", digitsMatched); //print number of digits matched
            }

            System.out.printf("Congratulations! You guessed the right number in %d guesses.", numOfGuesses);

            do { //do- while loop to ask user if they want to play again until yes or no is put. Loop runs at least 1 time.
            System.out.println("\nWould you like ot play again (yes/no)?");
            playAgain = in.nextLine().toLowerCase(); //convert input to lowercase
            }while (!playAgain.equals("yes") && !playAgain.equals("no"));

            if(playAgain.equals("no")){ //if input is no, program ends
            startGame = false;
            }
        }//end of main while loop
    }// end of main method

    private static String getRandomNumber(){
        Random generator = new Random(); //initialize Random java.util
        int answer = generator.nextInt(9999); //generate a random number between 0 and 9999
        return String.format("%04d", answer); //format random number to 4 characters
        
    }//end of getRandomNumber method

}//end of class
