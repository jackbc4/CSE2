//Lab 6
//Jack Circus
//CSE 002
//calculate the total pay for any number of workers with varying wages in one week



//create a scanner
import java.util.Scanner;
 
 //create class
public class timeSheets {
    
    //start main method
    public static void main(String[] args){
         //create new scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for number of works and store value
        System.out.print("Enter the number of workers: ");
        int workers = myScanner.nextInt();
        
        //initialize variable for cents and set initial value for total
        float cents;
        float total = 0;
        
        //Start a for loop from 1 to the number of workers previously entered
        for (int i = 1; i<= workers; i++) {
            
            //prompt for the salary of the first worker in cents and store value
            System.out.print("Enter this worker's salary in cents: ");
            cents = myScanner.nextFloat();
            
            //prompt for the number of hours worked monday and store value
            System.out.print("Enter how many hours they worked on monday: ");
            int mon = myScanner.nextInt();
        
            //prompt for the number of hours worked tuesday and store value
            System.out.print("Enter how many hours they worked on tuesday: ");
            int tue = myScanner.nextInt();
            
            //prompt for the number of hours worked wednesday and store value
            System.out.print("Enter how many hours they worked on wednesday: ");
            int wed = myScanner.nextInt();
            
            //prompt for the number of hours worked thursday and store value
            System.out.print("Enter how many hours they worked on thursday: ");
            int thurs = myScanner.nextInt();
            
            //prompt for the number of hours worked friday and store value
            System.out.print("Enter how many hours they worked on friday: ");
            int fri = myScanner.nextInt();
            
            //sum the total hours worked this week
            int hours = mon + tue + wed + thurs + fri;
            
            //convert the stored wage to dollars
            float wage = cents / 100;
            
            //calculate total pay for this worker during the week
            float pay = wage * hours;
            
            //add this workers pay to the total for all workers this week
             total = total + pay;
        }
        
        //After the for loop ends, print the total pay for all workers this week
        System.out.printf("The total payroll for this week was: $%2.2f \n", total);
    }
}