/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graphs;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        Graph newGraph = new Graph();

        newGraph.addNode(1);
        newGraph.addNode(2);
        newGraph.addNode(3);
        newGraph.addNode(4);
        newGraph.addNode(5);
        newGraph.addNode(6);
        newGraph.addEdge(1,2);
        newGraph.addEdge(1,3);
        newGraph.addEdge(2,4);
        newGraph.addEdge(4,5);

//      System.out.println(newGraph);
//      System.out.println(newGraph.size());
//      System.out.println(newGraph.getNodes());
//      System.out.println(newGraph.getNeighbore(1));
//      System.out.println(newGraph.getNeighbore(2));
      System.out.println(newGraph.getNeighbore(3));





    }
}
