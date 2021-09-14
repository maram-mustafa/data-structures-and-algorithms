package graphs;

public class Queue<T> {

  public Node front;
  public Node rear;


  public void enqueue(T value) {
    Node newValue = new Node((String) value);
    if (front == null) {
      front = newValue;
      rear = newValue;
    } else {
      rear.next = newValue;
      rear = newValue;
    }
  }

  public T dequeue() throws Exception {
    T dequeuedValue = null;
    if (front == null) {
      throw new Exception("queue is empty");
    } else {
      dequeuedValue = (T) front.value;
      front = front.next;
    }
    return dequeuedValue;
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

