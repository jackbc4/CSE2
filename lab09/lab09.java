//Jack Circus
//lab09
//Coin flipping/ overloading methods

//import scanner
import java.util.Scanner;

//create public class
public class lab09 {
    //create static variables for # of heads and # of tails
    static int heads=0;
    static int tails=0;
    
    
    //main method
    public static void main(String args[]){
    //create scanner and prompt user for int between 0 and 100
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter an integer between 0 and 100: ");
    int n = scan.nextInt();
    
    //if the number is within the range and not 1, call the flip(n) method
     if (n<=100 && n>0){
     flip(n);
     }
     //of the user enters 0, call the flip() method
     if(n==0){
         flip();
         //print the results of this method
     System.out.println("Head " +heads);
     System.out.println("Tail " +tails);
    }
    
    //if the number is out of range, end the program
    if(n>100 || n<0){
        System.out.println("Invalid input");
    }
    }
    
    //flip method that will generate either a heads or tails result randomly
    public static int flip(){
        //generate a random number between 0 and 1
        double x = Math.random();
        //if this number is greater or equal to .5, heads
        if(x<=.5){
            //increase number of heads by 1 and return the value
            heads = heads + 1;
            return heads;
        }
        //otherwise, tails
        else{
            //increase number of tails by 1 and return the value
            tails = tails + 1;
            return tails;
        }
     
        }
        
        //flip(n) method 
        public static void flip(int n){
            //create int i for the while loop counter
            int i = 0;
            //the loop will run n times
            while (i < n){
                //call the flip() method, generating either heads or tails and incrementing the counter for each
                flip();
                //increase i by 1
                i++;
            }
            //print the results of flipping n coins
            System.out.println("Heads: " +heads);
            System.out.println("Tails: " +tails);
        }
    }
    