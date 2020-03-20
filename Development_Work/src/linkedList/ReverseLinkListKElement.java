package linkedList;

public class ReverseLinkListKElement {

    static Node head;
    Node reverse(Node head, int k){
        Node prev = null, next = null, curr = head;
        int count = 0;
        while(curr!=null && count < k){
            next  = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            count++;
        }
        if(head!=null){
            head.next = reverse(next, k);
        }
        return prev;
    }

    void push(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[] args) {
        ReverseLinkListKElement llist = new ReverseLinkListKElement();
        llist.push(9);
        llist.push(8);
        llist.push(7);
        llist.push(6);
        llist.push(5);
        llist.push(4);
        llist.push(3);
        llist.push(2);
        llist.push(1);

        System.out.println("Given Linked List");
        llist.printList();

        llist.head = llist.reverse(llist.head, 3);

        System.out.println("Reversed list");
        llist.printList();
    }
}
