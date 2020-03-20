package linkedList;

public class ReverseLinkedList {

    static Node head;

    Node reverse(Node head){
        Node curr = head, next = null,prev = null;
        while (curr!= null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
        return head;
    }

    void printList(Node head){
        while (head!=null){
            System.out.println(head.data + " ");
            head = head.next;
        }
    }
    public static void main(String[] args) {
        ReverseLinkedList list  = new ReverseLinkedList();
        list.head = new Node(85);
        list.head.next = new Node(15);
        list.head.next.next = new Node(4);
        list.head.next.next.next = new Node(20);

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }
}
