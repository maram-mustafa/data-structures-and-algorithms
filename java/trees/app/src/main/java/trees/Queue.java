package trees;

public class Queue<T>{

  public QueueNode<T> front;
  public QueueNode<T> rear;

  ///////////////////////////////////////////////// challenge 10 ////////////////////////

  public void enqueue(T value) {
    QueueNode<T> newValue = new QueueNode<>(value);
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
      return front.value;
    }
  }

  public boolean isEmpty(){
    return front == null;
  }
}


