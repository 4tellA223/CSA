import java.util.Scanner;

public class Driver{
    static String[][] grid;
     
    public static void main(String[] arg){
        
        Scanner input = new Scanner(System.in);
        
       
        TicTacToe a = new TicTacToe();
        boolean flag = false;
        boolean win = false;
        String player = "X";
        
        
        initializeBoard();
        printGrid(grid);
            while(!win){
               
                
                System.out.println("Player" + player+" Make Your Move");
                String x =  input.nextLine();
                int[] text = a.stringToInt(x);
               
                
                if(a.validMoves(grid,text[0],text[1]) && player.equals("X")){
                    grid[text[1]][text[0]] = "X";
                    player = "O";
                }else if(a.validMoves(grid,text[0],text[1]) && player.equals("O")){
                    grid[text[1]][text[0]] = "O";
                    player = "X";
                }else{
                    System.out.println("Invalid Move");
                }
                
                if(a.win(grid)){
                    printGrid(grid);
                    System.out.println("PLAY AGAIN? Y/N");
                     String y = input.nextLine();
                    if(y.equals("Y")){
                       initializeBoard(); 
                    }else{
                        break;
                    }
                }
                
                printGrid(grid);
           }
       
   
        
    }

    public static void printGrid(String[][] grid){

        for(int c = 0; c < grid[0].length; c++){
            for(int r = 0; r < grid.length; r++){
                System.out.print("["+grid[r][c]+"]");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void initializeBoard(){
        grid = new String[3][3];
        for(int c = 0; c < grid.length; c++){
            for(int r = 0; r < grid[0].length; r++){
                grid[r][c] = " ";
                
            }
        }
    }
}