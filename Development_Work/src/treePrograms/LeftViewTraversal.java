package treePrograms;

import java.util.ArrayDeque;
import java.util.Queue;

public class LeftViewTraversal {

    static void printLeftView(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new ArrayDeque<>();
        Node curr;
        q.add(root);
        int i=0;
        while (!q.isEmpty()){
            int n = q.size();
            while (i++ < n){
                curr = q.poll();
                if(i==1){
                    System.out.println(curr.data + " ");
                }
                if(curr.left!=null){
                    q.add(curr.left);
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        printLeftView(root);
    }
}
