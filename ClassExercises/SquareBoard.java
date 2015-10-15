import java.util.Scanner;

public class SquareBoard {
    public static void main(String args[]){
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter n for your square: ");
        int n = myScanner.nextInt();
        int i;
        int j;
        for (i = 1; i <= n; i++){
            
            for (j = 1; j <= n; j++){
                System.out.print("# ");
        }
        System.out.println();
        
    }
}
}