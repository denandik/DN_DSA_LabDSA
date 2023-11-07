package bst.main;
import java.util.*;

import bst.util.binaryTree;
import bst.util.binaryTree.Node;

public class treeFinderMain {
	public static boolean findpairUtil(Node root, int sum, HashSet<Integer> set){
  
      if (root == null) return false;

      if (findpairUtil(root.left, sum, set)) return true;

      if (set.contains(sum - root.data)){
          System.out.println("Pair is found (" + (sum - root.data) + ", " + root.data + ")");
          return true;
      }
      else set.add(root.data);

      return findpairUtil(root.right, sum, set);
  }

  public static void findPair(Node root, int sum){
      HashSet<Integer> set = new HashSet<Integer>();
      if (!findpairUtil(root, sum, set))
          System.out.print("Nodes are not found. \n");
  }

  // Driver code to test above function
  public static void main(String[] args){
      Node root = null;
      root = binaryTree.insert(root, 10);
      root = binaryTree.insert(root, 20);
      root = binaryTree.insert(root, 30);
      root = binaryTree.insert(root, 40);
      root = binaryTree.insert(root, 50);
      root = binaryTree.insert(root, 60);
      root = binaryTree.insert(root, 70);


      int sum = 130;
      findPair(root, sum);
  }
}
