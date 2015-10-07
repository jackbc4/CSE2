public class harmonicsum {
    public static void main(String[] args){
        int n=50000;
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
        System.out.println(sum);
        System.out.println(sum2);
        double dif = sum2 - sum;
        System.out.println(dif);
        double z = 1/dif;
        System.out.println(z);
    }
}