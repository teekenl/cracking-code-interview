package Chapter2.Question1.util;

public class RandomNodeList {

    public RandomNodeList(int N, int min, int max) {

    }

    private static int randomInt(int n) {
        return (int) (Math.random() * n);
    }

    private static int randomIntInRange(int min, int max) {
        return randomInt(max + 1 - min) + min;
    }

    public static Node randomNode(int N, int min,int max) {
        Node root = new Node(randomIntInRange(min,max),null,null);
        Node prev = root;
        for(int i = 0; i <  N; i++) {
            int data = randomIntInRange(min, max);
            Node next = new Node(data, null, null);
            prev.setNextNode(next);
            prev = next;
        }
        return root;
    }

}
