import java.util.Scanner;

public class checknum {
    
    public static void main(String[] args){
        int n;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        while (true){
            if (scan.hasNextInt()){
                break;
                
            }
            System.out.println("try again ");
        scan.next();
        }
        n = scan.nextInt();
        System.out.println(n);
    }
}
