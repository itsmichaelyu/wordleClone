package wordle;

import java.util.HashMap;

public class Wordle {
    private String word = Words.getWord();
    private int numGuesses = 0;
    private HashMap<Character, Integer> map = new HashMap<Character, Integer>();

    public Wordle(){
        Words.setup();
        for (int i = 0; i < word.length()-1; i++) {
            int num = map.containsKey(word.charAt(i)) ? map.get(word.charAt(i)) : 1;
            map.put(word.charAt(i), num);
        }
    }

    /**
     0 = fail
     1 = correct
     **/
    public int checkWord(String guess) {
        numGuesses++;
        if (guess.equals(word)) {
            return 1;
        }
        else {return 0;}
    }

    public String getErrors(String guess) {
        String errors = "";
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) != word.charAt(i) && !map.containsKey(guess.charAt(i))) {
                errors += "❌";
            }
            else if (guess.charAt(i) != word.charAt(i) && map.containsKey(guess.charAt(i))) {
                errors += "⚠️";
            }
            else if (guess.charAt(i) == word.charAt(i)) {
                errors += "✔️";
            }
        }
        return errors;
    }
}