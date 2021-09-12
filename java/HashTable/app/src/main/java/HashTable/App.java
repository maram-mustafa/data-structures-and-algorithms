/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

import java.util.*;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }
///////////////////////////////////////////////// code challenge 31 //////////////////////////////////////////////////////
  static String repeatedWord(String word) {
    String words[] = word.split(" ");
    HashMap<String, Integer> hashedWord = new HashMap<String, Integer>();

    for (int i=0; i<words.length; i++) {
      if (hashedWord.containsKey(words[i]))
        hashedWord.put(words[i], hashedWord.get(words[i]) + 1); // word exists
      else
        hashedWord.put(words[i], 1);
    }
    for (int i=0; i<words.length; i++) {
      int count = hashedWord.get(words[i]);
      if (count > 1) {
        return words[i];
      }
    }

    return "NoRepetition";
  }

  ///////////////////////////////////////////////// code challenge 32 //////////////////////////////////////////////////////

  public  static List<Integer> treeIntersection (BinaryTree<Integer> tree1 , BinaryTree<Integer> tree2){
    List<Integer> values = new ArrayList<>();

    HashTable<Integer> hashTable = new HashTable<Integer>(values.size()+1);

    List<Integer> list1= tree1.inOrder(tree1.root);
    List<Integer> list2= tree2.inOrder(tree2.root);

    for(int i =0 ; i<list1.size();i++){
      hashTable.add(list1.get(i),i);
      if(hashTable.contains(list2.get(i))){
        values.add(list2.get(i));
      }else{
        hashTable.add(list2.get(i) , i);
      }
    }
    return  values;
  }

  ///////////////////////////////////////////////  code challenge 33/////////////////////////////////////////////////////////

  public static List<String> leftJoin(HashTable table1, HashTable table2) {
    List<String> value = new ArrayList<>();

    for (int i = 0; i < table1.size; i++) {
      if (table2.arrayHash[i].key != null) {
        if (table1.contains(table2.arrayHash[i].key)) {
          value.add("["+table2.arrayHash[i].key + "," + table2.arrayHash[i].value + "," + table1.get(table2.arrayHash[i].key)+"]");
        } else {
          value.add("["+table2.arrayHash[i].key + "," + table2.arrayHash[i].value + "," + "NULL"+"]");
        }
        if (table2.arrayHash[i].next != null) {
          if (table1.contains(table2.arrayHash[i].next.key)) {
            value.add("["+table2.arrayHash[i].next.key + "," + table2.arrayHash[i].next.value + "," + table1.get(table2.arrayHash[i].next.key)+"]");
          } else {
            value.add("["+table2.arrayHash[i].next.key + "," + table2.arrayHash[i].next.value + "," + "NULL"+"]");
          }
        }
      }
    }
    return value;
  }


  public static void main(String[] args) {
    System.out.println(new App().getGreeting());

//      HashTable<String> hash = new HashTable<String>(10);
//      hash.add(10, "maram");
//      hash.add(5, "rand");
//      hash.add(15, "zaina");
//      System.out.println(hash.get(5));
//      System.out.println(hash.contains(10));

///////////////////////////////////////////////// code challenge 31 //////////////////////////////////////////////////////

////    String string = "It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...";
//    String string = "Once upon a time, there was a brave princess who...";
//
//    String firstWord = repeatedWord(string);
//      System.out.println("First repeated word :: " + firstWord);
///////////////////////////////////////////////// code challenge 32 //////////////////////////////////////////////////////
//    BinaryTree<Integer> tree1 = new BinaryTree<Integer>();
//    tree1.root = new TreeNode<Integer>(150);
//    tree1.root.left = new TreeNode<Integer>(100);
//    tree1.root.right = new TreeNode<Integer>(250);
//    tree1.root.left.left = new TreeNode<Integer>(75);
//    tree1.root.left.right = new TreeNode<Integer>(160);
//    tree1.root.left.right.left = new TreeNode<Integer>(125);
//    tree1.root.left.right.right = new TreeNode<Integer>(175);
//    tree1.root.right.left = new TreeNode<Integer>(200);
//    tree1.root.right.right = new TreeNode<Integer>(350);
//    tree1.root.right.right.left = new TreeNode<Integer>(300);
//    tree1.root.right.right.right = new TreeNode<Integer>(500);
//
//    BinaryTree<Integer> tree2 = new BinaryTree<Integer>();
//    tree2.root = new TreeNode<Integer>(42);
//    tree2.root.left = new TreeNode<Integer>(100);
//    tree2.root.right = new TreeNode<Integer>(600);
//    tree2.root.left.left = new TreeNode<Integer>(15);
//    tree2.root.left.right = new TreeNode<Integer>(160);
//    tree2.root.left.right.left = new TreeNode<Integer>(125);
//    tree2.root.left.right.right = new TreeNode<Integer>(175);
//    tree2.root.right.left = new TreeNode<Integer>(200);
//    tree2.root.right.right = new TreeNode<Integer>(350);
//    tree2.root.right.right.left = new TreeNode<Integer>(4);
//    tree2.root.right.right.right = new TreeNode<Integer>(500);
//
//    System.out.println(treeIntersection(tree1,tree2));


    ///////////////////////////////////////////////// code challenge 33 //////////////////////////////////////////////////////
    HashTable<String> table1 = new HashTable<String>(5);
    HashTable<String> table2 = new HashTable<String>(5);

    table1.add("found", "enamored");
    table1.add("wrath", "anger");
    table1.add("diligent", "employed");

    table2.add("found", "averse");
    table2.add("wrath", "delight");
    table2.add("diligent", "idle");

    System.out.println(leftJoin(table1, table2));



  }
}
