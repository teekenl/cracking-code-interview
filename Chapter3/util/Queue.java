package Chapter3.util;

public class Queue {
    Node first, last;


    // First In First Out
    public void enqueue(Object item) {
           Node t = new Node((int) item, null, null);
        if(first == null) {
            first = t;
        } else{
            t.next = new Node((int)item, null, null);
            t = t.next;
        }
    }

    public Object dequeue() {
        if (first != null) {
            Object item = first.data;
            first = first.next;
            return item;
        }
        return null;
    }
}
