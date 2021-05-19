public class add_1 {
    public static class Node{
        int data;
        Node next;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;

        boolean isEmpty(){
            return size == 0;
        }

        int sizeLL(){
            return size;
        }

        void atLastInsert(int value){
            Node temp = new Node();
            temp.data = value;
            temp.next = null;
            if (isEmpty()){
                head = tail = temp;
            }
            else {

                tail.next = temp;
                tail = temp;
            }
            size++;
        }

        void atStartInsert(int value){
            Node temp = new Node();
            temp.data = value;
            if (isEmpty()){

                temp.next = null;
                head = tail = temp;
            }
            else {
                temp.next = head;
                head = temp;
            }
            size++;
        }
        void removeLast(){
            if (isEmpty()){
                System.out.println("list is empty");
            }
            else if (head.next == null){// or  (size == 1)
                head = tail= null;
                size--;
            }
            else {
                Node temp = head;

                while (temp.next.next != null){
                    temp = temp.next;
                }
                temp.next = null;
                tail = temp;
                size--;
            }

        }
        void removeFirst(){
            if (isEmpty()){
                System.out.println("list is empty");
            }
            else if (head.next == null){
                head = tail = null;
                size--;
            }
            else {
                head = head.next;
                size--;
            }
        }
        void printLinkedList(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        void add_digit_1(){
            int carry = 1;
            Node temp = head;
            Node prev = null;
            while (temp != null && carry > 0){
                int sum = temp.data + carry;
                temp.data = sum % 10;
                carry = sum / 10;
                prev = temp;
                temp = temp.next;
            }
            if (carry > 0){
                Node x = new Node();
                x.data = carry;
                prev.next = x;
                x.next = null;
            }
        }
    }
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
//        llist.atLastInsert(9);
//        llist.atLastInsert(9);
//        llist.atLastInsert(9);
        llist.atLastInsert(9);
        llist.atLastInsert(5);
        llist.atLastInsert(1);


        llist.printLinkedList();
        System.out.println();
        llist.add_digit_1();
        llist.printLinkedList();
    }
}
