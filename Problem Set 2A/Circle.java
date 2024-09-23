public class Circle{
    //instance variables
    double radius;
    double circum;
    double area;

    //constructor with parameter
    Circle(double radius){
        this.radius = radius;
    }
    //constructor with default value
    Circle(){
        radius = 1;
    }

    //mehod get radius
    public double getRadius(){
        return radius;
    }
    
    //method get circumference
    public double circumference(){
        circum = 2*Math.PI*radius;
        return circum;
    }
    
    //method to get the radius
    public String toString(){
        String result = "Hello. I am a circle with a radius of " + radius;
        return result;
    }

    //method to get area
    public double area(){
        area = (radius*radius) * Math.PI;
        return area; 
    }

}