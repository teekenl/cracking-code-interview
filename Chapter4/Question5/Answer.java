package Chapter4.Question5;

import Chapter4.util.*;
import java.util.LinkedList;

public class Answer {
    public Answer(){

    }

    public static boolean isBinarySearchTree(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<TreeNode>();
        if(root!=null) {
            q.add(root);
        }
        TreeNode currentNode;

        while(!q.isEmpty()) {
            currentNode = q.removeFirst();
            if(currentNode.left != null) {
                if(currentNode.data < currentNode.left.data) {
                    return false;
                }
                q.add(currentNode.left);
            }
            if(currentNode.right != null) {
                if(currentNode.data > currentNode.right.data) {
                    return false;
                }
                q.add(currentNode.right);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(40);
        TreeNode node10 = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode node30 = new TreeNode(30);
        TreeNode node50 = new TreeNode(50);
        TreeNode node60 = new TreeNode(60);
        TreeNode node70 = new TreeNode(70);
        rootNode.left = node10;
        rootNode.right = node60;
        System.out.println(rootNode.printNode());
        System.out.println("The node is " + isBinarySearchTree(rootNode) + " binary search tree");
    }
}