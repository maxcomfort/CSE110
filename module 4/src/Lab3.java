/*-------------------------------------------------------------
// AUTHOR: Max Comfort 
// FILENAME: Lab3.java
// SPECIFICATION: User inputs 3 grads to find weighted average
// FOR: CSE 110- Lab #3
// TIME SPENT: 30 minutes
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab3 {
    public static void main(String[] args) {
        // This scanner is prepared for you to get inputs
        Scanner scanner = new Scanner(System.in);
        // Declare three variables for HW, midterm, and final exam grades
        double HW = 0, midterm = 0, finalExam = 0;
        // Declare a loop control variable i
        int i = 0;

        while (i < 3) {
            // Design if-else control flow:
            //
            // if i is 0, asks for the homework grade
            // if i is 1, asks for the midterm exam grade
            // if i is 2, asks for the final exam grade
            //
            // You have to let the user re-try if any of the inputs is invalid.
            // - homework grade is in [0, 100]
            // - midterm grade is in [0, 100]
            // - final exam grade is in [0, 200]
            //
            // The first if-else statement is attached for your reference. You have to
            // finish the last two statments by yourself.

            if (i == 0) {
                // Ask the user for homework grade
                System.out.print ("Enter your HOMEWORK grade: ");
                HW = scanner.nextDouble();
                // Do input validation
                if (HW < 0 || HW > 100) {
                    // Show the error message
                    System.out.println("[ERR] Invalid input. A homework grade should be in [0, 100].");
                } else {
                    // Update the loop variable
                    i++;
                }   
            }

            if (i == 1){
                //Ask the user for midterm gade
                System.out.print("Enter your MIDTERM EXAM grade: ");
                midterm = scanner.nextDouble();
                //Do input validation
                if (midterm < 0 || midterm > 100){
                    //Show the error message
                    System.out.println("[ERR] Invalid input. A midterm gade should be in [0,100].");
                }else{
                    //update the loop variable
                    i++;
                }
            }

            if (i == 2){
                //Ask the user for the final grade
                System.out.print("[ERR] Enter your FINAL EXAM grade: ");
                finalExam = scanner.nextDouble();
                //Do input validation
                if (finalExam < 0 || finalExam > 200){
                    //Show the error message
                    System.out.println("Invalid input. A final grade should be in [0, 200].");
                }else {
                    //update the loop variable
                    i++;
                }
            }

        }

        // Calculate the weighted total by the formula showed in the PDF
    
        double weighted_total = (finalExam/200*50)+(midterm*0.25)+(HW*0.25);

        // Show the weighted total and tell the user s/he passed or not
        System.out.printf("[INFO] Student's Weighted Total is %.2f\n", weighted_total);
        
        if (weighted_total >= 50) {
            System.out.println("[INFO] Student PASSED the class");
        } else {
            System.out.println("[INFO] Student FAILED the class");
        }

        scanner.close();

    }  // End of main
}  // End of class
