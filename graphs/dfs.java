//code for dfs of an undirected graph
import java.util.LinkedList;
import java.util.Stack;

public class dfs{
    private LinkedList<Integer>[] adj;
    private int V;

    public void graph(int nodes){
        this.V = nodes;
        this.adj = new LinkedList[nodes];
        for(int i = 0; i < V; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public void dfsSearch(int s){
        boolean[] visited = new boolean[V];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(s);
        while(!stack.isEmpty()){
            int v = stack.pop();
            if(!visited[v]){
                visited[v] = true;
                System.out.print(v + " ");
                for(int w : adj[v]){
                    if(!visited[w]){
                        stack.push(w);
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        dfs dfs = new dfs();
        dfs.graph(5);
        dfs.addEdge(0, 1);
        dfs.addEdge(1, 2);
        dfs.addEdge(2, 3);
        dfs.addEdge(3, 0);
        dfs.addEdge(2, 4);
        dfs.dfsSearch(0);
    }

}