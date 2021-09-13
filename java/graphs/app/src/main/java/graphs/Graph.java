package graphs;

import java.util.*;

public class Graph {

  private Map<Node, List<Node>> adjVertices;


  void addVertex(String label) {
    adjVertices.putIfAbsent(new Node(label), new ArrayList<>());
  }

  void addEdge(String label1, String label2) {
    Node v1 = new Node(label1);
    Node v2 = new Node(label2);
    adjVertices.get(v1).add(v2);
    adjVertices.get(v2).add(v1);
  }

  public Set<Node> getNodes(){
    return adjVertices.keySet();
  }
//
//  public  List<Node> getNeighbore(String label){
//    List<String> values= new ArrayList<>();
//
//    return values;
//  }


  public int size(){
    return adjVertices.size();
  }

  /////////////////////////////////////////////////////////////////
  public Map<Node, List<Node>> getAdjVertices() {
    return adjVertices;
  }

  public void setAdjVertices(Map<Node, List<Node>> adjVertices) {
    this.adjVertices = adjVertices;
  }

  @Override
  public String toString() {
    return "Graph{" +
      "adjVertices=" + adjVertices +
      '}';
  }
}
