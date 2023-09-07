// CSE 110     : 14869 / Online
// Assignment  : 05
// Author      : Max Comfort & 1219098192
// Description : A program that runs different static methods
//               to display the student's skills

public class Assignment05 {

    public static void main(String[] args) {
        // Codes below will test your methods:
        displayGreeting();
        displayText("test");
        printTotal(1,2,3);
        int total = getTotal(1,2,3);
        System.out.println(total);
        double average= getAverage(1,2,3);
        System.out.println(average);
        average= averageLength("test","test21", "testtest");
        System.out.println(average);
        int shortest = lengthOfShortest("test","test21");
        System.out.println(shortest);
        String stars=stringOfStars("test");
         System.out.println(stars);
        stars=maxStringOfStars("test","test21");
        System.out.println(stars);
        stars=midStringOfStars("test","test21", "testtest");
        System.out.println(stars);

    }
    
    // 1) Write (define) a static method named displayGreeting, 
    //  that takes no arguments and returns no value. 
    //  When this function is called, it should print the text "Hello, and welcome!".
    public static void displayGreeting(){
        System.out.println("Hello, and welcome!");
    }
    
    //2) Write (define) a static method named displayText, 
    //  that takes a single String argument and returns no value. 
    //  When this function is called, it should print the value of the argument that was passed to it.
    
    public static void displayText(String str){
        System.out.println(str);
    }
    
    //3) Write (define) a static method named printTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should print the sum of the three arguments passed to it. 
    //  This function should return no value.
    
    public static void printTotal(int num1, int num2, int num3){
        int total = num1 + num2 + num3; //equation for adding a sum of 3 integers
        System.out.println(total);
    }
    
    //4) Write (define) a static method named getTotal, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the sum 
    //  of the three arguments passed to it as an int.

    public static int getTotal(int num1, int num2, int num3){
        int sum = (num1 + num2 + num3); //equation for adding a sum of 3 integers
        return sum;
    }
    
    
    //5) Write (define) a static method named getAverage, 
    //  that takes three int arguments. 
    //  When this function is called, it should return the average 
    //  of the three arguments passed to it as a double.
    
    public static double getAverage(int num1, int num2, int num3){
        double average = (num1 + num2 + num3) / 3.0; //equation for getting the average of 3 integers
        return average;
    }
    
    //6) Write (define) a static method named averageLength, 
    //  that takes three String arguments. 
    //  When this function is called, it should return the average length (number of characters) 
    //  of the String arguments passed to it as a double.
    
    public static double averageLength(String str1, String str2, String str3){
        double avgLength = (str1.length() + str2.length() + str3.length()) / 3.0; //equation for getthing the average length of 3 strings
        return avgLength;
    }
    
    //7) Write (define) a static method named lengthOfShortest, 
    //  that takes two String arguments. When this function is called, 
    //  it should return the length (number of characters) 
    //  of the shortest String argument passed to it as an int.

    public static int lengthOfShortest(String str1, String str2){
        if (str1.length() > str2.length()){ //comparing the length of 2 strings
            return str2.length();
        }else if (str1.length() < str2.length()){
            return str1.length();
        }else {
            return 0;
        }
    }
    
    
    //8) Write (define) a static method named stringOfStars, 
    //  that takes one String argument.
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the string argument passed to it.
    
    public static String stringOfStars(String str1){
       String result = "";
       
        for (int i = 0; i < str1.length(); i++){ //printhing "*" for each character of the string
            result += "*";
        }

        return result;
    }
    
    //9) Write (define) a static method named maxStringOfStars, 
    //  that takes two String arguments. 
    //  When this function is called, it should return a String of asterisks (*) 
    //  that is the same length as the longest string argument passed to it.
    
    public static String maxStringOfStars(String str1, String str2){
       String result = "";
       String sameLength = "Strings are equal";
       int l1 = str1.length();
       int l2 = str2.length();

        if (l1 > l2){                     //comparing if length of string 1 is greather than string 2
            for (int i = 0; i < l1; i++){ //printhing "*" for each character of the string
                result += "*";
            }
        }
        else if (l1 < l2){               //comparing if length of string 2 is greater than string 1
            for (int i =0; i < l2; i++){ //printhing "*" for each character of the string
                result += "*";
            }
        }  
        else if(l1 == l2){              //if strings are equal length
            return sameLength;
        }
        
        return result;
    }
    
    //10) Write (define) a static method named midStringOfStars, 
    //   that takes three String arguments. 
    //   When this function is called, it should return a String of asterisks (*) 
    //   that is the same length as the string argument with the length 
    //   that would be in the middle if the lengths of the arguments were arranged in ascending order.

    public static String midStringOfStars(String str1, String str2, String str3){
        String result = "";
        int l1 = str1.length();
        int l2 = str2.length();
        int l3 = str3.length();

        
        if ((l1 < l2 && l2 < l3) || (l3 < l2 && l2 < l1)){ //comparing if string 2 is the middle length of the 3 strings
            for(int i=0; i < l2; i++){                     //printhing "*" for each character of the string
                result += "*";
            }
        }
        else if ((l2 < l1 && l1 < l3) || (l3 < l1 && l1 < l2)){ //comparing if string 1 is the middle length of 3 strings
            for(int i =0; i < l1; i++){                         //printhing "*" for each character of the string
                result += "*";
            }
        }else {                                                 //else if string 3 is the middle length of the 3 strings
            for(int i =0; i < l3; i++){                         ////printhing "*" for each character of the string
                result += "*";
            }
        }
            return result;
    }


}
