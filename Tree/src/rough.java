import java.util.*;

public class rough {
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
    public static void levelByLevel(Node node){
        if (node == null)
            return;
        Queue<Node> q = new LinkedList<>();
        TreeMap<Integer, List<Integer>> mp = new TreeMap<>();
        q.add(node);
//        q.add(null);
        int level = 0;
        while (!q.isEmpty()){
            int len = q.size();
            for (int i =0; i<len;i++){
                Node cur = q.poll();
//                System.out.print(cur.data+" ");

                if (mp.containsKey(level)){
                    mp.get(level).add(cur.data);
                }
                else {
                    List<Integer> valueList = new ArrayList<>();
                    valueList.add(cur.data);
                    mp.put(level, valueList);
                }

                if (cur.left != null){
                    q.add(cur.left);
                }
                if (cur.right != null){
                    q.add(cur.right);
                }
            }
            level++;
//            System.out.println();
        }

//        for (Map.Entry<Integer, List<Integer>> e : mp.entrySet()) {
//            System.out.println(e.getKey()+" : "+ e.getValue());
//        }

        int x = 0;
        for (Map.Entry<Integer, List<Integer>> e : mp.entrySet()) {
            x += e.getKey() * e.getValue().size();
        }
        System.out.println(x);


//        while (!q.isEmpty()){
//            Node cur = q.poll();
//            if (cur == null){
//
//                if (!q.isEmpty()){
//                    q.add(null);
//                    System.out.println();
//                }
//
//            }
//            else {
//                if (cur.left != null){
//                    q.add(cur.left);
//                }
//                if (cur.right != null){
//                    q.add(cur.right);
//                }
//                System.out.print(cur.data+" ");
//            }
//
//        }
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        levelByLevel(tree.root);
    }
}
