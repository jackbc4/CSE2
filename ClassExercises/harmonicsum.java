import java.util.Scanner;

public class harmonicsum {
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the number of times to run the loop ");
        double n = myScanner.nextDouble();
        double sum = 0;
        double i;
        double x = 1;
        double y;
        double sum2 = 0;
        for(i=1;i<n;i++){
            x = (1/(i));
            y = (1/(n-i));
            sum = sum + x;
            sum2 = sum2 + y;
        }
        System.out.println("When calculated left to right the sum is: "+sum);
        System.out.println("When calculated right to left the sum is:"+sum2);
        double dif = sum2 - sum;
        System.out.println("The difference between the two sums is"+dif);
        double z = 1/dif;
        System.out.println(z);
    }
}