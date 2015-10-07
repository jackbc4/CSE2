//Homework 6
//Jack Circus
//CSE 002
//print a pyramid with given height/width



//create a scanner
import java.util.Scanner;
 
 //create class
public class pyramid {
    
    //start main method
    public static void main(String[] args){
         //create new scanner
        Scanner myScanner = new Scanner(System.in);
        
        //create all variables used in following for loops
        int i = 0;
        int n=0;
        int y=0;
        int x;
        int z = 1;
        
        
        //Prompt user for the size of the pyramid and store as integer
        System.out.print("Enter the height of the pyramid: ");
        int height = myScanner.nextInt();
        
        //Create a for loop that runs as many times as the number entered by user
        for (i=0; i<height; i++){
            //y is equal to the number of blank spaces needed before the first *
                 
                 y=height-i;
                 
                 //run a for loop to print y spaces
             for (x=0; x<y; x++){
                    System.out.print(" ");
             }
             
             //run a for loop to print i * per each line, i increases each time the outer for loop runs
            for (n=0;n<z;n++){
                System.out.print("*");
            }
            //increase z by 2, z is the number of * printed per line
            z = z + 2;
            //print a new line after each row of the pyramid
            System.out.println();
        }
        
    }
}
