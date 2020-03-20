package treePrograms;

public class BinarySearchTree {

    class Node{
        int data;
        Node left = null,right=null;
        Node(int data){
            this.data = data;
        }
    }
    Node root;
    BinarySearchTree(){
        root = null;
    }

    void insert(int key){
        root = insertRecord(root,key);
    }

    Node insertRecord(Node root, int key){
        if(root == null){
            root = new Node(key);
            return root;
        }
        if(key < root.data){
            root.left = insertRecord(root.left, key);
        } else if(key > root.data){
            root.right = insertRecord(root.right, key);
        }
        return root;
    }

    void inorder(){
        inorder(root);
    }
    void inorder(Node root){
        if(root !=null){
            inorder(root.left);
            System.out.println(root.data +" ");
            inorder(root.right);
        }
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // print inorder traversal of the BST
        tree.inorder();
    }
}
