import java.util.LinkedList;
import java.util.Queue;

public class RightViewOfBinaryTree {
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
//    public static void rightView(Node node){
//        if (node == null){
//            return;
//        }
//        Queue<Node> q = new LinkedList<>();
//        q.add(node);
//        while (!q.isEmpty()){
//            int len = q.size();
//            for (int i=0; i<len; i++){
//                Node cur = q.poll();
//                if (i == len-1){
//                    System.out.print(cur.data+" ");
//                }
//                if (cur.left != null){
//                    q.add(cur.left);
//                }
//                if (cur.right != null){
//                    q.add(cur.right);
//                }
//            }
//
//        }
//    }
public static void rightView(Node node){
    if (node == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(node);
    q.add(null);
    while (!q.isEmpty()){
        Node cur = q.poll();
        if (cur == null){
            if (!q.isEmpty()){
                q.add(null);
                continue;
//                System.out.println();
            }
        }
        else {
            if (cur.left != null){
                q.add(cur.left);
            }
            if (cur.right != null){
                q.add(cur.right);
            }
            if (q.peek() == null){
                System.out.print(cur.data+" ");
            }
        }
    }
}
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        rightView(tree.root);
    }
}
