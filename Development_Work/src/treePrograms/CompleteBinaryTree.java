package treePrograms;

import java.util.ArrayDeque;
import java.util.Queue;

public class CompleteBinaryTree {

    static boolean isComplete(Node root){
        if(root == null){
            return false;
        }
        Queue<Node> q = new ArrayDeque<>();
        Node curr;
        boolean flag = false;
        q.add(root);
        while (!q.isEmpty()){
            curr = q.poll();
            if(flag && (curr.left!=null || curr.right!=null)){
                return false;
            }
            if(curr.left==null && curr.right != null ){
                return false;
            }
            if(curr.left!=null){
                q.add(curr.left);
            } else {
                flag = true;
            }
            if(curr.right!=null){
                q.add(curr.right);
            } else {
                flag = true;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        if(isComplete(root)){
            System.out.println("complete binary tree");
        } else{
            System.out.println("not complete binary tree");
        }

    }
}
