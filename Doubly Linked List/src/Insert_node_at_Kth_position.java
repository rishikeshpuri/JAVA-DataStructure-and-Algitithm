public class Insert_node_at_Kth_position {
    public static class Node{
        int data;
        Node next;
        Node prev;
    }
    public static class DoublyLL{
        Node head;
        Node tail;
        int size;

        boolean isEmpty(){
            return size == 0;
        }

        int sizeDLL(){
            return size;
        }
        void atLastInsert(int value){

            if (isEmpty()){
                Node temp = new Node();
                temp.data = value;
                temp.next = null;
                temp.prev = null;
                head = temp;
            }
            else {
                Node cur = head;
                while (cur.next != null){
                    cur = cur.next;
                }
                Node temp = new Node();
                temp.data = value;
                cur.next = temp;
                temp.prev = cur;
                temp.next = null;
            }
            size++;
        }

        void atStartInsert(int value){
            if (isEmpty()){
                Node temp = new Node();
                temp.data = value;
                temp.next = null;
                temp.prev = null;
                head = temp;
            }
            else {
                Node temp = new Node();
                temp.data = value;
                temp.prev = null;
                temp.next = head;
                head.prev = temp;
                head = temp;
            }
            size++;
        }
        void removeLast(){
            if (isEmpty()){
                System.out.println("list is empty");
            }
            else if (head.next == null){
                head= tail=null;
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
                head.prev = null;
                size--;
            }
        }

        void PrintDLinkedList(){
            Node temp = head;
            Node last = null;
            System.out.println("Forward direction");
            while (temp != null){
                System.out.print(temp.data+" ");
                last = temp;
                temp = temp.next;
            }
            System.out.println();
            System.out.println("Reverse direction");
            while (last != null){
                System.out.print(last.data+" ");
                last = last.prev;
            }
        }
        void insertKthpos(int K, int P){
            int x = 1;
            Node cur = head;

            if (K == 1){
                Node temp = new Node();
                temp.data = P;
                temp.next = head;
                head.prev = temp;
                head = temp;
                head.prev = null;
            }
            else {
                Node pre = null;
                while (x < K){
                    pre = cur;
                    cur = cur.next;
                    x++;
                }
                Node temp = new Node();
                temp.data = P;
                pre.next = temp;
                temp.prev = pre;
                temp.next = cur;
                cur.prev = temp;
            }

        }
    }
    public static void main(String[] args) {
        DoublyLL llist = new DoublyLL();
        llist.atLastInsert(1);
        llist.atLastInsert(2);
        llist.atLastInsert(3);
        llist.atLastInsert(4);
        llist.atLastInsert(5);
        llist.PrintDLinkedList();
        System.out.println();
        llist.insertKthpos(5, 10);
        llist.PrintDLinkedList();


    }

}
