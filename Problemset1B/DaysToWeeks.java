import java.util.Scanner;

public class DaysToWeeks{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number of days: " );
        int days = input.nextInt();
        int weeks = days/7;
        int days1 = days%7;
        
        System.out.println( days +" days is equal to "+ weeks +"weeks, " + days1+" days.");
    
    }
}