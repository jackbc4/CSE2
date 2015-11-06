//Jack Circus
//lab11
//sorting arrays

//import scanner
import java.util.Scanner;

import java.util.Arrays;

//create public class
public class lab11 {
   
    //main method
    public static void main(String args[]){
      
        //create scanner
        Scanner scan = new Scanner(System.in);
        
        
        //create array1
        int[] arr1 = new int[20];
        
        //create array 2
        int[] arr2= new int[10];
        
        //use for loop to store a random int from 0 to 100 in each position of the array
        for (int i =0; i<20; i++){
            arr1[i] = (int)(Math.random() * 100);
        }
        
       
        
        //use for loop to store a random int from 0 to 100 in each position of the array
        for (int i =0; i<10; i++){
            arr2[i] = (int)(Math.random() * 100);
        }
       
       //initialize array3 with 30 integers
        int[] arr3 = new int[30];
        
        //fill the values of array 3
        for(int i= 0; i<30; i++){
            //first 20 digits equal to array 1
            if(i<20){
                arr3[i] = arr1[i];
            }
            //last 10 equal to array 2's values
            else{
                arr3[i] = arr2[i-20];
            }
        }
       
       //sort all 3 arrays
        sort(arr1, arr2, arr3);
        
        
        //print out array 1
        System.out.print("Array 1: ");
        for (int i =0; i<20; i++){
            System.out.print(arr1[i]+ " ");
        }
        
        System.out.println();
        //print out array 2
        System.out.print("Array 2: ");
       for (int i =0; i<10; i++){
            System.out.print(arr2[i]+" ");
        } 
        
        System.out.println();
        //print out array 3
        System.out.print("Array 3: ");
       for (int i =0; i<30; i++){
            System.out.print(arr3[i]+" ");
        } 
       System.out.println(); 
       
        
    }
   
   //class to sort the arrays
    public static void sort(int[] arr1, int[] arr2, int[] arr3){
        //sort the three arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        Arrays.sort(arr3);
    }
}