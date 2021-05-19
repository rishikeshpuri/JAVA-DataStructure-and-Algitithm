import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidth {
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
    public static int max_width(Node node){
        if (node == null){
            return 0;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(node);
        q.add(null);
        int max_width = 1;
        while (!q.isEmpty()){
            Node cur = q.poll();
            if (cur == null){
                if (q.size() == 0){
                    return max_width;
                }
                else if (q.size() > max_width){
                    max_width = q.size();
                }
                q.add(null);
                continue;
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
        return max_width;
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println(max_width(tree.root));
    }
}
