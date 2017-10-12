package Chapter4.Question1;

import Chapter4.util.*;

public class Answer{
    public Answer() {

    }

    public static int maxDepth(TreeNode node) {
        if(node == null)  return 0;
        return 1 + Math.max(maxDepth(node.left),maxDepth(node.right));
    }

    public static int minDepth(TreeNode node) {
        if(node == null)  return 0;
        return 1 + Math.min(minDepth(node.left),minDepth(node.right));
    }

    public static boolean isBalancedTree(TreeNode root) {
        System.out.println(maxDepth(root));
        System.out.println(minDepth(root));
        return (maxDepth(root) - minDepth(root)) <= 1;
    }

    public static void main (String[] args) {
        TreeNode rootNode = new TreeNode(40);
        TreeNode node10 = new TreeNode(10);
        TreeNode node20 = new TreeNode(20);
        TreeNode node30 = new TreeNode(30);
        TreeNode node50 = new TreeNode(50);
        TreeNode node60 = new TreeNode(60);

        rootNode.left = node10;
        rootNode.right = node20;
        node10.left = node30;
        node10.right = node50;
        node20.right = node60;

        /*
         *        40
         *    10     20
         *  30  50      60
         *
         * This is binary tree.
         */

        System.out.println("The node example is:" + rootNode.printNode());
        System.out.println("The node's balancing " + isBalancedTree(rootNode));
    }
}