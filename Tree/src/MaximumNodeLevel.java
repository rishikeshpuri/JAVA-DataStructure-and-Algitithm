import java.awt.desktop.QuitEvent;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MaximumNodeLevel {
//    public static class Node{
//        int data;
//        Node left;
//        Node right;
//        Node(int val){
//            data = val;
//            left = right = null;
//        }
//    }
//    public static class BinaryTree{
//        Node root;
//        BinaryTree(int value){
//            root = new Node(value);
//        }
//        BinaryTree(){
//            root = null;
//        }
//    }
//    public static void maxNodeLevel(Node node){
//        if (node == null){
//            return;
//        }
//        Queue<Node> q = new LinkedList<>();
//        q.add(node);
//        int level=0;
//        int max_width = 1;
//        int levelNo = 0;
//        while (true){
//            int len = q.size();
//            if (len == 0){
//                break;
//            }
//            if (len > max_width){
//                max_width = len;
//                levelNo = level;
//            }
//            while (len>0){
//                Node cur = q.poll();
//                if (cur.left != null){
//                    q.add(cur.left);
//                }
//                if (cur.right != null){
//                    q.add(cur.right);
//                }
//                len--;
//            }
//            levelNo++;
//
//        }
//        System.out.println(levelNo);
//
//    }

//    ****************New Style Making BINARY TREE*************
    static class Node {
    int data;
    Node left;
    Node right;

    Node(int val) {
        data = val;
        left = right = null;
    }
    }
    static HashMap<Integer, Node[]> mp = new HashMap<>();

    public static void BuildTree() {
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
    public static int longestLevel(){
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(1);
        q.add(root);
        q.add(null);
        int maxLength = 1;
        int level = 0;
        int count = 0;
        while (!q.isEmpty()){
            Node cur = q.poll();
            if (cur == null){
                count ++;
                if (q.size() == 0){
                    return level;
                }
                else if (q.size() > maxLength){
                    maxLength = q.size();
                    level = count;
                }
                q.add(null);
                continue;
            }
            int curData = cur.data;
            Node[] arr = mp.get(curData);
            if (arr[0] != null){
                q.add(arr[0]);
            }
            if (arr[1] != null){
                q.add(arr[1]);
            }
        }
        return level;
    }
    public static void main(String[] args) {
//        BinaryTree tree = new BinaryTree();
//        tree.root = new Node(1);
//        tree.root.left = new Node(2);
//        tree.root.right = new Node(4);
//        tree.root.left.left = new Node(5);
//        tree.root.left.right = new Node(3);
//        tree.root.right.right = new Node(7);
//        tree.root.left.left.left = new Node(6);
//        maxNodeLevel(tree.root);
        BuildTree();
        System.out.println(longestLevel());
    }
}
