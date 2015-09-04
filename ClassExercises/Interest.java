public class Interest{
    
//  add main method
    public static void main(String[] args) {
        int balance = 25000;
        double interest = .04;
        int end = (int)(balance * (1+interest));
        System.out.print("The final balance of the bank account is ");
        System.out.println(end);
    }
    
}