package linkedList;

public class MiddleLinkedList {

    static Node head;
    void printMiddle(){
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println("middle element is " +slow.data + " ");
    }
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList(){
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data+"->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args) {
        MiddleLinkedList list  = new MiddleLinkedList();
        for (int i=5; i>0; --i) {
            list.push(i);
            list.printList();
            list.printMiddle();
        }
    }
}
