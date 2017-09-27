package Chapter1.Question2;

public class Answer{
    public Answer(){

    }

    private static String reverseString(char[] str){
        if(str == null){
            return null;
        }
        int len = str.length;
        if(len<2) {
            return String.valueOf(str[0]);
        }

        StringBuilder reversed = new StringBuilder();
        for(int i=len-1; i>=0; i--) {
            reversed.append(str[i]);
        }
        return reversed.toString();
    }

    public static void main(String[] args) {
        String test = "iloveyou";
        char[] arr = test.toCharArray();
        System.out.println(reverseString(arr));
    }
}