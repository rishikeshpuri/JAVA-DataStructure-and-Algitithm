public class LeastCommonAncestor {

    public static class Node{
    int data;
    Node left;
    Node right;
    Node(int value){
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
    public static Node leastCommAncestor(Node node, int n1, int n2){
        if (node == null){
            return null;
        }
        if (node.data == n1 || node.data == n2){
            return node;
        }
        Node leftSub = leastCommAncestor(node.left, n1, n2);
        Node rightSub = leastCommAncestor(node.right, n1, n2);

        if (leftSub != null && rightSub != null){
            return node;
        }
        if (leftSub == null && rightSub == null){
            return null;
        }
        return leftSub != null ? leftSub : rightSub;
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        int n1 = 4;
        int n2 =5;
        Node x= leastCommAncestor(tree.root, n1, n2);
        System.out.println(x.data);
    }
}
