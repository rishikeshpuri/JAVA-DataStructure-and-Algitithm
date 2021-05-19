import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Min_distance_Betw_SourcetoDestinationUnweightedGraph {
    static class Graph{
        List<List<Integer>> adj_list;
        boolean[] visited;
        Graph(int nodes) {
            adj_list = new ArrayList<>();
            visited = new boolean[nodes];
            for(int i = 0; i < nodes; i++) {
                adj_list.add(i, new ArrayList<>());
            }
        }
        public void addEdge(int a, int b) {
            adj_list.get(a).add(b);
            adj_list.get(b).add(a);
        }
        public int minimumDistanceBetweenTwoNodes(int source, int destination) {
            if(source == destination) {
                return 0;
            }
            Queue<Integer> queue = new LinkedList<>();
            int minDistance = 0;
            queue.add(source);
            visited[source] = true;
            while(!queue.isEmpty()) {
                int size = queue.size();
                while(size > 0) {
                    int node = queue.poll();
                    List<Integer> childList = adj_list.get(node);
                    for(Integer child: childList) {
                        if(child == destination) {
                            return ++minDistance;
                        }
                        if(visited[child] == false) {
                            queue.add(child);
                            visited[child] = true;
                        }
                    }
                    size--;
                }
                minDistance++;
            }
            return -1;
        }
    }

    public static void main(String[] args) {
        int nodes = 6;

        Graph a = new Graph(nodes);

        a.addEdge(0, 1);
        a.addEdge(0, 3);
        a.addEdge(1, 2);
        a.addEdge(3, 4);
        a.addEdge(2, 4);
        a.addEdge(4, 5);

        System.out.println(a.minimumDistanceBetweenTwoNodes(0, 5));
    }
}
