package graphs;

public class Queue<T> {

  public Node front;
  public Node rear;

  //////////////////////////////////// challenge 10 ///////////////////////////////////
  public void enqueue(T value) {
    Node newNode = new Node(value);
    if (front == null) {
      front = newNode;
      rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public T dequeue() throws Exception {
    T dequeued = null;
    if (front == null) {
      throw new Exception("queue is empty");
    } else {
      dequeued = (T) front.value;
      front = front.next;
    }
    return dequeued;
  }

  public T peek() throws Exception {
    if (front == null) {
      throw new Exception("queue is empty");
    } else {
      return (T) front.value;
    }
  }

  public boolean isEmpty(){
    return front == null;
  }
}
