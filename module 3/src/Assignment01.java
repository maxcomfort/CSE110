// CSE 110     : 14869 / Online
// Assignment  : 01
// Author      : Max Comfort / 1219098192
// Description : A pizza program to determine the number of slices 
//               distributed between adults and children

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {  

        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);
        
        // declare and initialize variables
       int pizzas; //user enters number of pizza
       int slices; //user enters number of slices
       int adults; //user enter number of adults
       int children; //user enters number of children
        
        // prompt for and collect inputs
        System.out.print("Nmber of pizzas purchased  : ");
        pizzas = in.nextInt();

        System.out.print("Number of slices per pizza : ");
        slices = in.nextInt();

        System.out.print("Number of adults           : ");
        adults = in.nextInt();

        System.out.print("Number of children         : ");
        children = in.nextInt();
        
        // compute required values
        int totalSlices = pizzas * slices; //equation for total number of slices
        int totalAdultSlices = adults * 2; //equation for caluclating number of slices per adult
        int totalChildSlices = totalSlices - totalAdultSlices; //equation for calculating total number of slices for childre
        int slicesPerChild = totalChildSlices / children; //equation for calculating slices per child
        int remainderSlices = totalChildSlices % children; //equation for calculating the slices left over

        // display required outputs
       System.out.println("\nTotal number of slices of pizza               : " + totalSlices);
       System.out.println("Total nume of slices given to adults          : " + totalAdultSlices);
       System.out.println("Total number of slices available for children : " + totalChildSlices);
       System.out.println("Number of slices each child will get          : " + slicesPerChild);
       System.out.println("Number of slices left over                    : " + remainderSlices);

    }
}
