import java.util.Scanner;

public class BMI{

    public static void main(String[] arg){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a weight in kg:");
    double weight = input.nextDouble();
    System.out.print("Enter a height in m:");
    double height = input.nextDouble();
    double BMI= weight/(height*height);
    System.out.println("A "+height+"m tall adult who weights "+weight+"g has a BMI of "+BMI);
    
    }
}