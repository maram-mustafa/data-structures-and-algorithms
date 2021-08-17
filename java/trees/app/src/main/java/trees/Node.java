package trees;

public class Node {
  public int value;
  public Node left;
  public Node right;
  public Node next;

  public Node(int value) {
    this.value = value;
  }


  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }
//
//  public Node<T> getLeft() {
//    return left;
//  }
//
//  public void setLeft(Node<T> left) {
//    this.left = left;
//  }
//
//  public Node<T> getRight() {
//    return right;
//  }
//
//  public void setRight(Node<T> right) {
//    this.right = right;
//  }


  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", left=" + left +
      ", right=" + right +
      '}';
  }
}
