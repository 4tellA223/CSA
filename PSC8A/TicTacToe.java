public class TicTacToe{
    //fields
    static int rounds = 0;
    int row;
    int col;
    // String player = red;
    public TicTacToe(){
    
    }
    
    public int trackRounds(){
    return rounds;
    }
   
    public static int[] stringToInt(String a){
        int[] result = new int[2];
        result[0] = Integer.parseInt( a.substring(0,a.indexOf(",")));
        result[1] = Integer.parseInt(a.substring(a.indexOf(",")+1));
        return result;
    }
    
    public static boolean validMoves(String[][] grid,int r, int c){
        if(r <= 2 && c <= 2 && r >=0 && c >= 0){
            if(grid[r][c].equals(" ")){
                rounds++;
                return true;
            }
        }
        return false;
    }
    public static boolean win(String[][] grid){
        for(int i = 0; i <= 2; i++){
            if(grid[i][0].equals(grid[i][1]) && grid[i][1].equals(grid[i][2]) && !grid[i][0].equals(" ")) return true;
            if(grid[0][i].equals(grid[1][i]) && grid[1][i].equals(grid[2][i]) && !grid[0][i].equals(" ")) return true;
            if( i == 0 && grid[i][i].equals(grid[i+1][i+1]) && grid[i+1][i+1].equals(grid[i+2][i+2])&& !grid[0][i].equals(" "))return true;
        }
        return false;
    }
    

}