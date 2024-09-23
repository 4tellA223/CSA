
public class Driver{
    public static void main(String[] arg){
        Circle c1 = new Circle();
        Circle c2 = new Circle(5);
        //defualt circle
        System.out.println("Creating a cylinder with the default constructor");
        //methods
        System.out.println(c1.toString());
        System.out.println("getRadius()---> "+ c1.getRadius());
        System.out.println("circumference()---> " + c1.circumference());
        System.out.println("area()---> " + c1.area());
        
        System.out.println("");
        
        //circle with paramter
        System.out.println("Creating a circle with a parameterized constructor!");
        //methods
        System.out.println(c2.toString());
        System.out.println("getRadius()---> "+ c2.getRadius());
        System.out.println("circumference()---> " + c2.circumference());
        System.out.println("area()---> " + c2.area());

        System.out.println("");
        //cylinder objects
        Cylinder cy1 = new Cylinder();
        Cylinder cy2 = new Cylinder(5,2);
        //default cylinder
        System.out.println("Creating a cylinder with the default constructor");
        //cylinder mehtods
        System.out.println(cy1.toString());
        System.out.println("getRadius()---> "+ cy1.getRadius());
        System.out.println("circumference()---> " + cy1.getHeight());
        System.out.println("area()---> " + cy1.surfaceArea());
        System.out.println("area()---> " + cy1.volume());

        System.out.println("");
        
        //cylinder with parameter
        System.out.println("Creating a circle with a parameterized constructor!");
        //cylinder methods
        System.out.println(cy2.toString());
        System.out.println("getRadius()---> "+ cy2.getRadius());
        System.out.println("getRadius()---> "+ cy2.getRadius());
        System.out.println("circumference()---> " + cy2.getHeight());
        System.out.println("area()---> " + cy2.surfaceArea());
        System.out.println("area()---> " + cy2.volume());
    }
}