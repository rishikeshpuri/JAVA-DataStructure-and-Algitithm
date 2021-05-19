import java.util.*;

public class TopologicalSort_adjList {
    static class Graph{
        List<List<Integer>> adj_list;
        HashMap<Integer, Integer> incomingDegree;
        int nodes;
        Queue<Integer> q;
        Graph(int node){
            adj_list = new ArrayList<>();
            incomingDegree = new HashMap<>();
            nodes = node;
            q = new LinkedList<>();

            for (int i=0; i< nodes; i++){
                adj_list.add(i, new ArrayList<>());
                incomingDegree.put(i, 0);

            }
        }
        public void addEdge(int a, int b){
            adj_list.get(a).add(b);
            incomingDegree.put(b, incomingDegree.get(b)+1);
        }
        public List<Integer> topologicalSort(){
            for (Map.Entry<Integer, Integer> entry:incomingDegree.entrySet()){
                if (entry.getValue() == 0){
                    q.add(entry.getKey());
                }
            }
            List<Integer> result = new ArrayList<>();

            while (!q.isEmpty()){
                int source = q.remove();
                result.add(source);
                List<Integer> neighbourChild = adj_list.get(source);
                for (int neighbour: neighbourChild){
                    incomingDegree.put(neighbour, incomingDegree.get(neighbour)-1);

                    if (incomingDegree.get(neighbour) == 0){
                        q.add(neighbour);
                    }
                }
            }
            if (result.size() !=nodes){
                System.out.println("Cycle is there in graph");
                return new ArrayList<>();
            }
            return result;
        }

    }
    public static void main(String[] args) {
        int node=6;
        Graph a = new Graph(node);
        a.addEdge(0, 1);
        a.addEdge(0, 2);
        a.addEdge(1, 3);
        a.addEdge(1, 4);
        a.addEdge(2, 4);
        a.addEdge(3, 5);
        a.addEdge(4, 5);

        System.out.println(a.topologicalSort());
    }
}
