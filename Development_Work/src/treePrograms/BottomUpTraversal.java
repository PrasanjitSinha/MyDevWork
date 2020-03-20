package treePrograms;

import org.omg.CORBA.BAD_QOS;

import java.util.*;

public class BottomUpTraversal {

    static void insertintoMap(Map<Integer, List<Integer>> map, Integer key, Integer value){
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    static void printNodesBottomUp(Node root){
        if(root == null){
            return;
        }
        Map<Integer, List<Integer>> map = new HashMap<>();
        int level = 1;
        insertintoMap(map,level,root.data);
        Queue<Node> q1 = new ArrayDeque<>();
        Queue<Node> q2 = new ArrayDeque<>();
        q1.add(root.left);
        q2.add(root.right);
        while (!q1.isEmpty()){
            int n = q1.size();
            level++;
            while (n-- >0){
                Node x = q1.poll();
                insertintoMap(map,level,x.data);
                if (x.left!=null){
                    q1.add(x.left);
                }
                if(x.right!=null){
                    q1.add(x.right);
                }
                Node y = q2.poll();
                map.get(level).add(y.data);
                if(y.right!=null){
                    q2.add(y.right);
                }
                if(y.left!=null){
                    q2.add(y.left);
                }
            }
        }
        for (int i = map.size();i>=0;i--){
            System.out.println(map.get(i) + " ");
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

        printNodesBottomUp(root);
    }
}
