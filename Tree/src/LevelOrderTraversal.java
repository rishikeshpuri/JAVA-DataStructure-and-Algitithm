import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int value){
            data = value;
            left = right = null;
        }
    }
    public static class BinaryTree{
        Node root;
        BinaryTree(int val){
            root = new Node(val);
        }
        BinaryTree(){
            root = null;
        }
    }
    public static int heightTree(Node node){
        int count=1;
        if (node == null){
            return -1;
        }
        int heightLeft = heightTree(node.left);
        int heightRight = heightTree(node.right);
        if (heightLeft > heightRight){
            return (1 + heightLeft);
        }
        else {
            return (1+ heightRight);
        }
    }
//    --------------------BY RECURSION-------------------
    public static void levelOrderTraversal(Node root){
        int h = heightTree(root);
        for (int i=0; i<= h; i++){
            printLevelOrder(root, i);
        }

    }
    public static void printLevelOrder(Node node, int level){
        if (node == null){
            return;
        }
        if (level == 0){
            System.out.print(node.data+" ");
            return;
        }
        else if (level > 0){
            printLevelOrder(node.left, level-1);
            printLevelOrder(node.right, level-1);
        }
    }
//    -----------------------------------------------------------
//    ----------------BY QUEUE----------------------------------
    public static void levelOderPrintQueue(Node node){
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        while (!q.isEmpty()){
            Node cur = q.poll();
            System.out.print(cur.data+" ");
//            q.remove();
            if (cur.left != null){
                q.add(cur.left);
            }
            if (cur.right != null){
                q.add(cur.right);
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
//        System.out.println(heightTree(tree.root));
//        levelOrderTraversal(tree.root);
//        System.out.println();
        levelOderPrintQueue(tree.root);
    }
}
