public class InsertNodeAt_Kth_position {
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
        void insertKthpos(int k, int value){
            int x = 1;
            Node cur = head;

            if (k == 1){
                Node temp = new Node();
                temp.data = value;
                temp.next = head;
                head = temp;
            }
            else {
                Node prev = null;
                while (x < k){
                    prev = cur;
                    cur = cur.next;
                    x++;
                }
                Node temp = new Node();
                temp.data = value;
                prev.next = temp;
                temp.next = cur;
            }

        }

    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.atLastInsert(1);
        llist.atLastInsert(3);
        llist.atLastInsert(2);
        llist.atLastInsert(4);
        llist.atLastInsert(5);
        llist.printLinkedList();
        System.out.println();
        llist.insertKthpos(2, 6);
        llist.printLinkedList();
    }
}
