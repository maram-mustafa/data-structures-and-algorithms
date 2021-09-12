package HashTable;

public class Node {
  public Object key;
  public Object value;
  public Node next;


  public Node(Object key, Object value) {
    this.key = key;
    this.value = value;
  }

  public Node() {
  }

  public Object getKey() {
    return key;
  }

  public void setKey(Object key) {
    this.key = key;
  }

  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }
}
