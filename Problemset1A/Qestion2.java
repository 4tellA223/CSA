import java.util.Scanner;
public class Qestion2{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        System.out.println("What is your favourite course?");
        String answer1 = input.nextLine();
        System.out.println("What is  your favourite show?");
        String answer2 = input.nextLine();
        System.out.println("How many hours do you spend studying each day?");
        int answer3 = input.nextInt();
        System.out.println("How many hours do you spend watching shows each day?");
        int answer4 = input.nextInt();
        System.out.println("");
        System.out.println("Summery");
        System.out.println("Your favourite course is " + answer1);
        System.out.println("Your favourite show is " +answer2);
        System.out.println("Your spend " +answer3 + " hours studying each day");
        System.out.println("Your spend " +answer3 + " hours watching shows each day");
        int sum = answer3 + answer4;
        System.out.println("In total, you spend " + sum +" hours studying and watching shows each day");
    }

}