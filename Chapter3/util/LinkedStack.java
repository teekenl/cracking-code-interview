package Chapter3.util;

import java.util.Stack;

public class LinkedStack extends Stack<Integer> {
    Stack<Integer> s;

    public LinkedStack() {
        s = new Stack<Integer>();
    }

    public void push(int value){
        if(value<=getPeek()) {
            s.push(value);
        }
        super.push(value);
    }

    public Integer pop() {
        int value = s.pop();
        if(value == getPeek()) { // remove the previous value which equal to the current value.
            s.pop();
        }
        return value;
    }

    public int getPeek() {
        if(s.isEmpty()){
            return Integer.MAX_VALUE;
        } else{
            return s.peek();
        }
    }

}


