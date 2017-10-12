package Chapter4.Question3;

import Chapter4.util.*;

public class Answer{
    public Answer() {

    }

    public static TreeNode addToTree(int arr[], int start, int end) {
        if(start > end) {
            return null;
        }
        int mid = (end +  start) / 2;
        TreeNode n = new TreeNode(arr[mid]);
        n.left = addToTree(arr, start, mid-1);
        n.right = addToTree(arr, mid+1, end);
        return n;
    }

    public static TreeNode createBT(int arr[]){
        return addToTree(arr,0,arr.length-1);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        TreeNode node = createBT(arr);
        System.out.println(node.printNode());

    }
}