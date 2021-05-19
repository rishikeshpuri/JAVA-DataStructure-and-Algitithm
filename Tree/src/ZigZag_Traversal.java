import java.util.ArrayList;
import java.util.Stack;

public class ZigZag_Traversal {
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
    public static ArrayList<Integer> zigzagTraversal(Node node){
        ArrayList<Integer> list = new ArrayList<>();
        if (node == null){
            return list;
        }
        Stack<Node> st1 = new Stack<>();
        Stack<Node> st2 = new Stack<>();
        st1.push(node);
        while (!st1.isEmpty() || !st2.isEmpty() ){
            while (!st1.isEmpty()){
                Node x = st1.pop();
                list.add(x.data);
                if (x.left != null){
                    st2.push(x.left);
                }
                if (x.right != null){
                    st2.push(x.right);
                }
            }
            while (!st2.isEmpty()){
                Node y = st2.pop();
                list.add(y.data);
                if (y.right != null){
                    st1.push(y.right);
                }
                if (y.left != null){
                    st1.push(y.left);
                }
            }

    }
        return list;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(zigzagTraversal(tree.root));
    }
}
