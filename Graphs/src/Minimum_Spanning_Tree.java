import java.util.Arrays;
import java.util.Scanner;

public class Minimum_Spanning_Tree {
    static class Edge implements Comparable<Edge>{
        int src;
        int dest;
        int weight;
        public int compareTo(Edge e2){
            return this.weight-e2.weight;
        }

    }
    static int V;
    static int E;
    static int[] parent;
    static Edge edgeList[];

    public static int superParent(int p){
        if (parent[p] == p){
            return p;
        }
        else {
            int superParent_P = superParent(parent[p]);
            parent[p] = superParent_P;
            return superParent_P;
        }
    }

    public static void unite(int x, int y){
        int parX = superParent(x);
        int parY = superParent(y);

        if (parX != parY){ // no cycle as x and y are of different component
            parent[parX] = parY;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        V = sc.nextInt();
        E = sc.nextInt();
        edgeList = new Edge[E];
        parent = new int[V+1];

        for (int i=0; i<E;i++){
            Edge e = new Edge();
            e.src = sc.nextInt();
            e.dest = sc.nextInt();
            e.weight = (e.src + e.dest)%1000;
            edgeList[i] = e;
        }

        for (int i=0; i<=V;i++){
            parent[i] = i;
        }

        Arrays.sort(edgeList);
        int totalWeight = 0;
        for (int i=0; i<E; i++){
            int wt = edgeList[i].weight;
            int src = edgeList[i].src;
            int dest = edgeList[i].dest;

            if (superParent(src) != superParent(dest)){ // no cycle created by edge
                unite(src, dest);
                totalWeight += wt;
            }
        }
        System.out.println(totalWeight);

    }
}
