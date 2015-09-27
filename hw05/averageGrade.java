//Homework 5
//Jack Circus
//CSE 002
//Find the average of grades input by the user
//only stop prompting for more grades once 999 is entered


//create a scanner
import java.util.Scanner;
 
 //create class
public class averageGrade {
    
    //start main method
    public static void main(String[] args){
         //create new scanner
        Scanner myScanner = new Scanner(System.in);
        
        //create a variable for the grade inputs       
        int grade;
        //create a variable to tell the while loop when to stop
        int x = 0;
        //create a variable to count the number of grades
        int num = 0;
        //create a variable for the sum of all grades
        int total = 0;
        
        //start a while loop that runs while x = 0
        while (x == 0){
            
            //prompt user for a grade input
            System.out.print("Enter a grade (enter 999 to end program): ");
            //store user input as grade
            grade = myScanner.nextInt();
       
           //if grade is out of range, return an error message
               if (grade < 0 || grade > 100 && grade != 999){
                System.out.println("This is an invalid score");
               }
            
            //if grade is within range, add to the total and increment num by 1
                if (grade <= 100 && grade >=0){
                total = total + grade;
                num++;
                }
                
                
                //if the user inputs 999, set x=1
                //this will cause the while loop to end
                if (grade == 999){
                x = 1;
                }
                
            }
        
        //calculte and print the average grade by dividing total by num
        int average = total / num;
        System.out.println("The average grade is "+average);
}
}