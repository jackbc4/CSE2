//Jack Circus
//lab10
//manipulating arrays

//import scanner
import java.util.Scanner;

//create public class
public class lab10 {
   
    //main method
    public static void main(String args[]){
        
        //initialize sum variable and set to 0
        int sum = 0;
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt user for number of digits in array and store as n
        System.out.print("Enter the amount of numbers in your array: ");
        int n = scan.nextInt();
        
        //create an array with n integers
        int[] arr;
        arr = new int[n];
        
        //use for loop to store a random int from 0 to 100 in each position of the array
        for (int i =0; i<n; i++){
            arr[i] = (int)(Math.random() * 100);
        }
        
        //use for loop to print each number in the array
        for (int i = 0; i<n; i++){
            System.out.println(arr[i]);
        }
        
        //use for loop to calculate the sum of the digits in the array
        for (int i = 0; i<n; i++){
            sum = arr[i] + sum;
        }
        
        //print the sum
        System.out.println("The sum of these numbers is: "+sum);
        
        //calculate and print the average
        double avg = sum / n;
        System.out.println("The average of these numbers is: "+avg);
        
        //use a for loop to print only the number above the average
        for (int i = 0; i<n; i++){
            //if statement checks if the numbers are greater than the average
            if (arr[i] >= avg){
                System.out.println(arr[i]);
            }
        }
    }
}
            
        
        