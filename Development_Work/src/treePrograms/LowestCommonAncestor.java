package treePrograms;

public class LowestCommonAncestor {

    static class NodeWrapper{
        Node node;
        NodeWrapper(Node node){
            this.node = node;
        }
    }
    static boolean isNodepresent(Node root,Node node){
        if(root == null){
            return false;
        }
        if(root == node){
            return true;
        }
        return isNodepresent(root.left,node) || isNodepresent(root.right,node);
    }

    static boolean findLCA(Node root, NodeWrapper lca, Node x, Node y){
        if(root == null){
            return false;
        }
        if(root == x || root == y){
            return true;
        }
        boolean left = findLCA(root.left, lca,x,y);
        boolean right = findLCA(root.right,lca,x,y);
        if(left && right){
            lca.node = root;
        }
        return left|| right;
    }

    static void findLowestAncestor(Node root, Node x, Node y){
        Node lca = null;
        NodeWrapper rap = new NodeWrapper(lca);
        if(isNodepresent(root,y) && isNodepresent(root,x)){
            findLCA(root,rap,x,y);
            lca = rap.node;
        }
        if(rap!=null){
            System.out.println("ancestor is " + lca.data);
        } else{
            System.out.println("ancestor dont exist....");
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

        findLowestAncestor(root, root.left.left,root.right.right);
    }
}
