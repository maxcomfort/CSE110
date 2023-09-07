/*-------------------------------------------------------------
// AUTHOR: Max Comfort
// FILENAME: Lab6.java
// SPECIFICATION: A program that can help the user key in records for a group of students
// FOR: CSE 110- Lab #6
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/
import java.util.Arrays;
import java.util.Scanner;

public class Lab6 {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       int numStudents = -1;
       int[] studentGroups = null;//arrays are objects
       double[] studentGrades = null;
       int numGroups = -1;  // Part 2
       
       //ask for number of students
        System.out.println("How many students do you have?");
        numStudents = scanner.nextInt();

       //initalize the array based on user input
        studentGroups = new int[numStudents];
        studentGrades = new double[numStudents];
	  
        //complete the code here for part 1
        for(int i = 0; i < numStudents; i++){
            System.out.println("[Group #] and [Grade] for Entry " + (i+1));
            studentGroups[i] = scanner.nextInt();
            studentGrades[i] = scanner.nextDouble();

        }

        // Print out the records
       System.out.println("\n==== List of Student Records ====");

       for(int i = 0; i < numStudents; i++){
           System.out.println("Group " + studentGroups[i] + " - " + studentGrades[i] + " Points");
       }
       
        //Part 2: Find the number of groups
       /*Arrays.sort(studentGroups);
       Arrays.sort(studentGrades);
       int length = studentGroups.length;
       length = removeDuplicateElements(studentGroups, length);
       System.out.println("Length = " + length); //3
       for (int i = 0; i < length; i++){
           System.out.print(studentGroups[i]); // 1 2 3
       }
      
       if (length > numGroups)  {
               numGroups = length; //2
           }
       // The code below is only for Part 2
       double[] groupAverages = new double[numGroups + 1];  // Avoid group 0
       int[] groupSizes = new int[numGroups + 1];  // Avoid group 0 

       // For each student record,
       //   - find the group # and the grade, and
       //   - update groupAverages and groupSizes

       // Display the statistics of groups
       for(int i=0;i<numStudents;i++)
       {
           for(int j=0;j<numStudents;j++)
           {
               if(studentGroups[i] == j+1)
               {
                   groupSizes[j] = groupSizes[j] + 1;
                   groupAverages[j] = groupAverages[j] + studentGrades[i];
               }
           }
       }
       //display the statics of the groups
       System.out.println("\numStudents===== Group Statistics ======");
       for(int i=0;i<numStudents;i++){
           if(groupSizes[i]!=0){
               System.out.println("Group #"+(i+1)+" has "+groupSizes[i]+" students, average is "+(groupAverages[i]/groupSizes[i]));
            }
       
        }*/
     scanner.close();
    }//End of main

   /* public static int removeDuplicateElements(int[] arr, int n)
    {
        Arrays.sort(arr);
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        //Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }
    */

}//End of class
