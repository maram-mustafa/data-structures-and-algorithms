package graphs;

import java.util.*;

public class Graph<T> {

  private Map<Node<T>, List<Node<T>>> map = new HashMap<>();


  public Node<T> addNode(T value) {
    Node node = new Node(value);
    map.put(node, new ArrayList<>());
    return node;
  }

  void addEdge(T firstNode, T secondNode) {
    Node value1= new Node(firstNode);
    Node value2 = new Node(secondNode);
    map.get(value1).add(value2);
    map.get(value2).add(value1);
  }

  public ArrayList<Node> getNodes() {

    ArrayList<Node> listOfNodes = new ArrayList<>();
    listOfNodes.addAll(map.keySet());
    return listOfNodes;
  }
  public ArrayList<Node<T>> getNeighbore(T value) {
  return (ArrayList<Node<T>>) map.get(new Node<T>(value));
  }

  public int size() {
    return map.size();
  }


/////////////////////////////////////////////// code challenge 36 /////////////////////////////////
  public ArrayList<Node<T>> breadthFirst(T value) throws Exception {
    Node<T> newNode = new Node(value);
    if (newNode.value == null) return null;
    List<Node<T>> addedNode = new ArrayList<>();
    Queue<T> queueNode = new Queue<T>();
    Set<Node<T>> visitedBefore = new HashSet<>();

    queueNode.enqueue((T) newNode);
    visitedBefore.add(newNode);

    while (!queueNode.isEmpty()) {
      Node<T> front = (Node<T>) queueNode.dequeue();
      addedNode.add(front);
      for (Node<T> neighbor : getNeighbore(front.value)) {
        if (!visitedBefore.contains(neighbor)) {
          visitedBefore.add(neighbor);
          queueNode.enqueue((T) neighbor);
        }
      }
    }
    return (ArrayList<Node<T>>) addedNode;
  }

  ////////////////////////////////////////////////////////////////////////////////////////////////////////////
  public Map<Node<T>, List<Node<T>>> getMap() {
    return map;
  }

  public void setMap(Map<Node<T>, List<Node<T>>> map) {
    this.map = map;
  }

  @Override
  public String toString() {
    return "Graph{" +
      "map=" + map +
      '}';
  }
}
