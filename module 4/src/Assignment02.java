// CSE 110     : 14869 / Online
// Assignment  : 02
// Author      : Max Comfort & 1219098192
// Description : A program to determine material needs and costs for
//               Rosie's Road Co.

import java.util.Scanner;

public class Assignment02 {
    
    public static void main(String[] args) {
        // declare and instantiate a Scanner
        Scanner in = new Scanner(System.in);

        // declare and initialize variables
       double roadLength;
       int numLanes;
       int asphaltDepth;
       int daysToComp;
        
        // collect inputs
       System.out.print ("Length of road project (miles) : ");
       roadLength = in.nextDouble();

       System.out.print("Number of lanes                : ");
       numLanes = in.nextInt();
       
       System.out.print("Depth of asphalt (inches)      : ");
       asphaltDepth = in.nextInt();

       System.out.print("Days to complete project       : ");
       daysToComp = in.nextInt();

        
        // compute required values
        double cubftAsphalt = (roadLength * 5280.0) * (asphaltDepth / 12.0) * (numLanes * 12.0);
        double asphaltWeight = cubftAsphalt * 150.0;
        int truckloads  = (int)Math.ceil(asphaltWeight / 10000.0);
        double ashphaltCost = (truckloads * 5.0) * 200.0;
        int intersections = (int)roadLength / 1;
        int stoplights = (intersections * 2) + (numLanes * intersections);
        double stoplightsCost = stoplights * 25000.0;
        int conduitPipes = (int)Math.ceil((roadLength * 5280.0) / 24.0);
        double conduitPipesCost = conduitPipes * 500.0;
        int crewMembers = (int)Math.ceil((50.0 * roadLength * numLanes) / daysToComp);
        Double laborCost = (double)crewMembers * daysToComp * 200.0;
        Double totalCost = ashphaltCost + stoplightsCost + conduitPipesCost + laborCost;
        
        // display results
         System.out.println("\n=== Amount of materials needed ===");
         System.out.println("Truckloads of Asphalt  : " + truckloads);
         System.out.println("Stoplights             : " + stoplights);
         System.out.println("Conduit pipes          : " + conduitPipes);
         System.out.println("Crew members needed    : " + crewMembers);
         System.out.println("\n=== Cost of Materials ============");
         System.out.printf("Cost of Asphalt        : $%.2f", ashphaltCost);
         System.out.printf("\nCost of Stoplights     : $%.2f", stoplightsCost);
         System.out.printf("\nCost of Conduit pipes  : $%.2f", conduitPipesCost);
         System.out.printf("\nCost of Labor          : $%.2f", laborCost);
         System.out.println("\n=== Total Cost of Project ========");
         System.out.printf("Total cos of project   : $%.2f\n", totalCost);


        in.close();

    }//End of main

}//End of class
