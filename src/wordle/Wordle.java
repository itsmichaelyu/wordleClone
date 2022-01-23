package wordle;

import java.util.HashMap;

public class Wordle {
    public static final boolean debug = false;
    private final String word = debug ?  "teepe" : Words.getWord();
    // private final String word = debug ?  "train" : Words.getWord();
    private int numGuesses = 0;
    private final HashMap<Character, Integer> map = new HashMap<>();

    public Wordle(){
        for (int i = 0; i < word.length(); i++) {
            int num = map.containsKey(word.charAt(i)) ? map.get(word.charAt(i))+1 : 1;
            map.put(word.charAt(i), num);
        }
         if (debug) {System.out.println(map);}
    }

    /**
     0 = fail
     1 = correct
     2 = give up and sad :(
     **/
    public int checkWord(String guess) {
        numGuesses++;
        if (guess.equals(word)) {
            return 1;
        }
        else {
            System.out.println(getErrors(guess));
            return 0;
        }
    }

    public int getGuesses() {
        return numGuesses;
    }

    public String getErrors(String guess) {
        StringBuilder errors = new StringBuilder();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < word.length(); i++) {
            int num = map2.containsKey(guess.charAt(i)) ? map2.get(guess.charAt(i)) : 1;
            map2.put(guess.charAt(i), num);
        }
         if (debug) {System.out.println(map2);}
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == word.charAt(i)) {
              if (map2.containsKey(guess.charAt(i))) {
                map2.put(guess.charAt(i), map2.get(guess.charAt(i))+1);
              }
              
                errors.append("\uD83D\uDFE9️ ");
            }
            else if (guess.charAt(i) != word.charAt(i) && map.containsKey(guess.charAt(i)) && map2.containsKey(guess.charAt(i)) && map2.get(guess.charAt(i)) <= map.get(guess.charAt(i))) {
                map2.put(guess.charAt(i), map2.get(guess.charAt(i))+1);
                errors.append("\uD83D\uDFE8 ");
            }
            else {
                errors.append("⬛ ");
            }
             if (debug) {System.out.println(map2);}
        }
        return errors.toString();
    }

    public void endGame(int status) {
        if (status == 1) {System.out.println("YOU WIN!");
            System.out.println("IT TOOK YOU: " + numGuesses + " GUESSES");}
        else if(status == 2)  {
            System.out.println("YOU ARE FAILURE!");
            System.out.println("THE WORD WAS: " + word);
        }
        else if(status == 0)  {
            System.out.println("TOO MANY GUESSES!");
            System.out.println("THE WORD WAS: " + word);
        }
    }
}
         if (debug) {System.out.println(map2);}
        for (int i = 0; i < guess.length(); i++) {
            if (guess.charAt(i) == word.charAt(i)) {
                errors.append("\uD83D\uDFE9️ ");
            }
            else if (guess.charAt(i) != word.charAt(i) && map.containsKey(guess.charAt(i)) && map2.containsKey(guess.charAt(i)) && map2.get(guess.charAt(i)) >= map.get(guess.charAt(i))) {
                errors.append("\uD83D\uDFE8 ");
            }
            else {
                errors.append("⬛ ");
            }
        }
        return errors.toString();
    }

    public void endGame(int status) {
        if (status == 1) {System.out.println("YOU WIN!");
            System.out.println("IT TOOK YOU: " + numGuesses + " GUESSES");}
        else if(status == 2)  {
            System.out.println("YOU ARE FAILURE!");
            System.out.println("THE WORD WAS: " + word);
        }
        else if(status == 0)  {
            System.out.println("TOO MANY GUESSES!");
            System.out.println("THE WORD WAS: " + word);
        }
    }
}
