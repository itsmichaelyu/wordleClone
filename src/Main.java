import wordle.Wordle;
import wordle.Words;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Wordle wordle = new Wordle();
        int status = 0;
        String word = "";
        Scanner input = new Scanner(System.in);

        while (status != 1) {
            word = "";
            while (word.length() != 5 || !Words.checkWord(word)) {
                if (word.length() != 5 ) {
                    System.out.println("Enter a 5 letter word: ");
                }
                else {
                    System.out.println("Not a word: ");
                }
                word = input.next();
            }
            status = wordle.checkWord(word);
            if (status == 0) {
                System.out.println(wordle.getErrors(word));
            }
        }
    }
}