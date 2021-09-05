package HashTable;

public class Node<T> {
  public int key;
  public T value;
  public Node next;


  public Node(int key, T value) {
    this.key = key;
    this.value = value;
    next=null;
  }

  public Node() {
    next = null;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
