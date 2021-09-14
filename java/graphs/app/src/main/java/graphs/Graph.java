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



//  private Map<Node, List<T> > map = new HashMap<>();
//
//  public void addVertex(T value)
//  {
//    map.put((Node) value, new LinkedList<T>());
//  }
//
//  public void addEdge(T source, T destination, boolean bidirectional)
//  {
//
//    if (!map.containsKey(source))
//      addVertex(source);
//
//    if (!map.containsKey(destination))
//      addVertex(destination);
//
//    map.get(source).add(destination);
//    if (bidirectional == true) {
//      map.get(destination).add(source);
//    }
//  }
//
//  public ArrayList<Node> getNodes(){
//    if(map.isEmpty()){
//      return null;
//    }else{
//      ArrayList<Node> listOfAllNodes= new ArrayList<>();
//      listOfAllNodes.addAll(map.keySet());
//      return listOfAllNodes;
//    }
//  }
//
//  public ArrayList<Node<T>> getNeighbors (Node value){
//    return (ArrayList<Node<T>>) map.get(value);
//  }
//
//
//
//  public void getVertexCount()
//  {
//    System.out.println("The graph has "
//      + map.keySet().size()
//      + " vertex");
//  }
//
//
//
//  public int size(){
//    return map.size();
//  }
