package array.linked.list;

public class LinkedList {

  public Node head=null;
  public Node tail=null;

  public void insert(int data){
    Node insertNode = new Node(data);
    if(head == null){
      head = insertNode;
      tail=head;
    }else{
      tail.next=insertNode;
      tail=insertNode;
    }
  }

  public boolean include(int data){
    Node current =head;

    while(current != null){
      if(data == current.data){
        System.out.println("include!!!");
        return true;
      }
      current = current.next;
    }
    System.out.println("not include");
    return false;
  }

  //to string
  String toStr() {
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
}


