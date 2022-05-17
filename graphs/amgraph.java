//code for undirected graph through adjacency matrix
public class amgraph{
    int v;
    int e;
    int[][] adj;
    amgraph(int v){
        this.v=v;
        adj=new int[v][v];
    }
    
    void addEdge(int u,int v){
        adj[u][v]=1;
        adj[v][u]=1;
        e++;
    }

    void removeEdge(int u,int v){
        adj[u][v]=0;
        adj[v][u]=0;
        e--;
    }
    void print(){
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                System.out.print(adj[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        amgraph g=new amgraph(5);
        g.addEdge(0,1); 
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.print();
    }
}

// alternative code
/* 
public class graph{
    private int v; //number of vertices
    private int e; //number of edges
    private int[][] adj; //adjacency matrix

    public graph(int nodes){
        this.v=nodes;
        adj=new int[nodes][nodes];
    }

    public void addEdge(int u,int v){
        adj[u][v]=1;
        adj[v][u]=1;
        e++; //increment the number of edges
    }

    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("Number of vertices: "+v+" Number of edges: "+e+"\n");
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                sb.append(adj[i][j]+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        graph g=new graph(5);
        g.addEdge(0,1); 
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,3);
        g.addEdge(3,4);
        System.out.println(g);
    }
}
*/