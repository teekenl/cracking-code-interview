package Chapter4.Question6;

import java.util.*;
import Chapter4.util.*;

public class Answer {
    public Answer(){

    }

    public TreeNode inorderSucc(TreeNode n) {
        if(n == null){
            return null;
        }
        // if it has right subtree, we get the leftmost child of tree.

        if (n.right != null) {
            return getLeftMostChild(n.right);
        } else {
            TreeNode previous = n;
            TreeNode nParent = n.parent;
            while(nParent != null && nParent.left != previous) {
                previous = nParent;
                nParent = n.parent;
            }
            return nParent;
        }
        return n.parent;
    }

    public TreeNode getLeftMostChild(TreeNode selectedNode) {
        while(selectedNode.left!=null) {
            selectedNode = selectedNode.left;
        }
        return selectedNode;
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
        node10.parent = rootNode;
        node60.parent = rootNode;

        System.out.println("The next node of tree (in-order) is " + );
    }
}