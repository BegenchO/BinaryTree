public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree(); 
        tree.root = new Node(11); 
        tree.root.left = new Node(22); 
        tree.root.right = new Node(33); 
        tree.root.left.left = new Node(44); 
        tree.root.left.right = new Node(55); 
        System.out.println("Preorder traversal of binary tree is "); 
        tree.printPreorder(); 
        System.out.println("\nInorder traversal of binary tree is "); 
        tree.printInorder(); 
        System.out.println("\nPostorder traversal of binary tree is "); 
        tree.printPostorder(); 
    }
}