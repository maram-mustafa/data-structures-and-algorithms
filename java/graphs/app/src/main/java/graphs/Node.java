package graphs;

import java.util.Objects;

public class Node<T>{

//  String label;
  T value ;
  public Node next;


  public Node(T value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Node{" +
      "value=" + value +
      ", next=" + next +
      '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Node<?> node = (Node<?>) o;
    return Objects.equals(value, node.value) && Objects.equals(next, node.next);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, next);
  }


  //  Node(String label) {
//    this.label = label;
//  }
//
//  @Override
//  public String toString() {
//    return "Node{" +
//      "label='" + label + '\'' +
//      '}';
//  }
//
//  @Override
//  public boolean equals(Object o) {
//    if (this == o) return true;
//    if (o == null || getClass() != o.getClass()) return false;
//    Node node = (Node) o;
//    return Objects.equals(label, node.label);
//  }
//
//  @Override
//  public int hashCode() {
//    return Objects.hash(label);
//  }
}
