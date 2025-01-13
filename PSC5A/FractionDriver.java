import java.util.Scanner;
public class FractionDriver{

    public static void main(String[] args){
        Fraction approx = new Fraction(355,113);
        Fraction MILU = new Fraction (355,113);
        final double EPSILON = Math.abs(Math.PI -MILU.toDouble());
        boolean game = true;
        int countWin = 0;
        int countRounds = 0;
        while(Math.abs(Math.PI - approx.toDouble())>= EPSILON){
            if(Math.PI - approx.toDouble() < EPSILON){
                approx.setDenom(approx.getDenom()+1);
            }else {
                approx.setNum(approx.getNum()+1);  
            }

        }
        System.out.println(approx.toString());

        System.out.println("Let the Fraction Quiz Begin. Answers should be in lowest terms. Good luck!");
        while(game){
            Fraction a = Fraction.RandomFraction();
            Fraction b = Fraction.RandomFraction();
            System.out.println(a.toString() +" + " + b.toString());
            Fraction correctAnswer = Fraction.add(a,b);

            Scanner input = new Scanner(System.in);
            String answer =  input.nextLine();
            if(answer.equals("quit")){
              
                Fraction ratio = new Fraction(countWin,countRounds);
                double percent = (double)countWin/countRounds*100;
                System.out.println("Your win/loss ratio was " + ratio.toString() + " , for a score of " + percent +" percent!");
                game = false;
            }
            Fraction userAnswer  = new Fraction(answer);
            if(Fraction.CompareFraction(correctAnswer,userAnswer) ){
                System.out.println("Correct!");
                countWin ++;
                countRounds++;
            }else{
                System.out.println("Wrong, the answer was " + correctAnswer);
                countRounds++;
                //game = false;
            }

        }
    }

}