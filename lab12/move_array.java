import java.util.Scanner;

public class move_array{
    static int m;
    static int n;
    
    //main method
    public static void main(String args[]){
      
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //use try catch statement to check if value is greater than 0
        try{
        //prompt user for size of the array and store as n
        System.out.print("Enter the size of the array: ");
        n = scan.nextInt();
        
        //create array arr with size n
        int[] arr = new int[n];
        }
        //catch if n is negative
        catch(NegativeArraySizeException e){
            //return error and ask for new number
            System.out.println("The number must be greater than 0. Enter a new one: ");
            n = scan.nextInt();
        }
        
        //initialize array
        int[] arr = new int[n];
        
        //create random values for arr between 0 and 100
        for (int i=0; i<n; i++){
            arr[i] = (int)(Math.random()*100);
        }
         
        //use try catch to check if value of index is valid 
        try{
            //prompt user for index value and store as m
        System.out.print("Enter the value of the index to be moved: ");
        m = scan.nextInt();
        arr[m] = 1;
        }
        //if the index number is out of bounds return error and prompt for new index
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("This number is out of bounds. Try again: ");
            m = scan.nextInt();
        }
        
        //initialize x
        int x;
        
        //print the array values before rearranging
        for( x = 0; x<n; x++){
                System.out.print(" "+arr[x]);
            }
            System.out.println();
        
        //create temporary variable for index value of arr        
        int y = arr[m];
        
        //shift the values from index to one over
        for (int i=m; i<n-1; i++){
            
            arr[i] = arr[i+1];
            
        }
        
        //move index value of arr to the end
        arr[n-1] = y;
       
       //print the array after rearranging
        for( x = 0; x<n; x++){
                System.out.print(" "+arr[x]);
            }
            System.out.println();
    }
}

     