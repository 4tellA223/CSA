public class FractionDriver{

    public static void main(String[] args){
        Fraction a = new Fraction();
        Fraction b = new Fraction(4,2);
        Fraction c = new Fraction("1/2");
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        System.out.println(a.getNum());
        System.out.println(b.getDenom());
        System.out.println(c.toDouble());
        b.reduce();
        System.out.println(b);
        
    }
}