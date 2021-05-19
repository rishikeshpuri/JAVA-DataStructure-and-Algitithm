public class inOrder_preOrder_postOrder {
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
        BinaryTree(int data){
            root = new Node(data);
        }
        BinaryTree(){
            root = null;
        }
    }
    public static void inOrderTraversalTree(Node node){

//        -----------------------------------------------------
//        if (node == null){
//            return;
//        }
//        String str = "";
//        str += node.left == null ? "." : node.left.data + "";
//        str += "<-" + node.data + "->";
//        str += node.right == null ? "." : node.right.data + "";
//        System.out.println(str);
//        preeOrderTraversalTree(node.left);
//        preeOrderTraversalTree(node.right);
//---------------------by if else condition--------
//        if (node == null){
//            return;
//        }
//
//        String str = "";
//
//        if (node.left == null){
//            str += ".";
//        }
//        else {
//            str += node.left.data;
//        }
//
//        str += "<-" + node.data+ "->";
//
//        if (node.right == null){
//            str += ".";
//        }
//        else {
//            str += node.right.data;
//        }
//        System.out.println(str);
//        inOrderTraversalTree(node.left);
//        inOrderTraversalTree(node.right);

//        --------------------------------------------------
//        -------- INORDER TRAVERSAL -------------------

        if (node == null){
            return;
        }
        inOrderTraversalTree(node.left);
        System.out.print(node.data+" ");
        inOrderTraversalTree(node.right);

    }
    public static void preOrderTraversalTree(Node node){
        if (node == null){
            return;
        }
        System.out.print(node.data+" ");
        preOrderTraversalTree(node.left);
        preOrderTraversalTree(node.right);
    }
    public static void postOrderTraversalTree(Node node){
        if (node == null){
            return;
        }
        postOrderTraversalTree(node.left);
        postOrderTraversalTree(node.right);
        System.out.print(node.data+" ");

    }
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
//        tree.root.right.left = new Node(9);
//        tree.root.right.right = new Node(10);
//        tree.root.left.left.right = new Node(11);
//        tree.root.right.right.left = new Node(12);
        System.out.println("Binary Tree");
        System.out.println("PreOreder");
        preOrderTraversalTree(tree.root);
        System.out.println();
        System.out.println("InOreder");
        inOrderTraversalTree(tree.root);
        System.out.println();
        System.out.println("PostOreder");
        postOrderTraversalTree(tree.root);

    }
}
