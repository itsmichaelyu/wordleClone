import wordle.Wordle;
import wordle.Words;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Words.setup();
        Wordle wordle = new Wordle();
        int status = 0;
        int maxNumOfGuesses = Wordle.debug ? Integer.MAX_VALUE : 6;
        String word;
        Scanner input = new Scanner(System.in);

        while (status != 1 && wordle.getGuesses() < maxNumOfGuesses) {
            word = "";
            while (word.length() != 5 || !Words.checkWord(word)) {
                if (word.length() != 5 ) {
                    if (word.equals("ANSWER")){
                        status = 2;
                        break;
                    }
                    System.out.println("Enter a 5 letter word: ");
                }
                else {
                    System.out.println("Not a word: ");
                }
                word = input.nextLine();
            }
            if (status == 2){break;}
            status = wordle.checkWord(word);
        }
        wordle.endGame(status);

    }
}