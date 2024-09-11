import java.util.Scanner;
public class NumOfDigits{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive, three-digit number: ");
        int num = input.nextInt();
            int a = num%10;
            int b =num/10 %10;
            int c = num/100;
            int result =a+b+c;
            System.out.println("The sum of the digits of "+num+ " is "+result);
        
        
        
    
    }
    
}