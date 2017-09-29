package Chapter3.Question2;

import Chapter3.util.*;

import java.util.LinkedList;

public class Answer{
    public Answer(){

    }

    public static void main(String[] args) {
        LinkedStack example = new LinkedStack();
        example.push(5);
        System.out.println(example.getPeek());
    }
}