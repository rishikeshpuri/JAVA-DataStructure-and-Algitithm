import java.util.LinkedList;
import java.util.Queue;

public class Sum_of_leaves {
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
//    ---------1ST METHOD-------------
    public static int sum = 0;
    public static void leafSum(Node node){
        if (node == null){
            return;
        }

        if (node.left == null && node.right == null){
            sum += node.data;
        }
        leafSum(node.left);
        leafSum(node.right);

    }
//-----------------------------------------------------------
//                  2ND METHOD
    public static int sumAllLeafNode(Node node){
        if (node == null){
            return 0;
        }
        if (node.left == null && node.right == null){
            return node.data;
        }
        return sumAllLeafNode(node.left) + sumAllLeafNode(node.right);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        leafSum(tree.root);
        System.out.println(sum);
        System.out.println("-----------------");
        System.out.println(sumAllLeafNode(tree.root));
    }
}
