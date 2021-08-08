package stackAndqueue;

public class PseudoQueue<T> {
  public Stack<T> stackFirst;
  public Stack<T> stackSecond;

  public PseudoQueue() {
    this.stackFirst = new Stack<>();
    this.stackSecond = new Stack<>();
  }

  public void enqueue(T value) {
    stackFirst.push(value);
  }

  public T dequeue() throws Exception {
    while (stackFirst.top != null){
      stackSecond.push(stackFirst.pop());
    }

    T output = stackSecond.pop();

    while (stackSecond.top != null){
      stackFirst.push(stackSecond.pop());
    }
    return output;
  }


//  @Override
//  public String toString() {
//    return "PseudoQueue{" + "stackFirst=" + stackFirst + ", stackSecond=" + stackSecond + '}';
//  }

    @Override
  public String toString() {
    String result = "";
    Node current = stackFirst.top;
    while (current != null){
      result+="["+current.value+"]->";
      current = current.next;
    }
    return result;
  }
}

