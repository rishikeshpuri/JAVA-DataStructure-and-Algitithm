import java.util.*;

public class TopView {
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
    public static void topView(Node node){
        if (node == null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        q.add(node);
        while (!q.isEmpty()){
            Node cur = q.poll();
            int h = cur.height;
            if (treeMap.get(h) == null){
                treeMap.put(h,cur.data);
            }
            if (cur.left != null){
                cur.left.height = h -1;
                q.add(cur.left);
            }
            if (cur.right != null){
                cur.right.height = h + 1;
                q.add(cur.right);
            }
        }
        Collection<Integer> values = treeMap.values();


        for(Integer value : values){
            System.out.print( value +" ");
        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        topView(tree.root);
    }
}
