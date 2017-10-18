package Chapter4.Question7;

import java.util.*;
import Chapter4.util.*;

public class Answer{
    public Answer(){

    }

    // Check n is descendant of root in Binary Tree.
    private static boolean isUnderRoot(TreeNode root, TreeNode n){
        if(root == null) return false;
        if(root == n) return true;
        return isUnderRoot(root.left, n) || isUnderRoot(root.right, n);
    }

    private static TreeNode findAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) return null;
        // if the subnode is already the root of BT
        if(root == p || root == q) return root;
        // if they are from the side of sub-tree
        if(isUnderRoot(root.left,p) != isUnderRoot(root.left,q)) return root;
        return findAncestor((isUnderRoot(root.left,p)?root.left:root.right), p, q);
    }

    private static TreeNode firstAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        // if one of child node is not descendant of Binary Tree
        if(!isUnderRoot(root,p) || !isUnderRoot(root,q)) return null;
        return findAncestor(root,p,q);
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
        rootNode.right = node20;

        System.out.println("The node is " + rootNode.printNode());
        System.out.println("The common ancestor for 10 and 20 is " +
                    firstAncestor(rootNode,node10,node20).data);
    }
}