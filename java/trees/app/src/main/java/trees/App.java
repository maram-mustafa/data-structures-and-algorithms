/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import java.util.ArrayList;
import java.util.List;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static List<String> output = new ArrayList<>();
  public static List<String> FizzBuzz(KTreeNode node) {
    if (node == null) {
      return output;
    }

    int total = node.children.length;
    for (int i = 0; i < total - 1; i++)
      FizzBuzz(node.children[i]);

    if(node.data %3 == 0 && node.data %5 == 0)
      output.add("FizzBuzz");
    else if(node.data %3 == 0)
      output.add("Fizz");
    else if(node.data %5 == 0)
      output.add("Buzz");
    else{
      String str = Integer.toString(node.data);
      output.add(str);
    }
    FizzBuzz(node.children[total - 1]);

    return output;
  }

  public static void main(String[] args) throws Exception {
    System.out.println(new App().getGreeting());

    //////////////////////////////////////////code challenge 15 /////////////////////////////
    BinarySearchTree<Integer> tree = new BinarySearchTree<>();

    tree.add(5);
    tree.add(8);
    tree.add(3);


//    System.out.println(tree.preOrder(tree.root));
//    System.out.println(tree.inOrder(tree.root));
    System.out.println(tree.postOrder(tree.root));

//      System.out.println(tree.contains(5);
//      System.out.println(tree.contains(7);
//      System.out.println(tree.contains(6);


    /////////////////////////////////// code challenge 16 ///////////////////////////////
//    BinarySearchTree tree = new BinarySearchTree();
//
//
//    tree.root = new Node(2);
//    tree.root.left = new Node(6);
//    tree.root.right = new Node(4);
//    tree.root.left.right = new Node(5);
//    tree.root.left.right.left = new Node(1);
//    tree.root.right.right = new Node(10);
//    tree.add(5, tree.root);
//    tree.add(8, tree.root);
//    tree.add(3, tree.root);
//
//    System.out.println("-------------preOrder-----------");
//    System.out.println(tree.preOrder(tree.root));
//    System.out.println("-------------inOrder-----------");
//    System.out.println(tree.inOrder(tree.root));
//    System.out.println("-------------postOrder-----------");
//    System.out.println(tree.postOrder(tree.root));
//
//      System.out.println(tree.contains(5, tree.root));
//      System.out.println(tree.contains(7, tree.root));
//      System.out.println(tree.contains(6, tree.root));
//
//
//    System.out.println(tree.maximum(tree.root));


    /////////////////////////////////////////// code challenge 17 //////////////////////////////////////////////////

//    BinarySearchTree tree = new BinarySearchTree();
//    tree.add(1 , tree.root);
//    tree.add(2 , tree.root);
//    tree.add(3 , tree.root);
//    tree.add(4 , tree.root);
//    tree.add(5 , tree.root);
//    tree.add(6 , tree.root);
//    tree.add(7 , tree.root);
//
//    System.out.println(tree.breadthFirst(tree));

    /////////////////////////////////////////////////// code challenge 18 /////////////////////////////////////////////

//
//    List<String> kTree = new ArrayList<>();
//    int k = 3;
//    KTreeNode root = new KTreeNode(k, 1);
//    root.children[0] = new KTreeNode(k, 2);
//    root.children[1] = new KTreeNode(k, 3);
//    root.children[2] = new KTreeNode(k, 4);
//    root.children[0].children[0] = new KTreeNode(k, 5);
//    root.children[0].children[1] = new KTreeNode(k, 6);
//    root.children[0].children[2] = new KTreeNode(k, 7);
//
//    System.out.println(kTree);


  }
}
