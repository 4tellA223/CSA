import java.util.Scanner;

public class CelsiusToFahrenheit{
    
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a temperature in Celsius:");
        int F;
        int C = input.nextInt();
        F = C * 9/5+32;
        System.out.println(C + " degree Celsius is " +F+" Fahrenheit");
        
        
    }

}