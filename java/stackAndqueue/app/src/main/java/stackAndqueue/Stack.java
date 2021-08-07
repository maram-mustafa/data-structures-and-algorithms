package stackAndqueue;

public class Stack<T> {
  Node top;


  public void push (T value){
  Node newValue = new Node(value);
  newValue.next=top;
  top=newValue;
}

  public T pop() throws Exception {
    T StackPop = null;
    if (top == null) {
      throw new Exception("empty!!!!");
    } else {
      StackPop = (T) top.value;
      top = (Node) top.next;
    }
    return StackPop;
  }


  public T peek() throws Exception {
    if (top == null) {
      throw new Exception("empty!!!!");
    } else {
      return (T) top.value;
    }
  }

  public boolean isEmpty(){
    return top == null;
  }


}
