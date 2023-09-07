/*-------------------------------------------------------------
// AUTHOR: Max Comfort
// FILENAME: Student.java
// SPECIFICATION: Student class for Lab7. 
//-----------------------------------------------------------*/
public class Student {
    private String firstName, lastName, fullName, asuID;
    private double grade;

    public Student(String firstName, String lastName, String asuID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = firstName + " " + lastName;
        this.asuID = asuID;
        this.grade= -1.0; //sets intial grade to -1
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFullName(){
        return fullName;
    }

    public String getAsuID(){
        return asuID;
    }

    public double getGrade(){
        return grade;
    }

    public void setGrade(double newGrade){
        this.grade = newGrade;
    }

    public String toString() {
        return String.format("Student: %s, ASUID: %s, Grade: %s", 
        fullName, asuID, grade);
    }
}
