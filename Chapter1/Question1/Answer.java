package Chapter1.Question1;

import java.util.*;

public class Answer {
    public Answer(){
        //construtor defined here.
    }
    //test passed
    private static boolean isUniqueChars(String word) {
        int unique = 0;
        for(int i = 0; i<word.length(); i++) {
            int character = word.charAt(i) - 'a';
            if((unique & (1<<character)) > 0)  return false;
            unique |= (1 << character);
        }
        return true;
    }
    // test passed
    private static boolean isUniqueChars2(String word) {
        boolean[] char_set = new boolean[256];
        for (int i = 0; i < word.length(); i++) {
            int character = word.charAt(i);
            if (char_set[character]) return false;
            char_set[character] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        for (String word : words) {
            System.out.println(word + ": " + isUniqueChars(word) + " " + isUniqueChars2(word));
        }
    }
}