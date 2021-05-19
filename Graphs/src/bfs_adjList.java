import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs_adjList {
    public static class Graph{
        List<List<Integer>> adjList;
        boolean[] visited;

        public Graph(int nodes){
            adjList = new ArrayList<>();
            visited = new boolean[nodes];

            for (int i=0; i< nodes;i++){
                adjList.add(i, new ArrayList<>());
            }
        }
        public void addEdge(int a, int b){
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        public void bfs(int start){
            Queue<Integer> q = new LinkedList<>();
            q.add(start);
            visited[start] = true;
            while (!q.isEmpty()){
                int node = q.poll();
                System.out.print(node +" ");
                List<Integer> neighbourList = adjList.get(node);
                for (int i=0; i < neighbourList.size();i++){
                    if (visited[neighbourList.get(i)]== false){
                        q.add(neighbourList.get(i));
                        visited[neighbourList.get(i)] = true;

                    }
                }
            }
        }

    }
    public static void main(String[] args) {
        int nodes = 7;
        Graph g = new Graph(nodes);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.addEdge(4, 6);
        g.bfs(0);
    }
}
