public class Sierpinski{
    public static void main(String[] arg){
        StdDraw.setScale(0, 1);
        OrderedPair v1 = new OrderedPair(0,1);
        OrderedPair v2 = new OrderedPair(1, 1);
        OrderedPair v3 = new OrderedPair(0.5,0);

        StdDraw.point(v1.getX(),v1.getY());
        StdDraw.point(v2.getX(),v2.getY());
        StdDraw.point(v3.getX(),v3.getY());

        OrderedPair CurrentPoint;

        for(int  i =1; i< 1000 ;i++){
            int nextPoint = (int)(Math.random()*3)+1;
            if(nextPoint == 1){
                CurrentPoint = Formulas.findMidpoint(v1,v2);
            }else if(nextPoint == 2){
                CurrentPoint = Formulas.findMidpoint(v1,v3);
            }else if(nextPoint == 3){
                CurrentPoint = Formulas.findMidpoint(v2,v3);
            }
            StdDraw.point(CurrentPoint.getX(),CurrentPoint.getY());
        }
    }
}