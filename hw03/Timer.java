//Jack Circus
//Homework #3
//Program 1

//Import scanner 
import java.util.Scanner;
 //create class
public class Timer {
    
    //start main method
    public static void main(String[] args){
        //create new scanner
        Scanner myScanner = new Scanner(System.in);
       
        //prompt user for first time
        //read user input and set it equal to ctime
        System.out.print("Enter the current time: ");
        int ctime = myScanner.nextInt();
        
        //prompt user for second time
        //reaad user input and set it equal ti dtime
        System.out.print("Enter the time that you will be eating dinner: ");
        int dtime = myScanner.nextInt(); 
        
        //convert ctime to hours (chour) and minutes (cmin)
        int chour = ctime / 100;
        int cmin = ctime % 100;
        
        //convert dtime to hours (dhour) and minutes (dmin)
        int dhour = dtime / 100;
        int dmin = dtime % 100;
        
        //create variables fmin fhour for final time
        //set fhour equal to difference of first two hours
        //set fmin equal to difference of first two minutes
        int fhour = dhour - chour;
        int fmin = dmin - cmin;
        
        //if the minutes are negative, decrease the hour by 1
        //set fmin equal to its absolute value
        //also the minutes are equal to 60 minus fmin
        if (fmin < 0) {
            fhour = fhour - 1;
            fmin = Math.abs(fmin);
            fmin = 60-fmin;
        }
        //set fmin equal to its absolute value
        fmin = Math.abs(fmin);
        
        //print the final result
        System.out.println("You have "+fhour+ " hours and "+fmin+" minutes remaining before dinnner.");
    }
}