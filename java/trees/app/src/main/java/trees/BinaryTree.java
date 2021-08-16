package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree{
  List trees = new ArrayList();
  Node  root;

  public BinaryTree() {
    this.root = null;
  }

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  //pre-order
public List preOrder(Node root){
  trees.add(root.value);
  if(root.left != null){
    preOrder(root.left);
  }
  if(root.right !=null){
    preOrder(root.right);
  }
  return trees;
}

// in-order
  public List inOrder(Node root){
    if(root.left !=null){
      inOrder(root.left);
    }
    trees.add(root.value);
    if(root.right != null){
      inOrder(root.right);
    }
    return trees;
  }

  //post-order
  public List postOrder(Node root){
    if(root.left != null){
      postOrder(root.left);
    }
    if(root.right != null){
      postOrder(root.right);
    }
    trees.add(root.value);
    return trees;
  }


  @Override
  public String toString() {
    return "BinaryTree{" +
      "root=" + root +
      '}';
  }


  ///////////////////////////////////////// code challenge 16////////////////////////

  public int  maximum (Node root){

//Check whether tree is empty
    if(root == null) {
      System.out.println("Tree is empty");
      return 0;
    }
    else{
      int leftMax;
      int rightMax;
      int max = root.value;

      if(root.left != null){
        leftMax = maximum(root.left);
        max = Math.max(max, leftMax);
      }
      if(root.right != null){
        rightMax = maximum(root.right);
        max = Math.max(max, rightMax);
      }
      return max;
    }
  }

}
