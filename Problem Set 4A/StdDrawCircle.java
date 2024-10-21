public class StdDrawCircle {
    public static void main (String[] args) {
        StdDraw.setScale(0, 500);
        boolean flag = true;
        for(int i= 520;i>20;i-=20){
            if(flag){
                StdDraw.setPenColor(StdDraw.BLACK);
                StdDraw.filledCircle(250,250,i);
                flag =!flag;
            }
            else if(!flag){
                StdDraw.setPenColor(StdDraw.WHITE);
                 StdDraw.filledCircle(250,250,i);
                flag = !flag;
            }
        }
    }
}