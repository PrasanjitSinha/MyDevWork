package treePrograms;

public class ConvertMirrorBinaryTree {

    static void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static void swap(Node root){
        if(root == null){
            return;
        }
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }

    static void convertMirror(Node root){
        if(root == null){
            return;
        }
        convertMirror(root.left);
        convertMirror(root.right);
        swap(root);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        convertMirror(root);
        preOrder(root);
    }
}
