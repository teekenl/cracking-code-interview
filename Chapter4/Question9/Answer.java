package Chapter4.Question9;

import java.util.*;
import Chapter4.util.*;

public class Answer {
    public Answer(){

    }

    static int depthBT(TreeNode node) {
        if(node == null) return 0;
        return Math.max((1 + depthBT(node.left)),(1 + depthBT(node.right)));
    }

    static void display(int[] path, int level) {
        String node_path = "";
        for(int i = 0; i<path.length; i++) {
            node_path = node_path.concat(path[i] + " -> ");
        }
        if(node_path.equals("")) {
            System.out.println("The path is not found");
        } else{
            System.out.println(node_path);
        }
    }

    static void sumReduceBT(TreeNode node, int[] path, int total, int level, int sum) {
        if(node == null) return; // exit(0) if there's no more node left.
        total += node.data;
        path[level] = node.data;
        level++;
        if(total == sum) {
            display(path,level);
            return; // exit(0) if the path is found.
        }
        sumReduceBT(node.left,path,total,level,sum);
        sumReduceBT(node.right,path,total,level,sum);
    }

    static void findSum(TreeNode node, int sum) {
        if(node == null) {
            return;
        }
        int height = depthBT(node);
        int[] path = new int[height];

        sumReduceBT(node, path, 0, 0, sum);
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

        System.out.println("The node is " + rootNode.printNode());
        System.out.print("The path of node with a sum value is ");
        findSum(rootNode,50);
    }
}