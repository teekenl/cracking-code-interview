package Chapter2.Question2;

import Chapter2.Question1.util.*;
import java.util.*;

public class Answer {
    public Answer() {

    }

    public static Node findNthNode(Node n,int position) {
        if ( n == null || position < 1) return null;
        Node previous = n;
        Node current = n;

        for(int j = 0; j < position-1; ++j) {
            if (current == null) {
                return null;
            }
            current = current.next;
        }
        while(current.next != null) {
            previous = previous.next;
            current = current.next;
        }
        return previous;
    }

    public static void main(String args[]) {
        Node example = RandomNodeList.randomNode(10,0,10);
        System.out.println("Node list: " + example.printNodeList());
        int position = 2;
        Node nthnode = findNthNode(example, 2);
        System.out.println("Node list starts at " + position +  ": " + nthnode.printNodeList());
    }
}
