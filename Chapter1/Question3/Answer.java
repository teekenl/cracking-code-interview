package Chapter1.Question3;

import javax.print.DocFlavor;

public class Answer{
    public Answer() {

    }

    private static String removeDuplicates(char[] arr) {
        if (arr == null) {
            return null;
        }
        int len = arr.length;
        if (len < 2) {
            return null;
        }
        StringBuilder uniqueSentence = new StringBuilder();
        for(char element : arr) {
            if(uniqueSentence.indexOf(String.valueOf(element))== -1)
            uniqueSentence.append(element);
        }

        return uniqueSentence.toString();
    }

    public static void main(String[] args) {
        String test = "thisistest";
        char[] arr = test.toCharArray();
        System.out.print(removeDuplicates(arr));
    }

}