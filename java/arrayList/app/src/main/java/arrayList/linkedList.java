package arrayList;

public class linkedList {

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
        return true;
        System.out.println("include!!!");
      }
      current = current.next;
    }
    return false;
    System.out.println("not include);
  }


  public String toString(){
    Node current = head;

    if (head == null){
      System.out.println("List Empty");
    }else{
      String string= "";
      while (current != null){
        System.out.println("{" + current.data + "}" + "-> ");
        current = current.next;
      }
      System.out.println("null");
      return string + "NULL";
    }
  }
};
