import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra_Algorithm__Min_distance_Betw_SourcetoDestinationUnweightedGraph {
    static class Edge {
        int targetNode;
        int distanceFromNode;
        Edge(int targetNode, int distance) {
            this.targetNode = targetNode;
            this.distanceFromNode = distance;
        }
    }
    static class Graph {
        List<List<Edge>> adj_list;
        boolean[] visited;
        int[] distance;
        Graph(int nodes) {
            adj_list = new ArrayList<>();
            visited = new boolean[nodes];
            distance = new int[nodes];
            for (int i = 0; i < nodes; i++) {
                adj_list.add(i, new ArrayList<>());
                distance[i] = Integer.MAX_VALUE;
            }
        }
        public void addEdge(int sourceNode, int targetNode, int distance) {
            adj_list.get(sourceNode).add(new Edge(targetNode, distance));
            //graph.get(targetNode).add(new Edge(sourceNode, distance));
        }
        public int minimumDistanceBetweenTwoNodes(int source, int destination) {
            if (source == destination)
                return 0;
            PriorityQueue<Edge> minHeap = new PriorityQueue<>((e1, e2) -> e1.distanceFromNode - e2.distanceFromNode);
            distance[source] = 0;
            minHeap.add(new Edge(0, 0));
            while (!minHeap.isEmpty()) {
                int v = minHeap.poll().targetNode;
                if (visited[v]) {
                    continue;
                }
                visited[v] = true;
                List<Edge> childList = adj_list.get(v);
                for (Edge child : childList) {
                    int dist = child.distanceFromNode;
                    int childNode = child.targetNode;
                    if (!visited[childNode] && (distance[v] + dist < distance[childNode])) {
                        distance[childNode] = distance[v] + dist;
                        child.distanceFromNode = distance[v] + dist;
                        minHeap.add(child);
                    }
                }
            }
            return distance[destination];
        }
    }

    public static void main(String[] args) {
        int nodes = 5;
        Graph a = new Graph(nodes);

        a.addEdge(0, 1, 1);
        a.addEdge(0, 2, 7);
        a.addEdge(1, 2, 5);
        a.addEdge(1, 4, 4);
        a.addEdge(4, 3, 2);
        a.addEdge(2, 3, 6);

        System.out.println(a.minimumDistanceBetweenTwoNodes(0, 3));
    }
}
