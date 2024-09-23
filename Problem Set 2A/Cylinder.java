public class Cylinder{
    //instance varibale
    double height;
    double base;

    //default constructors
    Cylinder(){
        height =1;
        base = 1;  
    }
    //constructor with parameter
    Cylinder(double height, double base){
        this.height = height;
        this.base = base;
    }

    //method to string
    public String toString(){
        String result ="Hello, I am a cricle with a radius of " + base+ " and height of "+height;
        return result;
    }

    //method get radisu
    public double getRadius(){
        return base;
    }

    //method get height
    public double getHeight(){
        return height;
    }

    //method to get surface area
    public double surfaceArea(){
        double sa = 2*Math.PI*base*height + 2*Math.PI*Math.pow(base,2);
        return sa;
    }

    //method to get volume
    public double volume(){
        double v = Math.PI * Math.pow(base,2) *height;
        return v;
    }
}