package Chapter4.Question4;

import Chapter4.util.*;
import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class Answer{
    public Answer(){

    }

    public static ArrayList<LinkedList<TreeNode>> findLevelBT(TreeNode root){
        int level = 0;
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
        LinkedList<TreeNode> list = new LinkedList<TreeNode>();
        list.add(root);
        result.add(level,list);
        for(;;){
            list = new LinkedList<TreeNode>();
            for(int i =0; i<result.get(level).size(); i++) {
                TreeNode currentNode = result.get(level).get(i);
                if(currentNode!=null) {
                    if(currentNode.left !=null) {
                        list.add(currentNode.left);
                    }
                    if(currentNode.right != null) {
                        list.add(currentNode.right);
                    }
                }
            }
            if(list.size() > 0) {
                result.add(level+1,list);
            } else{
                break;
            }
            level++;
        }
        return result;
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

        /*
         *  40
         *
         * 10  20
         * 30 50   60
         */

        System.out.println("The number linked list at this BT:" + findLevelBT(rootNode).size());
    }
}