// breadth-first search for a graph. we use queue for traversing the graph
import java.util.*;
public class bfs {

    public static void main(String[] args) {
        int V = 5;
        int E = 0;
        LinkedList<Integer>[] adj = new LinkedList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
        adj[0].add(1);
        adj[0].add(2);
        adj[1].add(2);
        adj[2].add(3);
        adj[3].add(4);
        System.out.println("Number of edges: " + E);
        System.out.println("Number of vertices: " + V);
        System.out.println("Adjacency list: ");
        for (int i = 0; i < V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < adj[i].size(); j++) {
                System.out.print(adj[i].get(j) + " ");
            }
            System.out.println();
        }
        System.out.println("Breadth-first search: ");
        bfsSearch(adj, V);
    }

    public static void bfsSearch(LinkedList<Integer>[] adj, int V) {
        boolean[] visited = new boolean[V];
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(0);
        visited[0] = true;
        while (!q.isEmpty()) {
            int v = q.remove();
            System.out.print(v + " ");
            for (int w : adj[v]) {
                if (!visited[w]) {
                    q.add(w);
                    visited[w] = true;
                }
            }
        }
    }
}

