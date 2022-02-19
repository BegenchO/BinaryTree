public class BinaryTree {
   // Root
   Node root;
   
   // Constructor
   BinaryTree() {
       root = null;
   }

   // Post-order traversal and print
   void printPostorder(Node node) {
       if (node == null) {
           return;
       }

       // First recur on left subtree
       printPostorder(node.left);

       // Next recur on right subtree
       printPostorder(node.right);

       System.out.print(node.key + " ");
   }

   // In-order traversal and print
   void printInorder(Node node) {
       if (node == null) {
           return;
       }

       // First recur on left subtree
       printInorder(node.left);

       System.out.print(node.key + " ");

       // Finally recur on right subtree
       printInorder(node.right);
   }

   // Pre-order traversal and print
   void printPreorder(Node node) {
       if (node == null) {
           return;
       }

       System.out.print(node.key + " ");

       printPreorder(node.left);

       printPreorder(node.right);
   }

   // Default traversal from root

   void printPostorder() {
       printPostorder(root);
   }

   void printInorder() {
       printInorder(root);
   }

   void printPreorder() {
       printPreorder(root);
   }




   
} // end class
