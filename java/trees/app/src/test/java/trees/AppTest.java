/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class AppTest {
  @Test
  public void testAppHasAGreeting() {
    App classUnderTest = new App();
    assertNotNull("app should have a greeting", classUnderTest.getGreeting());
  }

  //////////////////////////////code challenge 15 ////////////////////////////////////////////

  //Can successfully instantiate an empty tree
//  @Test
//  void testTree() {
//    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
//    assertNull(tree.root);
//  }

//  // 2- Can successfully instantiate a tree with a single root node
//  @Test
//  void testTree2() {
//    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
//    tree.add(5);
//    assertEquals(5, tree.root.value);
//  }
//
//  // 3- Can successfully add a left child and right child to a single root node
//  @Test
//  void testTree3() {
//    BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
//    tree.add(10);
//    tree.add(20);
//    tree.add(30);
//    assertEquals(10,tree.root.value);
//    assertEquals(20,tree.root.left.value);
//    assertEquals(30,tree.root.right.value);
//  }
//
//  // 4- Can successfully return a collection from a preorder traversal
//  @Test
//  void testTree4() {
//    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
//    tree.add(10);
//    tree.add(20);
//    tree.add(8);
//    tree.add(5);
//    tree.add(9);
//    tree.add(30);
//    tree.add(15);
//    List list = Arrays.asList(10, 8, 5, 9, 20, 15, 30);
//    assertEquals(list,tree.preOrder(tree.root));
//  }
//
//  // 5- Can successfully return a collection from an inorder traversal
//  @Test
//  void testTree5() {
//    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
//    tree.add(10);
//    tree.add(20);
//    tree.add(8);
//    tree.add(5);
//    tree.add(9);
//    tree.add(30);
//    tree.add(15);
//    // output must be
//    List list = Arrays.asList(5, 8, 9, 10, 15, 20, 30);
//    assertEquals(list,tree.inOrder(tree.root));
//  }
//
//  // 6- Can successfully return a collection from a postorder traversal
//  @Test
//  void testTree6() {
//    BinarySearchTree<Integer> tree = new BinarySearchTree<>();
//    tree.add(10);
//    tree.add(20);
//    tree.add(8);
//    tree.add(5);
//    tree.add(9);
//    tree.add(30);
//    tree.add(15);
//    // output must be
//    List list = Arrays.asList(5, 9, 8, 15, 30, 20, 10);
//    assertEquals(list,tree.postOrder(tree.root));
//  }


  ////////////////////////////////// code challenge 16//////////////////////////////////////////////////////////
  @Test
  public void testMAxTree(){
    BinarySearchTree tree = new BinarySearchTree();

    tree.root = new Node<Integer>(2);
    tree.root.left = new Node<Integer>(6);
    tree.root.right = new Node<Integer>(4);
    tree.root.left.right = new Node<Integer>(5);
    tree.root.left.right.left = new Node<Integer>(1);
    tree.root.right.right = new Node<Integer>(10);

//  System.out.println(tree.maximum(tree.root));

    assertEquals(10,tree.maximum(tree.root));


  }

  ////////////////////////////////////////// code challenge 17 //////////////////////////////////////////////////////

  @Test
  public  void testBreadthFirst() throws Exception {
    BinarySearchTree tree = new BinarySearchTree();
    tree.add(1);
    tree.add(2);
    tree.add(3);
    tree.add(4);
    tree.add(5);
    tree.add(6);
    tree.add(7);


    List breadth = Arrays.asList(1,3,2,4,5,7,6);
    assertEquals(breadth,tree.breadthFirst(tree));

  }

  /////////////////////////////////// code challenge 18 /////////////////////////////////////////////////////////

  @Test
  public void testFizzBuzz(){
    int k = 3;
    KTreeNode root = new KTreeNode(k, 1);
    root.children[0] = new KTreeNode(k, 2);
    root.children[1] = new KTreeNode(k, 3);
    root.children[2] = new KTreeNode(k, 4);
    root.children[0].children[0] = new KTreeNode(k, 5);
    root.children[0].children[1] = new KTreeNode(k, 6);
    root.children[0].children[2] = new KTreeNode(k, 7);

    assertEquals("Buzz, Fizz, 2, 7, Fizz, 1, 4", App.FizzBuzz(root).toString());
  }


}
