public class StdDrawCurve {
    public static void main (String[] args) {
      StdDraw.setScale(0, 500);
          for(int i= 0;i<500;i+=20){
           StdDraw.line(i,0,500,i);
           StdDraw.line(i,500,0,i);
        }
     
    }
}
