import java.util.Arrays;
import java.util.Scanner;
 
public class TEST {
    static int numArray[] = new int[10];
    static int sum=0;
    static double avg=0;
    static int median=0;
 
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
        System.out.println(sum);
        //calculating the average
        avg = (double)sum/numArray.length;
        System.out.println(avg);
        //calculating the median
        Arrays.sort(numArray);//we sort the numArray
        median = numArray[4];//!\the first element of an array is at the index 0.
        System.out.println(median);
    }