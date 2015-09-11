//Jack Circus
//check.java lab03
//Using user inputs

//import the scanner class
import java.util.Scanner;

public class Check {
    //main method required for every Java program
    public static void main(String[] args) {
        //create a new scanner instane
        Scanner myScanner = new Scanner( System.in);
        
        //prompt user for their input
        System.out.print("Enter the original cost of the check in the form xx.xx: ");
        
        //Create new variable and set it equal to user input
        double checkCost = myScanner.nextDouble();
        
        //Prompt the user for input
        System.out.print("Enter the percentage tip that you wish to pay as a whole number (in the form xx): ");
        
        //Create new variable and set it to user input
        double tipPercent = myScanner.nextDouble();
        
        //convert percentage to decimal value
        tipPercent /= 100;
      
        //Prompt user for input
        System.out.print("Enter the number of people who went out to dinner: ");
        
        //Create variable equal to user input
        int numPeople = myScanner.nextInt();
        
        double totalCost;
        double costPerPerson;
        int dollars, //whole dollar amount of cost
            dimes, pennies;
        totalCost = checkCost * (1 + tipPercent);
        costPerPerson = totalCost / numPeople;
        //get the whole amount, dropping decimal fraction
        dollars = (int)costPerPerson;
        //get dimes amonut, e.g.,
        //(int)(6.73*10)%10 => 67 % 10 => 7
        //where the % (mod) operator returns the remainder
        //after the division: 583%100 => 83 27%5 => 2
        dimes=(int)(costPerPerson*10)%10;
        pennies=(int)(costPerPerson*100)%10;
        System.out.println("Each person in the gorup owes $" +dollars + '.' + dimes + pennies);
    }
}