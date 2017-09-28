package Chapter2.Question4;

import Chapter2.Question1.util.*;

public class Answer {
    public Answer(){

    }

    public static Node plusTwoNode(Node n1, Node n2, int roundedValue) {
        if(n1 == null || n2 == null) {
            return null;
        }
        Node sumResult = new Node(roundedValue, null, null);
        int value = roundedValue;
        if(n1 != null) {
            value += n1.data;
        }
        if(n2 != null) {
            value += n2.data;
        }
        sumResult.data = value % 10;

        Node nextSumResult = plusTwoNode(n1 == null ? null: n1.next,n2==null ? null : n2.next, value > 10 ? 1 : 1);
        sumResult.setNextNode(nextSumResult);
        return sumResult;
    }

    public static void main(String[] args) {
        Node n1 = RandomNodeList.randomNode(10,0,10);
        Node n2 = RandomNodeList.randomNode(10, 0, 10);
        System.out.println("Node 1 list: " + n1.printNodeList());
        System.out.println("Node 2 list: " + n2.printNodeList());
        Node sumTwoNode = plusTwoNode(n1,n2,1);
        System.out.println("Total added: " + sumTwoNode.printNodeList());

    }
}