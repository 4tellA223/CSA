import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Formulas formula = new Formulas();

        System.out.println("QUADRATIC FORMULA: Find the roots of ax^2 + bx + c. Enter a, b and c:");
        System.out.print("a:");
        double a1 = input.nextDouble();
        System.out.print("b:");
        double b1 = input.nextDouble();
        System.out.print("c:");
        double c1 = input.nextDouble();
        OrderedPair answer1 = formula.findQuadraticRoots(a1, b1, c1);
        System.out.println("The solutions for " +a1+"x^2+"+b1+"x+"+c1 +" are (" + answer1+")");

        System.out.println("SLOPE FORMULA: Find the slope between points (x1,y1) and (x2,y2)");
        System.out.print("x1:");
        double x1 = input.nextDouble();
        System.out.print("y1:");
        double y1 = input.nextDouble();
        System.out.print("x2:");
        double x2 = input.nextDouble();
        System.out.print("y2:");
        double y2 = input.nextDouble();
        OrderedPair A = new OrderedPair(x1,y1);
        OrderedPair B = new OrderedPair(x2,y2);
        double answer2 = formula.findSlope(A,B);
        System.out.println("A line between (" +A+ ") and (" +B+")has a slope of "+ answer2 );

        System.out.println("MIDPOINT FORMULA: Find the midpoint between (x1,y1) and (x2,y2)");
        System.out.print("x1:");
        double xa = input.nextDouble();
        System.out.print("y1:");
        double yb = input.nextDouble();
        System.out.print("x2:");
        double xa1 = input.nextDouble();
        System.out.print("y2:");
        double yb2 = input.nextDouble();
        OrderedPair A1 = new OrderedPair(xa,yb);
        OrderedPair B1 = new OrderedPair(xa1,yb2);
        OrderedPair answer3 = formula.findMidpoint(A1,B1);
        System.out.println("The midpoint between (" +A1+") and ("+B1+") is (" +answer3 +")");

        
        
        System.out.println("SUM OF AN ARITHMETIC SERIES");
        System.out.print("Number of terms:");
        int a = input.nextInt();
        System.out.print("Starts with:");
        double b =input.nextDouble();
        System.out.print("Increases by:");
        double c =input.nextDouble();
        double answer4 = formula.findArithmeticSeriesSum(b,c,a);
        System.out.println("The sum of the first " + a + " terms of an arithmetic series that starts with "+b+"and increases by"+c+" is "+answer4);
    
        System.out.println("SUM OF A GEOMETRIC SERIES");
        System.out.print("Number of terms:");
        int x = input.nextInt();
        System.out.print("Starts with:");
        double y =input.nextDouble();
        System.out.print("Increases by:");
        double z =input.nextDouble();
        double answer5 = formula.findArithmeticSeriesSum(y,z,x);
        System.out.println("The sum of the first " + x + " terms of an finite geometric series that starts with "+y+"and increases by"+z+" is "+answer5);
    }
        
    }
