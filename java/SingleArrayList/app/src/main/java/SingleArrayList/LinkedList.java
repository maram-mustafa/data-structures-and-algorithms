package SingleArrayList;

public class LinkedList {

  //////////////////////////////////////// code challenge 5 ///////////////////////////////////////////////////
  public Node head = null;
  public Node tail = null;

  public void insert(int data) {
    Node insertNode = new Node(data);
    if (head == null) {
      head = insertNode;
      tail = head;
    } else {
      tail.next = insertNode;
      tail = insertNode;
    }
  }

  public boolean include(int data) {
    Node current = head;

    while (current != null) {
      if (data == current.data) {
        System.out.println("include!!!");
        return true;
      }
      current = current.next;
    }
    System.out.println("not include");
    return false;
  }

  public String toString() {
    String stringList = "";
    Node current = head;

    if (head == null) {
      System.out.println("list is empty");
    }

    while (current != null) {
      stringList += "{ " + current.data + " } -> ";
      System.out.print("{" + current.data + "}" + "-> ");
      current = current.next;
    }

    System.out.println("NULL");
    return stringList;
  }


  //////////////////////////////////////////////////////// code challenge 6///////////////////////////////////////////
  public void append(int data) {
    Node appendNode = new Node(data);
    if (head == null) {
      head = appendNode;
      tail = head;
    } else {
      tail.next = appendNode;
      tail = appendNode;
    }
  }

  public void insertBefore(int value, int newValue) {
    if (head != null) {
      if (value == head.data) {
        Node newNode = new Node(newValue);
        newNode.next = head;
        head = newNode;

      } else {
        Node current = head;
        Node previous = current;
        while (current != null) {
          if (value == current.data) {
            Node newNode = new Node(newValue);
            newNode.next = current;
            previous.next = newNode;
          }
          previous = current;
          current = current.next;
        }
      }
    }
  }


  public void insertAfter(int value, int newValue) {
    if (head != null) {
      if (value == tail.data) {
        Node newNode = new Node(newValue);
        tail.next = newNode;
        tail = newNode;
      } else {
        Node current = head;
        Node next = current.next;
        while (current != null) {
          if (value == current.data) {
            Node newNode = new Node(newValue);
            newNode.next = next;
            current.next = newNode;
            break;
          }
          if (current.next != null) {
            current = current.next;
            next = current.next;
          } else {
            current = current.next;
          }
        }
      }
    }
  }

//////////////////////////////////////////////////////// code challenge 7 /////////////////////////////////////////////


  public int linkedListKth(int number) throws IndexOutOfBoundsException {
    int length = 0;     // the value for n
    Node current = head; // the first node for the pinter to check from

    while (current != null) {
      length++;
      current = current.next;
    }
    if (number < 0 || number >= length) {
      throw new IndexOutOfBoundsException("number not in the range");
    }
    // index from tail
    // k from head
    int k = length - number;  // 6 = 10-4
//       current = null;
    if (k > 0) {
      current = head;
      for (int i = 1; i < k; i++) {
        current = current.next;
      }
    }
    return current.data;
  }


/////////////////////////////////////////////////////// code challenge 8 /////////////////////////////////////////////

  public  LinkedList zipLists(LinkedList firstList, LinkedList secondList) {

    Node firstListNode = firstList.head;
    Node secondListNode = secondList.head;
    LinkedList thirdList = new LinkedList();

    if (firstList == null) {
      return secondList;
    } else if (secondList == null) {
      return firstList;
    } else {
      while (firstList != null && secondList != null) {
         thirdList.append(firstListNode.data);
         firstListNode=firstListNode.next;

         if(secondListNode != null){
           thirdList.append(secondListNode.data);
           secondListNode=secondListNode.next;
         }
      }
    }
    return thirdList;
  }
}
