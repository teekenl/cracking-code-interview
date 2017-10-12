package Chapter4.util;

import java.util.LinkedList;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }

    public LinkedList<TreeNode> getAdjacent() {
        LinkedList<TreeNode> adjacent = new LinkedList<TreeNode>();
        if(this.left!=null) {
            adjacent.add(this.left);
        }
        if(this.right!=null) {
            adjacent.add(this.right);
        }
        return adjacent;
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