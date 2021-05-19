import java.util.*;

public class BreadthFirstSearch {
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
        Scanner sc = new Scanner(System.in);
        int nodes = sc.nextInt();
        Graph g = new Graph(nodes);
        for (int i=1; i<nodes;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.addEdge(a,b);
        }

        g.bfs(0);

    }
}
