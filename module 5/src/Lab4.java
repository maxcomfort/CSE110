/*-------------------------------------------------------------
// AUTHOR: Max Comfort
// FILENAME: Lab4.java
// SPECIFICATION: User selects from 3 different arithmetic operations
//                inputs data and program returns sumation, factorial,
//                or left-most digit in a number
// FOR: CSE 110- Lab #4
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/

// Import Scanner class

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        // Declare some variables you need
        Scanner in = new Scanner(System.in);
        int choice; //user enters 1 to 4

        do {
            // Display the menu
            System.out.println("");
            displayMenu();
            
            // Ask the user for one option
            choice = in.nextInt();

            switch (choice) {
                // Define four cases for different options. Don't forget "break".
                case 1 :
                    int sum = 0;
                    System.out.println("Enter a number: ");
                    int m = in.nextInt();
                    //loop for sumation, variable i is counted up to variable m and then added to the variable sum each time
                    for(int i = 1; i <= m; i++){ 
                        sum += i;
                    }
                    System.out.println("The sum of 1 to " + m + " is " + sum);
                    
                break;

                case 2 :
                    int factorial = 1;
                    System.out.println("Enter a number: ");
                    int num = in.nextInt();
                    //loop for factorial, variable i is counted up to variable num, and multiplied to variable factorial each time
                    for(int i = 1; i <= num; i++){ 
                        factorial = factorial * i;
                    }
                    System.out.println("The factorial of " + num + " is " + factorial);

                break;

                case 3 :
                    System.out.println("Enter a number: ");
                    int num2 = in.nextInt();
                    System.out.println("The leftmost digit of " + num2 + " is " + leftmostDigit(num2));

                break;

                case 4 :
                    System.out.println("Bye");
                    System.out.println("");
                break;

                default :
        
            }
        } while (choice != 4);

    }
    
    //method for determining leftmost digit by running that modulo 10 variable num2 then divides num2 by 10 until only 1 digit is left
    private static int leftmostDigit(int num2){
       int firstDigit = 0;
        while (num2 != 0){
            firstDigit = num2 % 10;
            num2 = num2 / 10;
        }
        return firstDigit;
        
    }
    
    /**
     * Print the menu
     */
    private static void displayMenu() {
        System.out.println("Please choose one option from the following menu:");
        System.out.println("1) Calculate the sum of integers from 1 to m");
        System.out.println("2) Calculate the factorial of a given number");
        System.out.println("3) Display the leftmost digit of a given number");
        System.out.println("4) Quit");
    }
}

