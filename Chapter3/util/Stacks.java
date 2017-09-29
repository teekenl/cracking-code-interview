package Chapter3.util;

import Chapter3.util.*;

public class Stacks {
    Node head;

    // Last In First Out basis
    public Object pop(){
        if(head != null) {
            Object item = head.data;
            head = head.next;
            return item;
        }
        return null;
    }

    public void push(Object item){
        Node t = new Node((int)item,null,null);
        t.next = head;
        head = t;     // 1 - > 2 - > 3 - > 4 - > ....
    }
}

