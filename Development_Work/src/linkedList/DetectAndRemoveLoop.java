package linkedList;

public class DetectAndRemoveLoop {

    static Node head;

    static int detectAndRemoveLoop(Node node){
        Node slow = node, fast =node;

        while (slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                removeLoop(slow , node);
                return 1;
            }
        }
        return 0;
    }
    static void removeLoop(Node loop, Node curr){
        Node pt1 =null, pt2= null;
        pt1 = curr;
        while (1==1){
            pt2 = loop;
            while (pt2.next!=loop && pt2.next!=pt1){
                pt2 = pt2.next;
            }
            if(pt2.next == pt1){
                break;
            }
            pt1 = pt1.next;
        }
        pt2.next = null;
    }

    void printList(Node node){
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        DetectAndRemoveLoop list = new DetectAndRemoveLoop();
        list.head = new Node(50);
        list.head.next = new Node(20);
        list.head.next.next = new Node(15);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        list.detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        list.printList(head);
    }
}
