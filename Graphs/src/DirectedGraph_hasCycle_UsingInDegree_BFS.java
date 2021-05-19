import java.util.*;

public class DirectedGraph_hasCycle_UsingInDegree_BFS {
    static class Graph{
        List<List<Integer>> adj_list;
        HashMap<Integer, Integer> incomingDegree;
        int visitedNodes;
        int nodes;
        Queue<Integer> sourceQueue;
        public Graph(int node){
            adj_list = new ArrayList<>();
            incomingDegree = new HashMap<>();
            sourceQueue = new LinkedList<>();
            visitedNodes = 0;
            this.nodes = node;
            for (int i=0; i<nodes;i++){
                adj_list.add(i, new ArrayList<>());
                incomingDegree.put(i, 0);
            }
        }
        public void addEdge(int a, int b){
            adj_list.get(a).add(b);
            incomingDegree.put(b, incomingDegree.get(b)+1);
        }
        public boolean checkIfGraphHasCycle(){
            for (Map.Entry<Integer,Integer>entry: incomingDegree.entrySet()){
                if (entry.getValue() == 0){
                    sourceQueue.add(entry.getKey());
                }
            }
//            while (!sourceQueue.isEmpty()){
//                visitedNodes++;
//                int source = sourceQueue.remove();
//                List<Integer> neighbourList = adj_list.get(source);
//                for (int i=0;i<neighbourList.size();i++){
//                    incomingDegree.put(neighbourList.get(i), incomingDegree.get(neighbourList.get(i)-1));
//
//                    if (incomingDegree.get(neighbourList.get(i)) == 0){
//                        sourceQueue.add(neighbourList.get(i));
//                    }
//                }
//            }
            while(!sourceQueue.isEmpty()) {
                visitedNodes++;
                int source = sourceQueue.remove();

                List<Integer> childrenList = adj_list.get(source);

                for(Integer child: childrenList) {
                    incomingDegree.put(child, incomingDegree.get(child) - 1);

                    if(incomingDegree.get(child) == 0) {
                        sourceQueue.add(child);
                    }
                }
            }
            return nodes != visitedNodes;
        }

    }

    public static void main(String[] args) {
        int nodes = 4;

        Graph g = new Graph(nodes);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(3, 0);
        System.out.println(g.checkIfGraphHasCycle());
    }
}
