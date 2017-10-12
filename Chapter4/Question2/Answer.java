package Chapter4.Question2;

import Chapter4.util.*;

import java.util.LinkedList;

public class Answer {
    public enum State {
        Unvisited, Visited, Visiting;
    }
    public Answer(){

    }
    public static boolean search(TreeNode start, TreeNode end) {
        LinkedList<TreeNode> q = new LinkedList<TreeNode>(); // operates as queue
        q.add(start);
        TreeNode currentNode;
        while(!q.isEmpty()) {
            currentNode = q.removeFirst(); // poll does the same thing
            if(currentNode != null) {
                for(TreeNode adjacent:  currentNode.getAdjacent()) {
                    if(adjacent == end) {
                        return true;
                    } else{
                        q.add(adjacent);
                    }
                }
            }
        }
        return false;
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
        node10.left = node30;
        node10.right = node50;
        node20.right = node60;

        System.out.println("The path from 40 to 60 is " + search(rootNode,node60));
    }
}