public class MergeList {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
        }
    }

    static Node merge(Node l1, Node l2) {
        Node dummy = new Node(0);
        Node tail = dummy;  

        while (l1 != null && l2 != null) {
            if (l1.data < l2.data) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {

        Node l1 = new Node(15);
        l1.next = new Node(30);
        l1.next.next = new Node(45);
        l1.next.next.next = new Node(60);
        l1.next.next.next.next = new Node(75);

        Node l2 = new Node(1);
        l2.next = new Node(10);
        l2.next.next = new Node(20);
        l2.next.next.next = new Node(50);
        l2.next.next.next.next = new Node(65);
        l2.next.next.next.next.next = new Node(70);

        Node res = merge(l1, l2);
        print(res);
    }
}