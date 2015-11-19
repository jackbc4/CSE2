//Jack Circus
//CSE 002
//Lab 13
//Rectangle (non static mehtods)


public class Rectangle{
    //create non static variables for height and width
    double width;
    double height;
    
    //non static method to set the width of rectangle
    public void setWidth(double x){
        width = x;
    }
    
    //non static mehtod to set value of height
    public void setHeight(double y){
        height = y;
    }
    
    //non static method that returns the area as a double by computing height times area
    public double getArea(){
        return height * width;
    }
    
    
    //main method
    public static void main(String args[]){
        //create object r1
        Rectangle r1 = new Rectangle();
        
        //call setHeight and setWidth with 5.3 and 7.3, respectively
        r1.setHeight(5.3);
        r1.setWidth(7.3);
        
        //print out what is returned by getArea method
        System.out.println(r1.getArea());
    }
}