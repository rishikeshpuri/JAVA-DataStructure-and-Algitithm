import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Stack;

public class InorderTraversal {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int val) {
            data = val;
            left = right = null;
        }
    }
    static class BinaryTree{
        Node root;
        BinaryTree(int value){
            root = new Node(value);
        }
        BinaryTree(){
            root = null;
        }
    }
    
    
    static HashMap<Integer, Node[]> mp = new HashMap<>();

    public static void buildTree() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<=n; i++){
            int l = scn.nextInt();
            int r = scn.nextInt();
            Node arr1[] = new Node[2];
            if(l == -1){
                arr1[0] = null;
            }
            else{
                arr1[0] = new Node(l);
            }
            if(r==-1){
                arr1[1] = null;
            }
            else{
                arr1[1] = new Node(r);
            }
            mp.put(i, arr1);
        }
    }
//    ----------ASK-----------------
//    public static void inOrderTree(){
//        Stack<Node> stk = new Stack<>();
//        Node root = new Node(1);
//        stk.push(root);
//        Node cur = root;
//        while (cur != null || !stk.isEmpty()){
//            int curData = cur.data;
//            Node[] arr = mp.get(curData);
//            while (cur != null){
//                stk.push(cur);
//                cur = arr[0];
//
//            }
//            cur = stk.pop();
//            System.out.print(cur.data+" ");
//            cur = arr[1];
//        }
//    }
//    -----------------------------------------------------
public static void inOrderTree(Node root){
        if (root == null){
            return;
        }
        Node[] arr = mp.get(root.data);
        inOrderTree(arr[0]);
        System.out.print(root.data+" ");
        inOrderTree(arr[1]);
}

    public static void inOrderTraversalTree(Node node){
        if (node == null){
            return;
        }
        Stack<Node> stk = new Stack<>();
        Node cur = node;
        while (cur != null || !stk.isEmpty()){
            while (cur != null){
                stk.push(cur);
                cur = cur.left;

            }
            cur = stk.pop();
            System.out.print(cur.data+" ");
            cur = cur.right;
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
//        inOrderTraversalTree(tree.root);
        buildTree();
        Node root = new Node(1);
        inOrderTree(root);
    }
}
