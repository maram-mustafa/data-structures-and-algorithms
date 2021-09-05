package trees;

public class BinarySearchTree<T> extends BinaryTree<T>{

  public BinarySearchTree(){}

////////////////////////////////////// code challenge 15 ///////////////////////////
  public Node add(Node  root, T value ) {
    if (this.root == null) {
      root = new Node(value);
      return root;
    }

    if ((Integer) value < (Integer) root.value) {
   root.left = add(root.left, value);
      }else if((Integer) value > (Integer) root.value)    {
      root.right = add(root.right, value);
    }
    return root;
  }

  public void add (T value){
    root= add(root , value);
  }


  public  boolean contains(Node root , T value){
    if(root == null){
      return false;
    }
    if(root.value == value){
      return true;
    }
    boolean check = false;
    if((Integer)value < (Integer) root.value){
      check = contains(root.left, value);
    }
    if((Integer) value > (Integer) root.value){
      check = contains(root.right, value);
    }
    return check;
  }

  public boolean contains(T value){
    return contains(root , value);
  }


  @Override
  public String toString() {
    return "BinarySearchTree{" +
      "root=" + root +
      '}';
  }
}
