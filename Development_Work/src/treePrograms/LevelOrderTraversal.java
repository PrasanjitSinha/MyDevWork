package treePrograms;

//level order traversasl of tree....
public class LevelOrderTraversal {

    static boolean printLevel(Node root, int level){
        if(root == null){
            return false;
        }
        if(level == 1){
            System.out.println(root.data + " ");
            return true;
        }
        boolean left = printLevel(root.left,level-1);
        boolean right = printLevel(root.right,level-1);
        return left || right;
    }
    static void levelOrderTraversal(Node root){
        if(root == null){
            return;
        }
        int level = 1;
        while(printLevel(root,level)){
            level++;
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

        levelOrderTraversal(root);


    }
}
