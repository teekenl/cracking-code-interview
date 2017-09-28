package Chapter2.Question1.util;


public class Node {
    public Node previous;
    public Node next;
    public int data;
    public Node(int d, Node prev, Node next) {
        this.data = d;
        this.setPreviousNode(prev);
        this.setNextNode(next);
    }
    public void appendToTail(int d) {
        Node end = new Node(d, this,null);
        Node n = this;
        while(n.next != null) { n = n.next; }
        n.next = end;
    }

    public void setNextNode(Node n ) {
        this.next = n;
        if (n != null && n.previous != this) {
            n.setPreviousNode(this);
        }
    }

    public void setPreviousNode(Node n ) {
        this.previous = n;
        if( n != null && n.next != this) {
            n.setNextNode(this);
        }
    }

    public String printNodeList() {
        if(this.next != null) {
            return data + " -> " + this.next.printNodeList();
        } else{
            return ((Integer) data).toString();
        }
    }
}

