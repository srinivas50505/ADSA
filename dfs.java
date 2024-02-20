
 
 /*
 
8b) DFS AIM: 
To write a Java program for implementing the DFS for a graph 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a class DFS and initialize V (no. of vertices) as we are building graph using              adjacency list so we should have linked list for every that list node and store adjacent               nodes in that list. 
Step 4: Create a constructor for class DFS and create an empty list for every node. 
Step 5: Define addEdgesToGraph function for adding edges to graph, and define add               function in it for adding vertex to adjacency list of another vertex so that edge can be              added to graph. 
Step 6:  Define DFTraversal and traverse one strong component completely. 
Step 7: Define DFSearch and call DFTraverial on disconnected components, it will keep                track of visited [ ] array. 
Step 8: Define all these functions in the main method and call DFSearch. It will keep track of                   visited[ ] array. 
Step 9: Stop. 
 
 
 
SOURCE CODE: */
import java.io.*; import java.util.*;  
public class DFS{ 
    int V 
    LinkedList<Integer> adjList[];  
    DFS(int v) {         V = v; 
        adjList = new LinkedList[v];         for (int i=0; i<v; ++i){ 
            adjList[i] = new LinkedList();   
         } 
    }  
    void addEdgesToGraph(int v, int u){         adjList[v].add(u);      
    } 
    void DFTraversal(int v,int visited[])  {         visited[v] = 1; 
System.out.print(v + " "); 
        Iterator<Integer> i = adjList[v].listIterator();         while (i.hasNext()) {             int n = i.next();             if (visited[n]==0) 
                DFTraversal(n, visited); 
        } 
    } 
    void DFSearch(int v) 
    { 
        int visited[] = new int[V];         DFTraversal(v, visited); 
 	 	for (int i=1;i<V;i++) 
 	 	{ 
 	 	 	if(visited[i]==0) 
 	 	 	{ 
 	 	     DFTraversal(i, visited); 
 	 	 	} 
 	 	} 
    } 
    public static void main(String args[]) 
    { 
        DFS obj = new DFS(10);          obj.addEdgesToGraph(1,2);         obj.addEdgesToGraph(1,4);         obj.addEdgesToGraph(2,5);         obj.addEdgesToGraph(2,6);         obj.addEdgesToGraph(4,7);         obj.addEdgesToGraph(4,8);         obj.addEdgesToGraph(3,9);         obj.addEdgesToGraph(3,4);         obj.addEdgesToGraph(4,3);  
        obj.DFSearch(1); 
    } 
} 

 
 
