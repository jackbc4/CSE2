public class TimeTable{

public static void main(String args[]){
    int i;
    int n;
    int x;
    int y;
    System.out.println("* | 1 2 3 4 5 6 7 8 9");
    System.out.println("_____________________");
    System.out.println("");
    for (i = 1; i <=9; i++){
        System.out.print("* | ");
        for (x = 1; x <=9; x++){
            y = x * i;
            System.out.print(" "+y);
        }
        System.out.println("");
    }
}
}