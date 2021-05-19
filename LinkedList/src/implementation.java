public class implementation {
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

            if (head == null){
                Node temp = new Node();
                temp.data = value;
                head = temp;
                head.next = null;
            }
            else {
                Node cur = head;
                while (cur.next !=null){
                    cur = cur.next;
                }
                Node temp = new Node();
                temp.data = value;
                cur.next = temp;
                temp.next = null;
            }
            size++;

        }
//        void atLastInsert(int value){
//            Node temp = new Node();
//            temp.data = value;
//            temp.next = null;
//            if (isEmpty()){
//                head = tail = temp;
//            }
//            else {
//
//                tail.next = temp;
//                tail = temp;
//            }
//            size++;
//        }

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
        void PrintLinkedList(){
            Node temp = head;
            while (temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.atLastInsert(1);
        llist.atLastInsert(2);
        llist.atLastInsert(3);
        llist.PrintLinkedList();
        System.out.println();
        llist.atStartInsert(5);
        llist.atStartInsert(6);
        llist.atStartInsert(7);
        llist.PrintLinkedList();
        llist.removeFirst();
        llist.removeFirst();
        System.out.println();
        llist.PrintLinkedList();
    }
}
