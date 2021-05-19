public class Reverse_alternate_K_nodes {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        boolean isEmpty() {
            return size == 0;
        }

        int sizeLL() {
            return size;
        }

        void atLastInsert(int value) {
            Node temp = new Node();
            temp.data = value;
            temp.next = null;
            if (isEmpty()) {
                head = tail = temp;
            } else {

                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void atStartInsert(int value) {
            Node temp = new Node();
            temp.data = value;
            if (isEmpty()) {

                temp.next = null;
                head = tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void removeLast() {
            if (isEmpty()) {
                System.out.println("list is empty");
            } else if (head.next == null) {// or  (size == 1)
                head = tail = null;
                size--;
            } else {
                Node temp = head;

                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            }

        }

        void removeFirst() {
            if (isEmpty()) {
                System.out.println("list is empty");
            } else if (head.next == null) {
                head = tail = null;
                size--;
            } else {
                head = head.next;
                size--;
            }
        }

        void printLinkedList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }
        Node reverse(Node head, int k){
            if (k <=  1 || head == null || head.next == null){
                return head;
            }
            int i=0;
            Node curr = head;
            Node nxt = null;
            Node prev = null;
            while (i < k && curr!=null){
                nxt = curr.next;
                curr.next = prev;
                prev = curr;
                curr = nxt;
                i++;
            }
            i = 0;
            if (nxt !=null){
                head.next = nxt;
                curr = nxt;
                while (i < k - 1 && curr!=null){
                    curr = curr.next;
                    i++;
                }
                if (curr != null){
                    curr.next = reverse(curr.next, k);
                }
            }

            return prev;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.atLastInsert(1);
        llist.atLastInsert(2);
        llist.atLastInsert(3);
        llist.atLastInsert(4);
        llist.atLastInsert(5);
        llist.printLinkedList();
        System.out.println();
        llist.reverse(llist.head, 2);
        System.out.println();
        llist.printLinkedList();
    }
}
