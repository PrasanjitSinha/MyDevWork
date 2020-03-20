package treePrograms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class ReverseOrderTraversal {

    static void reverorderTraversal(Node root){
        if(root == null){
            return;
        }
        Queue<Node> q = new ArrayDeque<>();
        Deque<Integer> stack = new ArrayDeque<>();
        q.add(root);
        Node curr;
        while(!q.isEmpty()){
            curr = q.poll();
            stack.push(curr.data);
            if(curr.left!=null){
                q.add(curr.left);
            }
            if(curr.right!=null){
                q.add(curr.right);
            }
        }
        while (!stack.isEmpty()){
            System.out.println(stack.poll() + " ");
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

        reverorderTraversal(root);
    }
}
