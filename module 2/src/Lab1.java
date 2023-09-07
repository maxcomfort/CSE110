/*--------------------------------------------------------
// AUTHOR: Max Comfort
//FILENAME: Lab1.java
//SPECIFICATION: Averaging 3 test scores
//FOR: CSE 110- Lab #1
//TIME SPENT: 20 minutes
-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab1
{
	public static void main(String[] args) 
	{
		int test1, test2, test3; //test variables
		final double NUM_TESTS = 3; //number of test constant
		double avgerage; //average value
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the score on the first test: "); //prompt
		test1 = input.nextInt(); //read in the next integer
	
		System.out.print("Enter the score on the second test: "); //prompt
		test2 = input.nextInt(); //read in the next integer
		
		System.out.print("Enter the score on the third test: "); //prompt
		test3 = input.nextInt(); //read in the next integer
		
		avgerage = (test1 + test2 + test3) / (double) NUM_TESTS; //equation for average test score
		System.out.println("Your average score is: " + avgerage); //print average test score
		
	}
}
