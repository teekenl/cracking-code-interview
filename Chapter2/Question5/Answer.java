package Chapter2.Question5;

import Chapter2.Question1.util.*;

public class Answer {
    public Answer(){

    }

    public static Node FindMeetingPoint(Node head) {
        Node previous = head;
        Node current = head;
        while (current.next != null) {
            previous = previous.next;
            current = current.next.next;
            if (previous == current) {
                break;
            }
        }
        if (current.next == null) {
            return null;
        }
        previous = head;
        while (previous != current) {
            previous = previous.next;
            current = current.next;
        }
        return current;
    }

    public static void main(String[] args) {
        Node[] nodes = new Node[10];
        for(int i = 0; i < 10; i++) {
            nodes[i] = new Node(i,i > 0 ? nodes[i-1] : null, null);
        }

        nodes[9].next = nodes[3];
        Node findLoop = FindMeetingPoint(nodes[0]);
        System.out.println("Node list with meeting point: " + findLoop.data);
    }
}