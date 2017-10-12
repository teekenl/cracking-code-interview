package Chapter4.util;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public String printNode() {
        String node_message = "";
        node_message += data;
        if(this.left != null) {
            node_message += this.left.printNode();
        }
        if(this.right != null) {
            node_message += this.right.printNode();
        }
        return node_message;
    }

}