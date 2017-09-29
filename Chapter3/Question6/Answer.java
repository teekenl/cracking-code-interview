package Chapter3.Question6;

import Chapter3.util.*;
import java.util.Stack;

public class Answer{

    public Answer() {


    }

    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> r = new Stack<Integer>();
        while(!s.isEmpty()) {
            int temp = s.pop();
            while(!r.isEmpty() && r.peek() > temp) {
                s.push(r.pop());
            }
            r.push(temp);
        }
        return r;
    }

    public static void main(String[] args) {
        Stack<Integer> example = new Stack<Integer>();
        example.add(2);
        example.add(1);
        example.add(5);

        Stack<Integer> sortedExample = sort(example);
        for(int i = sortedExample.size()-1; i >= 0 ; i--) {
            System.out.println(sortedExample.get(i));
        }
    }

}
