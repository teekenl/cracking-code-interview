package Chapter1.Question4;

import java.io.*;
import java.nio.file.Files;

public class Answer{
    public Answer(){

    }

    private static boolean isAnagram(String str, String str2) {
        if(str.length() != str2.length())
            return false;
        int[] letters = new int[256];
        int num_unique_chars = 0;
        int num_completed_t = 0;
        char[] s_array = str.toCharArray();

        for (char c : s_array) { // count number of each char in s.
            if (letters[c] == 0) ++num_unique_chars;
            ++letters[c];
        }

        for (int i = 0; i < str2.length(); ++i) {
            int c = (int) str2.charAt(i);
            if (letters[c] == 0) { // Found more of char c in t than in s.
                return false;
            }
            --letters[c];
            if (letters[c] == 0) {
                ++num_completed_t;
                if (num_completed_t == num_unique_chars) {
                    // it�s a match if t has been processed completely
                    return i == str2.length() - 1;  // return true or i should be equal to total length of array.
                }
            }
        }
        return true;
    }

    public static void main (String[] args) {
        String[][] pairs = {{"apple", "papel"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for(String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram = isAnagram(word1, word2);
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}