public class Formulas{
    
    public OrderedPair findQuadraticRoots (double a, double b, double c){
        double x = (-b-Math.sqrt(Math.pow(b,2)-4*a*c))/2*a;
        double y= (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/2*a; 
        OrderedPair result = new OrderedPair(x,y);
        return result;
    } 

    public double findSlope (OrderedPair A, OrderedPair B){
        double numerator = A.getY() - B.getY();
        double denomenator = A.getX() - B.getX();
        double m = numerator / denomenator ;
        return m;
    }

    public static OrderedPair findMidpoint (OrderedPair A, OrderedPair B){
        double x = (A.getX()-B.getX())/2;
        double y = (A.getY() - B.getY())/2;
        OrderedPair result = new OrderedPair(x,y);
        return result;    
    }

    public double findArithmeticSeriesSum (double a, double d, int k){
        double result = ((double)k/2) * (2*a + d*(k-1));
        return result;

    }

    public double findGeometricSeriesSum (double a, double r, int k){
        double num = 1-Math.pow(r,k);
        double den = 1-r;
        double result = a*(num/den);
        return result;
    } 
    
    public int rollDie (int sides){
    int result = (int)(Math.random()*sides)+1;
    return result;
    }

}