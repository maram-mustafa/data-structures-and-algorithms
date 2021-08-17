package trees;

public class Queue {

  public Node front;
  public Node rear;


  public void enqueue(int value) {
    Node newValue = new Node(value);
    if (front == null) {
      front = newValue;
      rear = newValue;
    } else {
      rear.next = newValue;
      rear = newValue;
    }
  }

  public int dequeue() throws Exception {
    int dequeuedValue ;
    if (front == null) {
      throw new Exception("queue is empty");
    } else {
      dequeuedValue = front.value;
      front = front.next;
    }
    return dequeuedValue;
  }

  public int peek() throws Exception {
    if (front == null) {
      throw new Exception("queue is empty");
    } else {
      return front.value;
    }
  }

  public boolean isEmpty(){
    return front == null;
  }
}
