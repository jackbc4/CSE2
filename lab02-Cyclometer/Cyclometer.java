//Cyclometer
//Prints number of minutes, counts, and distance for two trips
//CSE 02

public class Cyclometer {
    //main method required for every Java program
    public static void main(String[] args)  {
        //input data
        int secsTrip1=480; //time of first trip
        int secsTrip2=3220; //time of second trip
        int countsTrip1=1561; //rotations of wheel trip 1
        int countsTrip2=9037; //rotations of wheel trip 2
        double wheelDiameter=27.0; //diameter of bike wheel
        double PI=3.14159; //value of pi
        double feetPerMile=5280; //how many feet in a mile
        double inchesPerFoot=12; //how many inches in a foot
        double secondsPerMinute=60; //how many seconds in a minute
        double distanceTrip1=0; 
        double distanceTrip2=0;
        double totalDistance=0; //distance traveled per trip
            
            //Prints the time taken for each trip
        System.out.println("Trip 1 took "+
            (secsTrip1/secondsPerMinute)+" minutes and had "+ 
            countsTrip1+" counts.");
        System.out.println("Trip 2 took "+
            (secsTrip2/secondsPerMinute+" minutes and had "+
            countsTrip2+" counts."));
            
            
        //run the calculations; store the values. 
        //Calculate the distance traveled per trip
        //Uses wheel diameter to find circumference of wheel
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile; //gives distance in miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        totalDistance=distanceTrip2+distanceTrip1;
        
            //Print the output data
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+totalDistance+" miles");
        
        
    }
}