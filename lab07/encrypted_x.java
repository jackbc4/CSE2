//Jack Circus
//lab07
//print an x in a given size

//import scanner
import java.util.Scanner;

//create class
public class encrypted_x {
    
    //main method
    public static void main(String args[]){
        
        //create a new scanner
        Scanner myScanner = new Scanner(System.in);
        
        //prompt user for their input and store as n
        System.out.print("Enter the number of rows you wish to print: ");
        int n = myScanner.nextInt();
        //add 1 to value of n, because the loop prints one too few lines without it
        n = n+1;
        
        //alert user if n is out of range
        if (n<1 || n > 101){
            System.out.print("Your input is not within the accepted range (0-100)");
            System.exit(-1);
            }
          
          //Prints n lines
            for(int i = 1; i < n; i++){
                //run a loop for each line that is i digits long
                for(int j = 1; j <  n; j++){
                  
                    //print a space if j is equal to i, the row number, or n-i
                    if (j == i || j == n-i){
                        System.out.print(" ");
                    }
                    //print a * for all other values of j
                    else{
                    System.out.print("*");
                    }
                  
                }
               
                //move to a new line at end of loop
                   System.out.println("");  
                }
               
            }
    }
