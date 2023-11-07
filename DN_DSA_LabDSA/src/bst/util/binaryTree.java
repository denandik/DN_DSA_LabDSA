package bst.util;

public class binaryTree {

	public static class Node {
        public int data;
        public Node left;
		public Node right;
    };
 
    public static Node NewNode(int data){
        Node temp = new Node();
        temp.data = data;
        temp.left = null;
        temp.right = null;
        return temp;
    }
 
    public static Node insert(Node root, int key){
        if (root == null) return NewNode(key);
        if (key < root.data) root.left = insert(root.left, key);
        else root.right = insert(root.right, key);
        return root;
    }
	
}
