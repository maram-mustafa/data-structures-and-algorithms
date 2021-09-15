package graphs;

import java.util.*;

public class Graph<T> {

  public Map<Node<T>, List<Node<T>>> map = new HashMap<>();


  public Node<T> addNode(T value) {
    Node node = new Node(value);
    map.put(node, new ArrayList<>());
    return node;
  }

  void addEdge(T firstNode, T secondNode) {
    Node value1 = new Node(firstNode);
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

  public List<Node<T>> breadthFirst(T value) throws Exception {
    Node<T> node = new Node(value);
    if (node.value == null) return null;
    List<Node<T>> nodeList = new ArrayList<>();
    Queue<T> breadthQueue = new Queue<T>();
    Set<Node<T>> visitedBefore = new HashSet<>();

    breadthQueue.enqueue((T) node);
    visitedBefore.add(node);

    while (!breadthQueue.isEmpty()) {
      Node<T> firstValue = (Node<T>) breadthQueue.dequeue();
      nodeList.add(firstValue);
      for (Node<T> neighborNode : getNeighbore(firstValue.value)) {
        if (!visitedBefore.contains(neighborNode)) {
          visitedBefore.add(neighborNode);
          breadthQueue.enqueue((T) neighborNode);
        }
      }
    }
    return nodeList;
  }

  /////////////////////////////////////////////////code challenge 38///////////////////////////////////////////////////////////

  Set<Node<T>> depthFirstTraversal(T value) throws Exception {
    Node<T> node = new Node(value);
    Set<Node<T>> visitedBefore = new HashSet<>();
    Stack<T> stack = new Stack<T>();
    stack.push((T) node);
    while (!stack.isEmpty()) {
      T vertex = stack.pop();
      if (!visitedBefore.contains(vertex)) {
        visitedBefore.add((Node<T>) vertex);
        for (Node v : getNeighbore((T) ((Node<?>) vertex).value)) {
          stack.push((T) v);
        }
      }
    }
    return  visitedBefore;
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
