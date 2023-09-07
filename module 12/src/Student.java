/*-------------------------------------------------------------
// AUTHOR: Max Comfort
// FILENAME: Student.java
// SPECIFICATION: Student class for Lab8. 
//-----------------------------------------------------------*/

public class Student {
        // Instance variables
        //private String fistName, lastName;
        private String fullName, asuID;
        private double grade;
        private int numOfUpdates, numOfAccessed;
        
        // default constructor. Setting variables to default values
        public Student() {
                fullName = "null";
                asuID = "null";
                grade = -1.0;
            }

            // constructor with parameters
            public Student(String fullName, String asuID, double grade) {
                // firstName = fname;
                // lastName = lname;
                this.fullName = fullName;
                this.asuID = asuID;
                this.grade = grade; 
                // variables for tracking the class
                numOfUpdates = 0;
                numOfAccessed = 0;
            } 
        
            // getter methods
           /* public String getFirstName(){
                
                numOfAccessed++;
                return firstName;
            }
        
            public String getLastName() {
                
                numOfAccessed++;
                return lastName;
            } */
        
            public String getFullname() {
                numOfAccessed++;
                return fullName;
            }
        
            public String getAsuID() {
                numOfAccessed++;
                return asuID;
            }
        
            public double getGrade() {
                numOfAccessed++;
                return grade;
            }

            public int getNumOfUpdates() {
                numOfAccessed++;
                return this.numOfUpdates;
                
            }
            public int getNumOfAccessed() {
                numOfAccessed++;
                return this.numOfAccessed;
            }
        
            // setter methods
            public void setName(String sfullName) {
                this.fullName = sfullName;
                numOfUpdates++;
            }

            public void setId(String sAsuID) {
                this.asuID = sAsuID;
                numOfUpdates++;
            }
        
            public void setGrade(double sGrade) {
                this.grade = sGrade;
                numOfUpdates++;
            }

            // To provide String version of the object
            public String toString() {
                return String.format("[Name: %s, ASUID: %s, Grade: %.2f]", fullName, asuID, grade);
            }
        
            //equals method to compare the objects
            public boolean equals(Student other) {
                numOfAccessed++;
                if(this.getAsuID() == other.getAsuID())
                {
                    return true;
                }
                else if(this.getFullname().toLowerCase().equals(other.getFullname().toLowerCase()))
                {
                    return true;
                }
                else{
                    return false;
                }
                    
            }
        
        }
