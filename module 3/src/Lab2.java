
/*------------------------------------------------------------- 
// AUTHOR: Max Comfort
// FILENAME: Lab2.java
// SPECIFICATION: String lab. User will enter first and last name
and Java will concentrate the strings to make a full name, make 
it upper case and count the length.
// FOR: CSE 110 - Lab #2
// TIME SPENT: 30
//-----------------------------------------------------------*/


// All imports has to be outside class
import java.util.Scanner;

// class name should match the file name
public class Lab2 {
    // we must have a main method to run the program
    public static void main(String[] args) {

        // declare variables of different types:
        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength = 0;
        Scanner scan = new Scanner(System.in);

        // Use Scanner to ask the user for first name
        System.out.print("Please enter first name: ");
        firstName = scan.nextLine();
        // Use Scanner to ask the user for last name
        System.out.print("Please enter last name: ");
        lastName = scan.nextLine();

        // Add firstName to lastName variables using "+" sign, don't forget the space.
        // store the result in the fullName variable
        fullName = (firstName + " " + lastName);

        // Convert fullName variable to upper case
        fullName = fullName.toUpperCase();
        // Find the length of fullName and store it
        nameLength = fullName.length();

        // Print fullName, it should be in upper case
        System.out.println("Full name (in capitals): " + fullName);
        // Print nameLength, this should be number of characters
        System.out.println("Length of full name: " + nameLength);

        // Define two String variables, title1 and title2 using String constructor to initialize them
        String title1 = new String("cse110");
        String title2 = "cse110";

        // Compare the two strings and print which one of the two ways works
        if (title1 == title2){
            System.out.println("String comparison using \"==\" sign works");
        }else {
            System.out.println("String comparsion using \"==\" sign does NOT work");
        }
        if (title1.equals(title2)){
            System.out.println("String comparison using \"equals\" method works");
        }else{
            System.out.println("String comparison using \"equals\" method does NOT work");
        }
    } //end main method
} //end Lab2 class