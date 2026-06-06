public class LL1 {

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    static Node addAtHead(Node head, int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        return newNode;
    }

    static Node deleteAtHead(Node head) {
        if (head == null)
            return null;

        return head.next;
    }

    static Node addAtTail(Node head, int d) {
        Node newNode = new Node(d);

        if (head == null)
            return newNode;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static Node deleteAtTail(Node head) {

        if (head == null)
            return null;

        if (head.next == null)
            return null;

        Node temp = head;

        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;
        return head;
    }

    static Node deleteAtPos(Node head, int pos) {

        if (head == null)
            return null;

        if (pos == 1)
            return deleteAtHead(head);

        Node temp = head;

        for (int i = 1; i <= pos - 2 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null)
            return head;

        temp.next = temp.next.next;

        return head;
    }

    static Node addAtPos(Node head, int val, int pos) {

        if (pos == 1)
            return addAtHead(head, val);

        Node temp = head;

        for (int i = 1; i <= pos - 2 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null)
            return head;

        Node newNode = new Node(val);

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    static Node deleteWithData(Node head, int key) {

        if (head == null)
            return null;

        if (head.data == key)
            return head.next;

        Node temp = head;

        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

        return head;
    }

    static Node updateAtPos(Node head, int pos, int newValue) {

        if (head == null)
            return null;

        Node temp = head;

        for (int i = 1; i < pos && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null)
            return head;

        temp.data = newValue;

        return head;
    }

    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    static Node findMiddle(Node head) {

        if (head == null)
            return null;

        Node turtle = head;
        Node rabbit = head;

        while (rabbit != null && rabbit.next != null) {
            turtle = turtle.next;
            rabbit = rabbit.next.next;
        }

        return turtle;
    }

    static boolean detectCycle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Node head = null;

        head = addAtHead(head, 30);
        head = addAtHead(head, 20);
        head = addAtHead(head, 10);

        System.out.println("After addAtHead:");
        printList(head);

        head = addAtTail(head, 40);
        head = addAtTail(head, 50);

        System.out.println("After addAtTail:");
        printList(head);

        head = addAtPos(head, 25, 3);

        System.out.println("After addAtPos (25 at position 3):");
        printList(head);

        head = deleteAtHead(head);

        System.out.println("After deleteAtHead:");
        printList(head);

        head = deleteAtTail(head);

        System.out.println("After deleteAtTail:");
        printList(head);

        head = deleteAtPos(head, 3);

        System.out.println("After deleteAtPos (position 3):");
        printList(head);

        head = updateAtPos(head, 2, 99);

        System.out.println("After updateAtPos (position 2 = 99):");
        printList(head);

        Node middle = findMiddle(head);

        if (middle != null) {
            System.out.println("Middle Node = " + middle.data);
        }

        System.out.println("Cycle Present: " + detectCycle(head));

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;

        System.out.println("Cycle Present: " + detectCycle(head));

    }

}