public class StdDrawExample {
    public static void main (String[] args) {
      StdDraw.setScale(0, 500);
          for(int y= 0;y<500;y+=20){
            for(int x=0;x<500;x+=20){
                StdDraw.line(x,0, 0, 2500);
            } 
        }
     
    }
}
