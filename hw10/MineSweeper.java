import java.util.Scanner;

//create public class
public class MineSweeper {
   
    //main method
    public static void main(String args[]){
      
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        //prompt user for size of board and number of bombs
        System.out.print("Enter the size of the board (between 2 and 30): ");
        int n = scan.nextInt();
        
        System.out.print("Enter the number of bombs on the board: ");
        int M = scan.nextInt();
        
        //create array1
        int[][] arr1 = new int[n][n];
        
        //Indicate what symbol will represent bombs
        System.out.println("A 9 will be printed in each cell with a bomb.");
        
        
        //for loop to set M cells to the value M and increase adjacent cells
        for(int i = 0; i<M; i++){
            
            //generate a random set of x,y coordinates
            int x = (int)(Math.random()*n);
            int y = (int)(Math.random()*n);
            
            //if this cell already contains a bomb, decrease i and restart the loop
            if(arr1[x][y] == M){
                i = i - 1;
            }
            
            //otherwise, set the cell to M and incrnease the number in the adjacent cells
            else{
            arr1[x][y] = 9;
            
            //don't allow it to edit cells outside of the array
            //if a cell is a bomb, do not increment its value
            if(x!=n-1){
                if(arr1[x+1][y]!=9){
            arr1[x+1][y]++;
                }
            if(y!=0){
                if(arr1[x+1][y-1]!=9){
            arr1[x+1][y-1]++;
                }
            }
            if(y!=n-1){
                if(arr1[x+1][y+1]!=9){
            arr1[x+1][y+1]++;
                }
            }
            
            //don't allow it to edit cells outside of array
            }
            if(y!=0){
                if(arr1[x][y-1]!=9){
            arr1[x][y-1]++;
                }
            }
            if(y!=n-1){
                if(arr1[x][y+1]!=9){
            arr1[x][y+1]++;
                }
            }
            if(x!=0){
                if(arr1[x-1][y]!=9){
            arr1[x-1][y]++;
                }
            if(y!=0){
                if(arr1[x-1][y-1]!=9){
            arr1[x-1][y-1]++;
                }
            }
            if(y!=n-1){
                if(arr1[x-1][y+1]!=9){
            arr1[x-1][y+1]++;
                }
            }
            }
            }
            
        }
        
        //use a for loop to print out the arrays
        for(int i = 0; i<n; i++){
            for(int x = 0; x<n; x++){
                System.out.print(" "+arr1[i][x]);
            }
            System.out.println();
        }
    }   
    
    
}
        