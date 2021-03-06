/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SingleArrayList;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

  /////////////////////////////////////////////////////// code challenge 5 /////////////////////////////////////////////

  //    @Test public void testLinkList() {
//    //Can successfully instantiate an empty linked list
//    LinkedList list1 = new LinkedList();
//    assertNull("empty list", list1.head);
//
//
//    //Can properly insert into the linked list
//    LinkedList list2 = new LinkedList();
//
//    list2.insert(1);
//    assertEquals("insert to the likedList" ,1, list2.head.data);
//
//
//    //The head property will properly point to the first node in the linked list
//    LinkedList list3 = new LinkedList();
//
//    list3.insert(10);
//    list3.insert(100);
//
//    assertEquals("test insert to the linkedList",100,list3.head.data);
//
//
//    //Can properly insert multiple nodes into the linked list
//    LinkedList list4 = new LinkedList();
////    list4.insert(10);
//    list4.insert(100);
//
//    assertEquals("test multiple insert method by checking if tail is not null and equal to last node",100,
//      list4.tail.data);
//
//
//    //Will return true when finding a value within the linked list that exists
//    LinkedList list5 = new LinkedList();
//    list5.insert(10);
//    list5.insert(100);
//    list5.insert(1000);
//
//    assertEquals("test includes method when finding a value the output is true",true,
//      list5.include(100));
//
//
//    //Will return false when searching for a value in the linked list that does not exist
//    assertEquals("test includes method when not finding a value the output is false",true,
//      list5.include(10));
//
//    //Can properly return a collection of all the values that exist in the linked list
//    String out = "{ 10 } -> { 100 } -> { 1000 } -> ";
//    assertEquals("test toStr method that return all list values",out,
//      list5.toString());
//
//  }
/////////////////////////////////////////////////////// code challenge 6 /////////////////////////////////////////////

//  @Test public void testLinkList() {
//
//    LinkedList list2 = new LinkedList();
//    list2.append(1);
//    assertEquals("append new node","{ 1 } -> ",list2.toString());
//
//
//    LinkedList list3 = new LinkedList();
//    list3.append(1);
//    list3.append(2);
//    list3.append(4);
//    list3.insertBefore(4,3);
//    assertEquals("insert before","{ 1 } -> { 2 } -> { 3 } -> { 4 } -> ",list3.toString());
//
//
//    LinkedList list4 = new LinkedList();
//    list4.append(1);
//    list4.append(3);
//    list4.append(2);
//    list4.append(5);
//
//
//    list3.insertAfter(2,100);
//    assertEquals("insert before","{ 1 } -> { 2 } -> { 100 } -> { 3 } -> { 4 } -> ",list3.toString());
//  }


/////////////////////////////////////////////////////// code challenge 7 /////////////////////////////////////////////

  //Where k is greater than the length of the linked list
//  @Test
//  public void testLinkedListKth_KGreaterLength() {
//    LinkedList listKth = new LinkedList();
//    listKth.append(1);
//    listKth.append(2);
//    listKth.append(3);
//    listKth.append(4);
//    listKth.append(5);
//    listKth.append(6);
//    listKth.append(7);
//    listKth.append(8);
//    listKth.append(9);
//    listKth.append(10);
//
//    assertEquals("testLinkedListKth_KGreaterLength", "number out of the range", listKth.linkedListKth(10)
//    );
//  }
//
//  //Where k and the length of the list are the same
//  @Test
//  public void testLinkedListKth_kEqualLength() {
//    LinkedList listKth = new LinkedList();
//    listKth.append(1);
//    listKth.append(2);
//    listKth.append(3);
//    listKth.append(4);
//    listKth.append(5);
//    listKth.append(6);
//    listKth.append(7);
//    listKth.append(8);
//    listKth.append(9);
//    listKth.append(10);
//
//    assertEquals("testLinkedListKth_kEqualLength", "1", listKth.linkedListKth(9)
//    );
//  }
//
//  //Where k is not a positive integer
//  @Test
//  public void testLinkedListKth_kNegative() {
//    LinkedList listKth = new LinkedList();
//    listKth.append(1);
//    listKth.append(2);
//    listKth.append(3);
//    listKth.append(4);
//    listKth.append(5);
//    listKth.append(6);
//    listKth.append(7);
//    listKth.append(8);
//    listKth.append(9);
//    listKth.append(10);
//
//    assertEquals("testLinkedListKth_kNegative", "number out of the range", listKth.linkedListKth(-1)
//    );
//  }
//
//  //Where the linked list is of a size 1
//
//  @Test
//  public void testLinkedListKth_kSize() {
//    LinkedList listKth = new LinkedList();
//    listKth.append(1);
//
//    assertEquals("testLinkedListKth_kSize", "1", listKth.linkedListKth(0)
//    );
//  }
//
//  //???Happy Path??? where k is not at the end, but somewhere in the middle of the linked list
//  @Test
//  public void testKthFromEndMethod5() throws Exception {
//    LinkedList listKth = new LinkedList();
//    listKth.append(1);
//    listKth.append(2);
//    listKth.append(3);
//    listKth.append(4);
//    listKth.append(5);
//    listKth.append(6);
//    listKth.append(7);
//    listKth.append(8);
//    listKth.append(9);
//    listKth.append(10);
//    assertEquals("testLinkedListKth_kNegative", "5", listKth.linkedListKth(5));
//  }



  /////////////////////////////////////////////////////// code challenge 8 /////////////////////////////////////////////


  //two lists same size
  @Test public void testZipListsSameSize(){
    LinkedList zipList1 = new LinkedList();
    zipList1.append(1);
    zipList1.append(2);
    zipList1.append(3);
    LinkedList zipList2 = new LinkedList();
    zipList2.append(4);
    zipList2.append(5);
    zipList2.append(6);

    String output = "{ 1 } -> { 4 } -> { 2 } -> { 5 } -> { 3 } -> { 6 } -> NULL";

    assertEquals(" lists have same size",output,zipLists(zipList1,zipList2).toStr());
  }

  // 2 two lists different sizes
  @Test public void testZipListsDifferentSize(){
    LinkedList zipList1 = new LinkedList();
    zipList1.append(1);
    zipList1.append(2);
    LinkedList zipList2 = new LinkedList();
    zipList2.append(3);
    zipList2.append(4);
    zipList2.append(5);

    String output = "{ 1 } -> { 3 } -> { 2 } -> { 4 } -> { 5 } -> NULL";

    assertEquals(" different sizes",output,zipLists(zipList1,zipList2).toStr());
  }

  // 3 one list is empty
  @Test public void testZipListsListEmpty(){
    LinkedList zipList1 = new LinkedList();
    LinkedList zipList2 = new LinkedList();
    zipList2.append(5);
    zipList2.append(9);
    zipList2.append(4);

    // output must be
    String output = "{ 5 } -> { 9 } -> { 4 } -> NULL";

    assertEquals("test when one list is empty",output,zipLists(zipList1,zipList2).toStr());
  }
}

