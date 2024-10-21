class OrderedPair{
    double x;
    double y;
    public OrderedPair(double x,double y){
    this.x =x;
    this.y = y;
    }
    
    public OrderedPair(){
    x = 0;
    y = 0;
    }
    
    public String toString(){
    String result = x + "," +y;
    return result;
    }
    
    public double getX(){
    return x;
    }
    public double getY(){
    return y;
    }


}