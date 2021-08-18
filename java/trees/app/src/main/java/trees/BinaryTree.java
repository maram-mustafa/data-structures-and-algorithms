package trees;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree<T> {
  public Node<T> root ;
  private List<T> trees = new ArrayList<>();

/////////////////////////////////////////////////code challenge 15 ////////////////////////////////////

  //pre-order
  public List<T> preOrder(Node<T> root) {
    trees.add(root.value);
    if (root.left != null) {
      preOrder(root.left);
    }
    if (root.right != null) {
      preOrder(root.right);
    }
    return trees;
  }


  // in-order
  public List<T> inOrder(Node<T> root) {
    if (root.left != null) {
      inOrder(root.left);
    }
    trees.add(root.value);
    if (root.right != null) {
      inOrder(root.right);
    }
    return trees;
  }

  //post-order
  public List<T> postOrder(Node<T> root) {
    if (root.left != null) {
      postOrder(root.left);
    }
    if (root.right != null) {
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

  public int maximum(Node<Integer> root) {

    if (root == null) {
      System.out.println("Tree is empty");
      return 0;
    } else {
      int leftMax;
      int rightMax;
      int max = root.value;

      if (root.left != null) {
        leftMax = maximum(root.left);
        max = Math.max(max, leftMax);
      }
      if (root.right != null) {
        rightMax = maximum(root.right);
        max = Math.max(max, rightMax);
      }
      return max;
    }
  }

  ///////////////////////////////////////////////// code  challenge 17 ////////////////////////////////////////////

  public List<Integer> breadthFirst(BinarySearchTree<T> tree) throws Exception {
    Queue<Node> breadth = new Queue<>();


    if (root != null) {
      breadth.enqueue(root);
    }
    while (!breadth.isEmpty()) {
      Node front = breadth.dequeue();
      trees.add(front.value);

      if (front.left != null) {
        breadth.enqueue(front.left);
        if (front.right != null) {
          breadth.enqueue(front.right);
        }
      }
    }
    return trees;
  }



}
