package trees;

public class Queue{
  public Node front;
  public Node rear;


  public void enqueue(Node value) {
    Node newValue = new Node();
    if (front == null) {
      front = newValue;
      rear = newValue;
    } else {
      rear.next = newValue;
      rear = newValue;
    }
  }

//  public Node dequeue() throws Exception {
//    Node dequeuedValue;
//    if (front == null) {
//      throw new Exception("queue is empty");
//    } else {
//     dequeuedValue = front.value;
//      front = front.next;
//    }
//    return dequeuedValue;
//  }
//
//  public Node peek() throws Exception {
//    if (front == null) {
//      throw new Exception("queue is empty");
//    } else {
//      return front.value;
//    }
//  }
  public boolean isEmpty(){
    return front == null;
  }
}


