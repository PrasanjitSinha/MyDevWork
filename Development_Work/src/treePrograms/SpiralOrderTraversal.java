package treePrograms;

public class SpiralOrderTraversal {

    static boolean printLeftToRight(Node root, int level){
        if(root == null){
            return false;
        }
        if(level == 1){
            System.out.println(root.data + " ");
            return true;
        }
        boolean left = printLeftToRight(root.left,level-1);
        boolean right = printLeftToRight(root.right,level-1);

        return left || right;
    }
    static boolean printRightToLeft(Node root, int level){
        if(root == null){
            return false;
        }
        if(level == 1){
            System.out.println(root.data + " ");
            return true;
        }
        boolean right = printRightToLeft(root.right,level-1);
        boolean left = printRightToLeft(root.left,level-1);

        return right || left;
    }

    static void printSpiralOrderNodes(Node root){
        if(root == null){
            return;
        }
        int level =1;
        while(printLeftToRight(root,level++) && printRightToLeft(root,level++));
    }
    public static void main(String[] args) {
        Node root = new Node(15);
        root.left = new Node(10);
        root.right = new Node(20);
        root.left.left = new Node(8);
        root.left.right = new Node(12);
        root.right.left = new Node(16);
        root.right.right = new Node(25);

        printSpiralOrderNodes(root);
    }
}
