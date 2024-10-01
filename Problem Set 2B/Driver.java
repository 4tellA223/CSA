import java.util.Scanner;

class Driver {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringTools sTools = new StringTools();

        //last lettter
        System.out.println("lastLetter test cases:" );
        System.out.println("Enter a word with at least one character: ");
        String answer1 = input.nextLine();
        System.out.println("The last letter is " + sTools.lastLetter(answer1));
        System.out.println("---------------------");
        
        //formatt number
        System.out.println("formatPhoneNumber test cases:" );
        System.out.println("Enter a 10 digit Phone Number: ");
        String answer2 = input.nextLine();
        System.out.println("The formatted phone# is " + sTools.formatPhoneNumber(answer2));
        System.out.println("---------------------");
        
        //middle three
        System.out.println("middleThree test cases:" );
        System.out.println("Enter a odd number & at least 3 character long word: ");
        String answer3 = input.nextLine();
        System.out.println("The middle 3 character is " + sTools.middleThree(answer3));
        System.out.println("---------------------");
        
        //swap last two
        System.out.println("swapLastTwo test cases:" );
        System.out.println("Enter a word at least 2 character long: ");
        String answer4 = input.nextLine();
        System.out.println("The swapped word is " + sTools.swapLastTwo(answer4));
        System.out.println("---------------------");
        
        //Front Again
        System.out.println("fontAgain test cases:" );
        System.out.println("Enter a word: ");
        String answer5 = input.nextLine();
        System.out.println("Enter a number that is less or equal to the length of the word: ");
        int answer6 = input.nextInt();
        System.out.println("The return value is " + sTools.frontAgain(answer5,answer6));
        System.out.println("---------------------");
    }
}