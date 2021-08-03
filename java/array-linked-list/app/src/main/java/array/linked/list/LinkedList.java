package array.linked.list;

public class LinkedList {

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


  public void append(int data){
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


  void insertAfter(int value, int newValue) {
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


}

