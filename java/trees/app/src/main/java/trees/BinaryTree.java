package trees;

public class BinaryTree{
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
public void preOrder(Node root){
  System.out.println(root.value);
  if(root.left != null){
    preOrder(root.left);
  }
  if(root.right !=null){
    preOrder(root.right);
  }
}

// in-order
  public void inOrder(Node root){
    if(root.left !=null){
      inOrder(root.left);
    }
    System.out.println(root.value);
    if(root.right != null){
      inOrder(root.right);
    }
  }

  //post-order
  public void postOrder(Node root){
    if(root.left != null){
      postOrder(root.left);
    }
    if(root.right != null){
      postOrder(root.right);
    }
    System.out.println(root.value);
  }


  @Override
  public String toString() {
    return "BinaryTree{" +
      "root=" + root +
      '}';
  }
}
