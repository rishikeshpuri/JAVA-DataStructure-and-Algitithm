import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class rough {
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
            adj_list.get(targetNode).add(new Edge(sourceNode, distance));
        }
        public void minimumDistanceBetweenTwoNodes(int source, int destination) {
            if (source == destination)
                return;
            PriorityQueue<Edge> minHeap = new PriorityQueue<>((e1, e2) -> e1.distanceFromNode - e2.distanceFromNode);
            distance[source] = 0;
            minHeap.add(new Edge(1, 0));
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
            for (int i=2; i<distance.length;i++){
                System.out.println(distance[i]);
            }
        }
    }

    public static void main(String[] args)throws IOException {
//        int nodes = 5;
//        Graph a = new Graph(nodes);
//        a.addEdge(0, 1, 0);
//
//        a.addEdge(1, 2, 3);
//        a.addEdge(1, 4, 5);
//        a.addEdge(4, 2, 6);
//        a.addEdge(4, 3, 7);
//        a.addEdge(2, 3, 5);
//
//        a.minimumDistanceBetweenTwoNodes(0, 4);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);

        Graph g = new Graph(M);

        for (int i=1; i<=M; i++){
            String[] strArr = br.readLine().split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            g.addEdge(a,b,(a+b)%1000);
        }
        g.minimumDistanceBetweenTwoNodes(1, 4);
    }
}
