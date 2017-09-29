package Chapter3.Question1;

public class Answer {
    private static int stacksize = 300;
    static int[] buffer = new int[stacksize*3];
    static int[] pointer = {0,0,0};

    public Answer(){
    }

    public static void push(int stacknum, int value){
        int index = stacknum * stacksize + pointer[stacknum] + 1;
        pointer[stacknum]++;
        buffer[index] = value;
    }

    public static  int pop(int stacknum) {
        int index = stacknum * stacksize + pointer[stacknum];
        int selectedValue = buffer[index];
        pointer[stacknum]--;
        buffer[index] = 0;
        return selectedValue;
    }

    public static int peek(int stacknum) {
        int index = stacknum * stacksize + pointer[stacknum];
        return buffer[index];
    }

    public static boolean isEmpty(int stacknum) {
        return pointer[stacknum] == 0;

    }

    public static void main(String[] args) {
        //push(1,3);
        push(2,1);
        push(2,3);
        push(2,4);
        push(2,5);
        System.out.println();
    }
}
