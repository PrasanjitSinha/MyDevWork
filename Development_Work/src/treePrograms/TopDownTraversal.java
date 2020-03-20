package treePrograms;

import java.util.ArrayDeque;
import java.util.Queue;

public class TopDownTraversal {

    static void printTopDownNodes(Node root){
        if (root == null){
            return;
        }
        Queue<Node> q1 = new ArrayDeque<>();
        Queue<Node> q2 = new ArrayDeque<>();
        q1.add(root.left);
        q2.add(root.right);
        while (!q1.isEmpty()){
            int n = q1.size();
            while (n-- > 0){
                Node x = q1.poll();
                System.out.println(x.data + " ");
                if(x.left!=null){
                    q1.add(x.left);
                }
                if(x.right!=null){
                    q1.add(x.right);
                }
                Node y = q2.poll();
                System.out.println(y.data + " ");
                if(y.right!=null){
                    q2.add(y.right);
                }
                if(y.left!=null){
                    q2.add(y.left);
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

        printTopDownNodes(root);
    }
}
