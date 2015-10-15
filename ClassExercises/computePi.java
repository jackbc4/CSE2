import java.util.Scanner;

public class computePi {
    
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter the number of times to run this loop: ");
        double x = myScanner.nextDouble();
        double n = 0;
        double i = 1;
        double z;
        while(i<=x){
            z = 1/i;
            n = n + z;
            i = i + 2;
            z = 1/i;
            n = n - z;
            i = i + 2;
    }
    double y = 4 * n;
    System.out.println("The calculated value of pi is: "+y);
    double p = Math.PI;
    double q = y - p;
    double r = (q/p)*100;
    System.out.println("The % difference from the true value is: "+r);
}
}
