import java.util.LinkedList;
import java.util.Queue;

public class LeftViewOfBinaryTree {
    public static class Node{
        int data;
        Node left;
        Node right;
        Node(int val){
            data = val;
            left = right = null;
        }
    }
    public static class BinaryTree{
        Node root;
        BinaryTree(int value){
            root = new Node(value);
        }
        BinaryTree(){
            root = null;
        }
    }
//    public static void leftView(Node node){
//        if (node == null){
//            return;
//        }
//        Queue<Node> q = new LinkedList<>();
//        q.add(node);
//        while (!q.isEmpty()){
//            int len = q.size();
//            for (int i=0; i<len;i++){
//                Node cur = q.poll();
//                if (i == 0){
//                    System.out.print(cur.data +" ");
//                }
//                if (cur.left != null){
//                    q.add(cur.left);
//                }
//                if (cur.right != null){
//                    q.add(cur.right);
//                }
//            }
//        }
//    }
//    ---------------------OR--------------------
public static void leftView(Node node){
    if (node == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    q.add(null);
    assert q.peek() != null;
    System.out.print(q.peek().data+" ");
    while (!q.isEmpty()){
        Node cur = q.poll();

        if (cur == null){
            if (!q.isEmpty()){
                q.add(null);
                if (q.peek() != null){
                    System.out.print(q.peek().data+" ");
                    continue;
                }

            }
        }
        else {
            if (cur.left != null){
                q.add(cur.left);
            }
            if (cur.right != null){
                q.add(cur.right);
            }
        }
    }
}
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(5);
        tree.root.left.right = new Node(3);
        tree.root.right.right = new Node(7);
        tree.root.left.left.left = new Node(6);
        tree.root.right.right.right = new Node(8);
        tree.root.right.right.right.right = new Node(9);
        leftView(tree.root);
    }
}
