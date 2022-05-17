// code for undirected graph using adjacency list(array of lists)
import java.util.LinkedList;
public class graph {
    LinkedList<Integer>[] adj;
    int V;
    int E;

    public graph(int nodes) {
        this.V = nodes;
        this.E = 0;
        adj = new LinkedList[nodes];
        for (int i = 0; i < V; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Number of vertices: "+V+" Number of edges: "+E+"\n");
        for(int i=0;i<V;i++){
            sb.append(V + " ");
            for(int j: adj[i]){
                sb.append(j + " ");
                } 
                sb.append("\n");
            }
            return sb.toString();
        }
        

    public void addEdge(int v, int w) {
        adj[v].add(w);
        adj[w].add(v);
        E++;
    }

    public void removeEdge(int v, int w) {
        adj[v].remove(w);
        adj[w].remove(v);
        E--;
    }

    public static void main(String[] args){
        graph g = new graph(5);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        System.out.println("Number of edges: " + g.E);
        System.out.println("Number of vertices: " + g.V);
        System.out.println("Adjacency list: ");
        for (int i = 0; i < g.V; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < g.adj[i].size(); j++) {
                System.out.print(g.adj[i].get(j) + " ");
            }
            System.out.println();
        }
    }

    public void bfs(int i) {
    }

    public void bfsSearch(int i) {
    }

}
