//public class exchange_the_first_last_node {
//    public class Node{
//        int data;
//        Node next;
//        public Node(int data) {
//            this.data = data;
//        }
//    }
//    public Node head = null;
//    public Node tail = null;
//
//    public void add(int data){
//        Node newNode = new Node(data);
//        if(head == null) {
//            head = newNode;
//            tail = newNode;
//            newNode.next = head;
//        }
//        else {
//            tail.next = newNode;
//            tail = newNode;
//            tail.next = head;
//        }
//    }
//
//    public void display() {
//        Node current = head;
//        if(head == null) {
//            System.out.println("List is empty");
//        }
//        else {
//            System.out.println("Nodes of the circular linked list: ");
//            do{
//                System.out.print(" "+ current.data);
//                current = current.next;
//            }while(current != head);
//            System.out.println();
//        }
//    }
//     void exchangeNodes(Node head) {
////Enter your code here
//        Node temp = head;
//        while (temp.next.next != head){
//            temp = temp.next;
//        }
//        temp.next.next =head.next; // 4 -> 4
//        head.next = temp.next; // 1 -> 4
//        temp.next = head; // 3 -> 1
//        head = head.next;
//     }
//    public static void main(String[] args) {
//        exchange_the_first_last_node cl = new exchange_the_first_last_node();
//        //Adds data to the list
//        cl.add(1);
//        cl.add(2);
//        cl.add(3);
////        cl.add(4);
//        //Displays all the nodes present in the list
//        cl.display();
//        cl.exchangeNodes(cl.head);
//        cl.display();
//
//    }
//
//}
