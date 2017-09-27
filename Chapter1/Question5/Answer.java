package Chapter1.Question5;

public class Answer {
    public Answer() {

    }

    private static String encodedComponent(String arr) {
        if (arr == null)
            return null;
        int len = arr.length();
        char[] arrByte = arr.toCharArray();
        if(len < 2 && arrByte[0] != ' ') {
            return arr;
        }

        StringBuilder encoded = new StringBuilder();
        for(char element : arrByte) {
            if(element == ' ') {
                encoded.append("%20");
            } else{
                encoded.append(element);
            }
        }
        return encoded.toString();
    }

    public static void main(String[] args) {
        String[] words = {"this is the test", "withoutspace", "space space space"};
        for(String word : words) {
            String encodedWord = encodedComponent(word);
            System.out.println("Encoded " + word  + " to " + encodedWord);
        }
    }
}