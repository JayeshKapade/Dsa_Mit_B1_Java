public class ADLL {

    static class Node{
        int data;
        Node next;
        Node(int d){
            this.data = d;
            this.next = null;
        }
    }

    static void printList(Node head){
    if(head == null) return;
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data + "->");
        temp = temp.next;
    }
    System.out.println("null");
    }
    static Node reverse(Node head){
    if(head == null) return null;
    Node prev = null;
    Node curr = head;
    Node next;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
    }
    static Node addLList(Node head1,Node head2){
    if(head1 == null && head2 == null) return null;
    if(head1 == null) return head2;
    if(head2 == null) return head1;
    Node temp1 = reverse(head1);
    Node temp2 = reverse(head2);
    int c=0;
    Node res = new Node(-1);

    while(temp1!=null && temp2!=null){
        int sum = temp1.data + temp2.data + c;
        Node newNode = new Node(sum%10);
        c = sum/10;
        newNode.next = res.next;
        res.next = newNode;
        temp1 = temp1.next;
        temp2 = temp2.next;
    }
    while(temp1 != null){
        Node newNode = new Node(temp1.data);
        newNode.next = res.next;
        res.next = newNode;
        temp1 = temp1.next;
    }
    while(temp2 != null){
        Node newNode = new Node(temp1.data);
        newNode.next = res.next;
        res.next = newNode;
        temp2 = temp2.next;
    }
    if(c!= 0){
        Node newNode = new Node(c);
        newNode.next = res.next;
        res.next = newNode;
    }
    return res.next;
    }


    public static void main(String[] args){
        Node head1 = new Node(7);
        head1.next = new Node(4);
        head1.next.next = new Node(3);

        Node head2 = new Node(6);
        head2.next = new Node(8);
        head2.next.next = new Node(9);

        Node head3 = addLList(head1, head2);
        printList(head3);

    }
    
}
