//Jack Circus
//hw09
//calculate areas using overloading

//import scanner
import java.util.Scanner;

//create public class
public class areas {
    //create static variables for area of shape
   static double area; 
    
    //main method
    public static void main(String args[]){
        
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //create variable to control while loop
        int x = 0;
        
        //while loop will repeat program until x is changed
        while (x == 0){
            
            //prompt user for an integer to determine the shape the will use and store as variable shape
        System.out.print("Enter 1 for circle, 2 for rectangle, 3 for trapezoid, or 4 to exit program: ");
        int shape = scan.nextInt();
        
        //if the shape is 1, find area of circle
        if (shape == 1){
            //prompt user for radius of circle and store as a
            System.out.print("Enter the radius of the circle: ");
            double a = scan.nextDouble();
            
            //call the area method with double a
            area(a);
            
            //Print the result of running method area
            System.out.println("The area of this shape is: "+area);
        }
        
        //if the shape is 2, find area of rectangle
        if (shape == 2){
            
            //prompt user for width and height of rectanble and store as a and b
            System.out.print("Enter the width of the rectangle: ");
            double a = scan.nextDouble();
            System.out.print("Enter the height of the rectangle: ");
            double b = scan.nextDouble();
            
            //call method area with both a and b
            area(a, b);
            
            //print the result of area(a, b)
            System.out.println("The area of this shape is: "+area);
        }
        
        //if the shape is 3, find area of trapezoid
        if (shape == 3){
            
            //prompt user for height, base 1, base 2 and store as a, b, c
            System.out.print("Enter the height of the trapezoid: ");
            double a = scan.nextDouble();
            System.out.print("Enter base 1 of the trapezoid: ");
            double b = scan.nextDouble();
            System.out.print("Enter base 2 of the trapezoid: ");
            double c = scan.nextDouble();
            
            //call area method with a, b,c
            area(a, b, c);
            
            //print the result
            System.out.println("The area of this shape is: "+area);
        }
        
        // shape is 4, increment x, ending the while loop
        if (shape == 4){
            x++;
            area = 0;
        }
        //if the shape is out of range, give error message
        if(shape > 4 || shape < 1){
            System.out.println("This input is invalid");
        }
        }
    }
    
    
    //calculate the area of circle if only one variable is given
    public static double area(double a) {
        area = Math.PI * (a * a);
        //return result
        return area;
    }
    
    //calculate the area of rectangle if two variables are given
    public static double area(double a, double b){
        area = a * b; 
        //return result
        return area;
    }
    
    //calculate area of trapezoid if 3 variables are given
    public static double area(double a, double b, double c){
        area = ((a+b)/2)*c;
        //return result
        return area;
    }
}