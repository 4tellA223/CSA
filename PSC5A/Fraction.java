public class Fraction{

    private int numerator;
    private int denominator;

    public Fraction(){
        numerator = 1;
        denominator =1;

    }

    public Fraction(int top, int bottom){
        if (bottom == 0) return;
        numerator = top;
        denominator = bottom;
    }

    public Fraction(String frac){
        if (Integer.parseInt(frac.substring(frac.indexOf("/")+1)) == 0) return;
        numerator = Integer.parseInt(frac.substring(0,frac.indexOf("/")));
        denominator = Integer.parseInt(frac.substring(frac.indexOf("/")+1));

    }

    //Accessor Methods

    public Fraction(Fraction frac){
        numerator = frac.numerator;
        denominator = frac.denominator;
    }

    public int getNum(){
        return numerator;
    }

    public int getDenom(){
        return denominator;
    }

    public double toDouble(){
        return (double)numerator/denominator;
    }
    public String toString(){
        return numerator + "/" + denominator;
    }

    //Mutator Methods

    public void reduce(){
        int a = GCF(numerator ,denominator);
        numerator /= a;
        denominator/= a;
        
    }
    
    public void setNum(int num){
        numerator = num;
    }
    
    public void setDenom(int denom){
        denominator = denom;
    }
    
    //static method
    
    static Fraction multiply(Fraction a, Fraction b){
        int top = a.numerator * b. numerator;
        int bottom = a.denominator * b.denominator;
        Fraction x = new Fraction(top,bottom);
        
        x.reduce();
        return x;
    }
    static Fraction divide(Fraction a, Fraction b){
        int top = a.numerator * b.denominator;
        int bottom = a.denominator * b.numerator;
        Fraction x = new Fraction(top,bottom);
        x.reduce();
        return x;
    }
    static Fraction add(Fraction a, Fraction b){
        int top = a.numerator*b.denominator + b.numerator* a.denominator;
        int bottom = a.numerator*b.numerator;
        Fraction x = new Fraction (top, bottom);
        x.reduce();
        return x;
    }
    static Fraction subtract(Fraction a, Fraction b){
        int top = a.numerator*b.denominator - b.numerator*a.denominator;
        int bottom = a.numerator*b.numerator;
        Fraction x = new Fraction (top, bottom);
        x.reduce();
         return x;
    }

   
    public int GCF(int a, int b){
        while( a!=b){
            if(a > b) a = a - b;
            if(b > a) b = b - a;
        }
        return a;
    }

}