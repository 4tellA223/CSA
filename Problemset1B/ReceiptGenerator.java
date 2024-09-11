import java.util.Scanner;
public class ReceiptGenerator{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.print("Number of units you're buying: ");
        int quantity = input.nextInt();
        System.out.print("Price perunit: ");
        int price = input.nextInt();
        System.out.print("Tax rate: ");
        double tax = input.nextDouble();
        int totalPrice=quantity*price;
        double taxPrice = tax/100;
        double result = totalPrice + (totalPrice*taxPrice);
        System.out.println("Purchasing "+quantity+" units at $"+price+" with "+tax+"% tax will cost $"+result);

    }
}