package Chapter1.Question8;

import java.nio.file.FileSystemNotFoundException;

public abstract class Answer {
    public Answer(){

    }

    private static boolean isSubstring(String big, String small) {
        return big.indexOf(small) > 0;
    }

    private static boolean isRotation(String arr, String arr2) {
        int len = arr.length(); // check if both are in same length
        return (len == arr2.length() && len > 0 && (isSubstring(arr+arr,arr2)));
    }

    public static void main(String[] args) {
        String[][] pairs =  {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "racame"}};
        for(String[] pair: pairs) {
            if(pair.length==2) {  // ## defensive programming
                String word = pair[0];
                String word_2 = pair[1];
                boolean isRotation_String = isRotation(word,word_2);
                System.out.println(word + ", " + word_2 + " is " + isRotation_String);
            }
        }
    }
}