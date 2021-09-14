package graphs;

public class Queue<T> {

  public Node front;
  public Node rear;


  public void enqueue(T value) {
    try{
      Node newValue = new Node((String) value);
      if (front == null) {
        front = newValue;
        rear = newValue;
      } else {
        rear.next = newValue;
        rear = newValue;
      }

    }catch (NullPointerException e){
      e.printStackTrace();
      System.out.println("empty!!!");
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

