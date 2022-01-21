package wordle;

import java.util.*;
import java.util.Scanner;
import java.util.Map;
import java.io.File;
import java.io.FileNotFoundException;

public class Words {
    private static final Map<Integer, String> wordleList = new HashMap<>();
    private static final Map<Integer, String> allWords = new HashMap<>();

    public static void setup() {
        int count = 0;
        File wordleTXT = new File("src/wordle/Wordle.txt");
        File guessesTXT = new File("src/wordle/Guesses.txt");
        try {
            Scanner s = new Scanner(wordleTXT);
            while (s.hasNextLine()) {
                String word = s.nextLine();
                wordleList.put(count,word);
                allWords.put(count,word);
                count++;
            }
            s = new Scanner(guessesTXT);
            while (s.hasNextLine()) {
                String word = s.nextLine();
                allWords.put(count,word);
                count++;
            }
            s.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static String getWord() {
        return wordleList.get((int)((Math.random()*(wordleList.size()))+1));
    }

    public static boolean checkWord(String str) {
        return allWords.containsValue(str);
    }
}