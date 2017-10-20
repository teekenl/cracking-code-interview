package Chapter4.Question8;

import java.util.*;
import Chapter4.util.*;

public class Answer {
    public Answer(){

    }
    static boolean isSubTree(TreeNode t1, TreeNode t2) {
        if(t2 == null) { // The empty tree is always a subtree.
            return true;
        }
        return checkSubTree(t1,t2);
    }

    static boolean isMatchTree(TreeNode t1, TreeNode t2) {
        if(t1 == null && t2 == null) {
            return true;  // nothing left in the subtree.
        }
        if(t1 == null || t2 == null) {
            return false;  // if one of them is not matched.
        }
        return isMatchTree(t1.left,t2.left) && isMatchTree(t1.right,t2.right);
    }

    static boolean checkSubTree(TreeNode t1, TreeNode t2) {
        if(t1 == null) return false; // the root' BT should not be empty
        if(t1.data == t2.data) {
            return isMatchTree(t1,t2);
        }
        return checkSubTree(t1.left,t2) || checkSubTree(t1.right,t2); // we need the left & right hand side of tree.
    }

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(40);
        TreeNode node10 = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode node30 = new TreeNode(30);
        TreeNode node50 = new TreeNode(50);
        TreeNode node60 = new TreeNode(60);
        TreeNode node70 = new TreeNode(70);
        // Tree t1
        rootNode.left = node10;
        // Tree t2
        node10.right = node30;
        // Tree t2 (not a sub tree)
        node50.right = node60;

        System.out.println(rootNode.printNode());
        System.out.println("The second node is " + isSubTree(rootNode,node10) + " sub-tree of first node");
        System.out.println("The second node is " + isSubTree(rootNode,node50)+ " sub-tree of first node");
    }
}