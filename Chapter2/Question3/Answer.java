package Chapter2.Question3;

import Chapter2.Question1.util.*;

public class Answer {
    public Answer(){

    }

    private static Node deleteNode(Node n, int data) {
        Node current = n;
        if(current == null) return null;
        if(current.data == data) return n.next;

        while(current.next != null) {
            if(current.next.data == data) {
                current.next = current.next.next;
                return n;
            }
           current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        Node example = RandomNodeList.randomNode(10,0,10);
        System.out.println("Node list: " + example.printNodeList());
        deleteNode(example, 2);
        System.out.println("Node list after 2 was deleted:" + example.printNodeList());
    }
}