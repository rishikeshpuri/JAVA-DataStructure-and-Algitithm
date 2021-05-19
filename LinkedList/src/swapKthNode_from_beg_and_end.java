public class swapKthNode_from_beg_and_end {
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
        void swapKth(int k){
            int x = 1;
            int y = 1;
            if (size < k)
                return;
            if (2 * k - 1 == size)
                return;

            Node cur1 = head;
            Node prev1 = null;
            while (x < k){
                prev1 = cur1;
                cur1 = cur1.next;
                x++;
            }
//            Node temp1 = cur1;
//            temp1.data = cur1.data;

            Node cur2 = head;
            Node prev2 = null;
            while (y < size - k +1){
                prev2 = cur2;
                cur2 = cur2.next;
                y++;
            }

            if (prev1 != null){
                prev1.next = cur2;
            }
            if (prev2 != null){
                prev2.next = cur1;
            }

            Node temp3 = new Node();
            temp3.data = 0;
            temp3 = cur1.next;
            cur1.next = cur2.next;
            cur2.next = temp3;

            if (k == 1){
                head = cur2;
            }
            if (k == size){
                head = cur1;
            }
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
        System.out.println();

        llist.swapKth(2);
        llist.printLinkedList();
        System.out.println();
    }
}
