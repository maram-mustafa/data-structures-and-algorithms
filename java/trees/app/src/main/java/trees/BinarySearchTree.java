package trees;

public class BinarySearchTree extends BinaryTree{
  Node root;

  public void add(int value , Node  root){
    if(this.root == null){
      this.root= new Node (value);
      return ;
    }
    if(value < root.value){
      if(root.left == null){
        root.left = new Node (value);
        return;
      }
      add(value , root.left);
    }
    if(value > root.value){
      if(root.right == null){
        root.right = new Node(value);
        return;
      }
      add(value , root.right);
    }
  }


  public  boolean contains(int value , Node root){
    if(root == null){
      return false;
    }
    if(root.value == value){
      return true;
    }
    boolean check = false;
    if(value < root.value){
      check = contains(value, root.left );
    }
    if(value > root.value){
      check = contains(value , root.right);
    }
    return check;
  }

  @Override
  public String toString() {
    return "BinarySearchTree{" +
      "root=" + root +
      '}';
  }
}
