import java.util.*;

public class Sum_of_heights_of_all_nodes {
    public static class Node{
        int data;
        Node left;
        Node right;
        int depth;
        public Node(int value){
            data = value;
            left = right = null;
            depth = 0;
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

    static HashMap<Integer, Node[]> mp = new HashMap<>();
    public static void buildTree() {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for(int i=1; i<n; i++){
            int l = scn.nextInt();
            int r = scn.nextInt();
            Node arr1[] = new Node[2];
            arr1[0] = new Node(l);
            arr1[1] = new Node(r);
            mp.put(i, arr1);
        }
    }
    public static void heightIndividual(){
        Queue<Node> q = new LinkedList<>();
        TreeMap<Integer, List<Integer>> treemp = new TreeMap<>();
        Node node = new Node(1);
        q.add(node);
        int level = 0;
        while (!q.isEmpty()) {
            int len = q.size();
            for (int i = 0; i < len; i++) {
                Node cur = q.poll();
                if (treemp.containsKey(level)){
                    treemp.get(level).add(cur.data);
                }
                else {
                    List<Integer> valueList = new ArrayList<>();
                    valueList.add(cur.data);
                    treemp.put(level, valueList);
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
            level++;
        }
        int x = 0;
        for (Map.Entry<Integer, List<Integer>> e : treemp.entrySet()) {
            x += e.getKey() * e.getValue().size();
        }
        System.out.println(x);
    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        buildTree();
        heightIndividual();
    }
}
