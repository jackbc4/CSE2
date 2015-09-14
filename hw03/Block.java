//Jack Circus
//block.java hw03
//Using user inputs

//import the scanner class
import java.util.Scanner;

public class Block {
    //main method required for every Java program
    public static void main(String[] args) {
         //create a new scanner instane
        Scanner myScanner = new Scanner( System.in);
        
        //prompt user for length of block and store as length variable
        System.out.print("Enter the length of the block: ");
        double length = myScanner.nextDouble();
        
        //prompt user for width of block and store as width variable
        System.out.print("Enter the width of the block: ");
        double width = myScanner.nextDouble();
        
        //prompt user for height of block and store as height variable
        System.out.print("Enter the height of the block: ");
        double height = myScanner.nextDouble();

        //create volume variable and set equal to height x width x length
        double volume = height * length * width;
        
        //calculate surface area of each pair of sides
        double sa1 = 2 * width * height;
        double sa2 = 2 * width * length;
        double sa3 = 2 * height * length;
        
        //calculate total surface area by adding up 3 pairs of surface areas
        double sa = sa1 + sa2 + sa3;
        
        //print out the volume and surface area of the block
        System.out.println("The volume of the block of dimensions "+length+" x "+width+" x "+height+" is "+volume);
        System.out.println("The surface area of the block is "+sa);
    }
    
}