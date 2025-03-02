import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graph {


    HashMap<String, ArrayList<String>> adjList = new HashMap<>();

    public boolean addVertex(String vertex){

        if (adjList.get(vertex)==null){
            adjList.put(vertex,new ArrayList<String>());
            return  true;
        }
        return  false;

    }


    public  boolean addEdge(String vertex1,String vertex2){

        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return  true;
        }
        return  false;
    }

    public boolean removeEdge(String vertex1,String vertex2){
        if (adjList.get(vertex1) != null && adjList.get(vertex2) != null) {
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return  true;
        }

        return  false;


    }

    public  boolean removeVertex(String vertex){

        if (adjList.get(vertex)==null)return  false;

        for(String othervertex : adjList.get(vertex)){

            adjList.get(othervertex).remove(vertex);
        }

        adjList.remove(vertex);
        return  true;
    }

    public void printGraph(){
        System.out.println(adjList);
    }

    public static void main(String[] args) {

        Graph mygraph = new Graph();
        mygraph.addVertex("A");
        mygraph.addVertex("B");
        mygraph.addVertex("C");
        mygraph.addVertex("D");
        mygraph.addEdge("A","B");
        mygraph.addEdge("A","C");
        mygraph.addEdge("A","D");
        mygraph.addEdge("B","D");
        mygraph.addEdge("C","D");


       // mygraph.removeEdge("A","B");
        mygraph.removeVertex("D");
        mygraph.printGraph();
    }
}
