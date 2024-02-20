/*
Experiment -8 
Write a java program to implement the following for a)BFS graph AIM: 
To write a java program for implementing the BFS for a graph 
ALGORITHM: 
Step 1: Start. 
Step 2: Declare required header files. 
Step 3: Create a graph class using adjacent list. 
Step 4: Define addEdge to add an edge into the graph. 
Step 5: Define BFS for printing BFS traversal from a given source s initially mark all the               vertices as not visited (by default set as false). 
Step 6: Create a queue for BFS and mark the current node as visited and enqueue it (insert),                  dequeue it when the size of the queue is not equal to zero. 
Step 7: Get all adjacent vertices of the dequeued vertex  s , if a adjacent has not been visited,               then mark it visited and enqueue it. 
Step 8: Import all these methods to main method and traverse through one level of children                 nodes, then traverse through the level of grandchildren nodes. Step 9: Stop 
 

SOURCE CODE: */
import java.io.*; import java.util.*; class Graph 
{ 
    private int V;        private LinkedList<Integer> adj[];  
    Graph(int v) 
    { 
        V = v; 
        adj = new LinkedList[v];         for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
    void addEdge(int v,int w) 
    { 
        adj[v].add(w); 
    } 
    void BFS(int s) { 
        boolean visited[] = new boolean[V]; 
        LinkedList<Integer> queue = new LinkedList<Integer>();         visited[s]=true;         queue.add(s);  
        while (queue.size() != 0) 
        { 
            s = queue.poll(); 
            System.out.print(s+" "); 
            Iterator<Integer> i = adj[s].listIterator();             while (i.hasNext()) 
            { 
                int n = i.next();                 if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
    public static void main(String args[])  {         Graph g = new Graph(4);          g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 0); 
        g.addEdge(2, 3); 
        g.addEdge(3, 3); 
        System.out.println("Following is Breadth First Traversal "+ "(starting from vertex 2)");            g.BFS(2);  
    } 
} 
