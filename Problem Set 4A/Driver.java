import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num =(int)( Math.random()*101) +1;
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess it?");
        int answer1 = -1;
        int tries = 0;
        while(num != answer1){
            tries ++;
            System.out.print("Your guess:");
            answer1 = input.nextInt();
           if(answer1>num)System.out.println("Nope, that guess is too high.");
           else if(answer1<num)System.out.println("Nope, that guess is too low.");
           
        }
        tries ++;
        System.out.println("You guessed it! It took you "+ tries + " tries");

    }
}