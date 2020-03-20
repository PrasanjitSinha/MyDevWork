package treePrograms;

import java.util.concurrent.atomic.AtomicInteger;

public class DiameterBinaryTree {

    static int getDiameter(Node root, AtomicInteger diameter){
        if(root == null){
            return 0;
        }
        int left = getDiameter(root.left, diameter);
        int right = getDiameter(root.right, diameter);

        int max = left+right +1;
        diameter.set(Math.max(diameter.get(), max));

        return Math.max(left , right) +1;
    }

    static int getDiameter(Node root){
        AtomicInteger dia = new AtomicInteger(0);
        getDiameter(root, dia);
        return dia.get();
    }
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        System.out.println("diametere of tree is ---" + getDiameter(root));


    }
}
