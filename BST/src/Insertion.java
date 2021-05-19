public class Insertion {
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
    public static class BinarySearchTree{
        Node root;
        BinarySearchTree(int val){
            root = new Node(val);
        }
        BinarySearchTree(){
            root = null;
        }
    }
    public static Node insertionNode(Node node, int key){
        if (node == null){
            return new Node(key);
        }
        if (key < node.data){//left sub tree
            node.left = insertionNode(node.left, key);
        }
        else if (key > node.data){ // right sub tree
            node.right = insertionNode(node.right, key);
        }
        return node;
    }
    public static void inOrder(Node node){
        if (node == null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.data +" ");
        inOrder(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.root = new Node(8);
        tree.root.left = new Node(3);
        tree.root.right = new Node(10);
        tree.root.left.left = new Node(1);
        tree.root.left.right = new Node(6);
        tree.root.right.right = new Node(14);
        tree.root.left.right.left = new Node(4);
        tree.root.left.right.right = new Node(7);
        tree.root.right.right.left = new Node(13);
        System.out.println(insertionNode(tree.root,8));
        inOrder(tree.root);
    }
}
