package Chapter2.Question1;

import Chapter2.Question1.util.*;
import java.util.*;

public class Answers{
    public Answers() {

    }

    public static void deleteDuplicates(Node n) {
        Hashtable table = new Hashtable();
        Node previous = n;
        while (n != null) {
            if (table.containsKey(n.data)) {
                previous.next = n.next;
            } else {
                table.put(n.data, true);
                previous = n;
            }
            n = n.next;
        }
    }

    // No buffer : No hashmap & hashtable
    public static void deleteDuplicatesNoBuffer(Node first) {
        if(first == null) return;
        Node previous = first;
        Node current = first.next;
        while(current != null) {
            Node iterate = first;
            while(iterate != current) {
                if(iterate.data == current.data) {
                    Node tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }
                iterate = iterate.next;
            }
            if(iterate ==  current) {
                previous = current;
                current = current.next;
            }
        }
    }

    public static void main (String[] args) {
        Node n = RandomNodeList.randomNode(10,0,10);
        System.out.println("Node list with duplicates: " + n.printNodeList());
        // Remove duplicates
        deleteDuplicates(n);
        System.out.println("Result of node -> " + n.printNodeList());

    }

}