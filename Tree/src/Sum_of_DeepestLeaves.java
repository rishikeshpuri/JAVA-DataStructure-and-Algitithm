import java.util.LinkedList;
import java.util.Queue;

public class Sum_of_DeepestLeaves {
    public static class Node{
        int data;
        Node left;
        Node right;
        int height;
        Node(int val){
            data = val;
            left = right = null;
            int height = 0;
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
    public static int deepestSum(Node node){
        if (node == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        int level_sum = 0;
        while (!q.isEmpty()) {
            level_sum = 0;
            int len = q.size();
            for (int i=0; i< len; i++){
                Node cur = q.poll();
                level_sum += cur.data;
                if (cur.left != null){
                    q.add(cur.left);
                }
                if (cur.right != null){
                    q.add(cur.right);
                }
            }
        }
        return level_sum;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(deepestSum(tree.root));
    }
}
