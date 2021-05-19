public class Deletion {
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
    public static Node minimum(Node node){
        if (node == null){
            return null;
        }
        while (node.left != null){
            node = node.left;
        }
        return node;
    }
    public static Node deletion(Node root, int key){
        if (root == null ){
            return null;
        }
        if (root.data > key){
            root.left = deletion(root.left, key);
        }
        if (root.data < key){
            root.right = deletion(root.right, key);
        }
        else { // node found
            // node have two children
            if (root.left != null && root.right != null){
                Node x = root;
                Node minumumFromRightSubTree = minimum(x.right);
                root.data = minumumFromRightSubTree.data;
                root.right = deletion(root.right, minumumFromRightSubTree.data);
            }
//            Node have only left child
            else if (root.left != null){
                root = root.left;
            }
//            Node have only right child
            else if (root.right != null){
                root = root.right;
            }
//            node is leaf-> no child
            else {
                root = null;
            }
        }
        return root;
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
        System.out.println(deletion(tree.root,8));
    }
}
