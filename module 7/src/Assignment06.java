// CSE 110     : 14869 / Online
// Assignment  : 06
// Author      : Max Comfort & 1219098192
// Description : A program that runs ten array methods
//               to display the student's skills

import java.util.Arrays;

public class Assignment06 {

    public static void main(String[] args) {
        // Write any code here that you may wish to test your methods defined below.
        int[] myArray = {1, 22, 333, 400, 5005, 9};
        printArray(myArray, ", ");
        printArray(myArray, " - ");
        getFirst(myArray);
        getLast(myArray);
        getAllButFirst(myArray);
        getIndexOfMin(myArray);
        getIndexOfMax(myArray);
        swapByIndex(myArray, 1, 4);
        removeAtIndex(myArray, 3);
        insertAtIndex(myArray, 2, 777);
        isSorted(myArray);
    }//end of main
    
    // 1) Write a public static method named printArray, 
    //   that takes two arguments. The first argument is an Array of int 
    //   and the second argument is a String. The method should print out 
    //   a list of the values in the array, each separated by the value of the second argument.
    
    public static void printArray(int[] arr, String str){
        for(int i = 0; i < arr.length - 1; i++){
            System.out.print(arr[i] + str);
        }
        System.out.println(arr[arr.length-1]);
    }//end of method 1
    
    // 2) Write a public static method named getFirst, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the first element of the array.
    public static int getFirst(int[] arr){
        int firstEle = arr[0];
       
        return firstEle;
    }// end of method 2
    
    // 3) Write a public static method named getLast, 
    //    that takes an Array of int as an argument and returns 
    //    the value of the last element of the array.
    public static int getLast(int[] arr){
        int i = arr.length - 1;
        int lastEle = arr[i];
        
        return lastEle;
    } //end of method 3
    
    // 4) Write a public static method named getAllButFirst, 
    //    that takes an Array of int as an argument and creates and returns 
    //    a new array with all of the values in the argument array except the first value.
    public static int[] getAllButFirst(int[] arr){
        int[] minus1stEle = new int[arr.length - 1];
       
        for(int i = 1; i < arr.length; i++){
            minus1stEle[i - 1] = arr[i];
        }
        return minus1stEle;
    }//end of method 4
    
    // 5) Write a public static method named getIndexOfMin, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the least value in the array.
    public static int getIndexOfMin(int[] arr){
        int min = arr[0];
        int index = 0;

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min=arr[i];
                index = i;
            }
        }
        return index;
    }//end of method 5
    
    // 6) Write a public static method named getIndexOfMax, 
    //    that takes an Array of int as an argument and returns 
    //    the index of the largest value in the array.
    public static int getIndexOfMax(int[] arr){
        int max = arr[0];
        int index = 0;
        
        for(int i=1; i < arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }// end of method 6
    
    
    // 7) Write a public static method named swapByIndex, 
    //    that takes three arguments. The first argument is an Array of int, 
    //    and the second and third arguments are int indexes. 
    //    This method will swap the values at the two given index arguments 
    //    in the array, and return a reference to the array.

    public static int[] swapByIndex(int[] arr, int index1, int index2){
        int temp = arr[index1];

        arr[index1]=arr[index2];
        arr[index2]=temp;

        return arr;
    }// end of method 7
    
    //8) Write a public static method named removeAtIndex, 
    //  that takes two arguments. The first argument is an Array of int, 
    //  and the second argument is an int index. This method create and return 
    //  a new array with all of the values in the argument array 
    //  except the value at the argument index.
    
    public static int[] removeAtIndex(int[] arr, int index){

        int[] minusIndexArray = new int[arr.length - 1];

        for (int i = 0, j = 0; i < arr.length; i++) {

            if (i == index) {
            continue;
            }

        minusIndexArray[j++] = arr[i];
         }

        return minusIndexArray;
    }//end of method 8
    
    //9) Write a public static method named insertAtIndex, 
    //   that takes three arguments. The first argument is an Array of int, 
    //   the second argument is an int index, and the third argument is an int value. 
    //   This method create and return a new array with all of the values 
    //   in the argument array and including the third argument value 
    //   inserted at the index specified by the second argument value.
    public static int[] insertAtIndex(int[] arr, int index, int element){

        int[] newArray = new int[arr.length + 1];

        for (int i = 0, k=0;k < arr.length+1; k++) {

            if (k == index) {
            newArray[k]=element;
            continue;
            }   

        newArray[k] = arr[i++];
        }

        return newArray;
    }//end of method 9
    
    //10) Write a public static method named isSorted, 
    //    that takes an Array of int as an argument. 
    //    This method should return the boolean value true 
    //    if all the element values in the array are in ascending order; 
    //    otherwise the method should return the boolean value false.
    
    public static boolean isSorted(int[] arr){

        for(int i=0; i<arr.length-1;i++){

            if (arr[i+1]<arr[i]){
                return false;
            }
        }

        return true;
    }//end of method 10

}//end of class
