//Jack Circus
//lab08
//find the mean and median of 10 numbers

//import scanner
//import array utility
import java.util.Arrays;
import java.util.Scanner;
 
//create public class
public class lab08 {
    //declare variables used throughout
    static int numArray[] = new int[10];
    static int sum=0;
    static double avg=0;
    static double median=0;
 
 //create main method
    public static void main(String args[]) {
        //filling the array
        for(int i=0 ; i<numArray.length ; i++){
            System.out.print("Enter a number : ");
            Scanner scan = new Scanner(System.in);
            numArray[i] = scan.nextInt();
        }
        //calculating the sum
        for(int num : numArray){
            sum +=num;
        }
    //call the other methods
        avg(sum);
        median(numArray);
        printResults(avg,median);
    }
    //this method will calculate the average and return that value
    public static double avg(int sum){
        avg = (double)sum/10;
        return avg;
    }
    //this method will calculate the median and return the value
    public static double median(int numArray[]){
        //sort the array from least to greatest
        Arrays.sort(numArray);
        //take the average of the two middle values
        median = (numArray[4]+numArray[5])/2;
        return median;
    }
    //this method will print the results
    public static void printResults(double avg, double median){
        System.out.println("The mean of these number is: "+avg);
        System.out.println("The median of these  numbers is: "+median);
    }
}
