/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SingleArrayList;

public class App {
  public String getGreeting() {
    return "Hello World!";
  }

  public static void main(String[] args) {
    /////////////////////////////////////////////////////// code challenge 5 /////////////////////////////////////////////

//    LinkedList list1 = new LinkedList();
//    // insert
//    list1.insert(1);
//    list1.insert(2);
//    list1.insert(3);
//    list1.insert(50);
//    list1.insert(4);
//    list1.insert(100);
//    list1.insert(300);
//
//    //includes
//    System.out.println(list1.include(300));
//
//    // to string
//    System.out.println(list1.toString());

/////////////////////////////////////////////////////// code challenge 6 /////////////////////////////////////////////

//    append method
//    LinkedList list2 = new LinkedList();
//    list2.append(1);
//    list2.append(3);
//    list2.append(5);
//     System.out.println(list2.toString());
//
    // insertBefore
//    list2.insertBefore(5,2);
//    System.out.println(list2.toString());
//
    //insertAfter
//    list2.insertAfter(2,100);
//    System.out.println(list2.toString());
//  }


    /////////////////////////////////////////////////////// code challenge 7 /////////////////////////////////////////////

    // kth from end
//    try {
//      LinkedList listKth = new LinkedList();
//      listKth.append(1);
//      listKth.append(2);
//      listKth.append(3);
//      listKth.append(4);
//      listKth.append(5);
//      listKth.append(6);
//      listKth.append(7);
//      listKth.append(8);
//      listKth.append(9);
//      listKth.append(10);
//
//      System.out.println(listKth.linkedListKth(3));
//    } catch (IndexOutOfBoundsException e) {
//      System.out.println("number out of the range");
//    }
//  }


/////////////////////////////////////////////////////// code challenge 8 /////////////////////////////////////////////


    LinkedList zipList1 = new LinkedList();
    zipList1.append(1);
    zipList1.append(2);
    zipList1.append(3);

    System.out.println(zipList1.toString());

    LinkedList zipList2 = new LinkedList();
    zipList2.append(4);
    zipList2.append(5);
    zipList2.append(6);

    System.out.println(zipList2.toString());

    System.out.println(zipLists(zipList1,zipList2).toString());

  }
}
