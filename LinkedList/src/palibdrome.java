import java.util.Stack;

public class palibdrome {
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
        boolean palin(Node head){
            if (head == null || head.next == null){
                return true;
            }
            Node slow = head;
            Node fast = head;
            Stack<Node> stk = new Stack<>();
            stk.push(slow);

            while (fast.next != null && fast.next.next != null){
                slow = slow.next;
                fast = fast.next.next;
                stk.push(slow);
            }
            if (fast.next == null){
                stk.pop();
            }

            Node secondHalf = slow.next;
            while (secondHalf != null){
                if (stk.pop().data != secondHalf.data){
                    return false;
                }
                secondHalf = secondHalf.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        llist.atLastInsert(1);
        llist.atLastInsert(2);
        llist.atLastInsert(2);
        llist.atLastInsert(1);
        llist.printLinkedList();
        System.out.println();
        System.out.println(llist.palin(llist.head));
//        llist.printLinkedList();
    }
}
