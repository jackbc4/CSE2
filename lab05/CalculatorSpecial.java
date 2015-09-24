//Jack Circus
//Lab 05
//Use calculator program from last lab
//calculates addition, subtraction, multiplication, or division of two 
//user inputted numbers
//It will keep asking for new numbers until the user enters n or N


//Import scanner 
import java.util.Scanner;
 //create class
public class CalculatorSpecial {
    
    //start main method
    public static void main(String[] args){
         //create new scanner
        Scanner myScanner = new Scanner(System.in);
                
        //initiate x, which will determine if the while loop continues
        boolean x = false;
                
   //create a while loop that will run as long as x is false
    while (x == false){
        
        
        //prompt user for the first integer 
        System.out.print("Enter the first integer: ");
        //store first integer
        double first = myScanner.nextDouble();
        
        //prompt user for second integer
        System.out.print("Enter the second integer: ");
        //store second integer    
        double second = myScanner.nextDouble();
        
        //calculate sum of integer
        double add = first + second;
        //calculate difference of integers
        double subtract = first - second;
        //calculate first integer multiplied by second
        double mult = first * second;
        //calculate first integer divided by second
        double divide = first / second;
        
        //prompt user to select operator type
        System.out.print("Enter + to calculate a+b, - to calculate a-b, * to calculate a*b, or / to calculate a/b: ");
        //store operation variable
        String operation = myScanner.next();

        //switch statement
        //runs different lines based on value of operation
            switch(operation) {
                
                //if operation is +, add 
                case "+":;
                System.out.println("The sum of a and b is "+add);
                break; //break out of statement
                
                //if operation is -, subtract
                case "-":;
                System.out.println("a-b is equal to "+subtract);
                break; //break out of statement
                
                //if operation is *, multiply
                case "*":;
                System.out.println("a*b is equal to "+mult);
                break;//break out of statement
                
                //if operation is /, divide
                case "/":;
                System.out.println("a/b is equal to "+divide);
                break; //break out of statement
                
                //if none of the other variables, operation is invalid
                default: System.out.println("Invalid operator");
                break;
            }
           
        //Prompt user to enter n or N if they want to end program
        System.out.print("Enter n or N if you wish to stop program: ");
        //Store next user input as string Y
        String Y = myScanner.next();
    
        //check if Y equals n or N
        //If it does, make x true, this will end while loop
            if (Y.equals("n") || Y.equals("N")){
                x = true;
            }
    }
}
}

        