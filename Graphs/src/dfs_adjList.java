import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class dfs_adjList {
    public static class Graph{
        List<List<Integer>> adjList;
//        LinkedList<Integer> adjList[];
        boolean[] visited;
        public Graph(int nodes){
            adjList = new ArrayList<>();
//            adjList = new LinkedList[];
            visited = new boolean[nodes];

            for (int i=0; i < nodes; i++){
                adjList.add(i,new ArrayList<>());
//                adjList[i] = new ArrayList<>();
            }
        }
        public void addEdge(int a, int b){
            adjList.get(a).add(b);
            adjList.get(b).add(a);
        }

        public void dfs(int start){
            Stack<Integer> stk = new Stack<>();
            stk.push(start);
            visited[start] = true;
            while (!stk.isEmpty()) {
                Integer node = stk.pop();
                System.out.print(node + " ");
                List<Integer> neighbourList = adjList.get(node);
                for (int i = 0; i < neighbourList.size(); i++) {
                    if (visited[neighbourList.get(i)] == false) {
                        stk.push(neighbourList.get(i));
                        visited[neighbourList.get(i)] = true;
                    }
                }
            }

        }
//        ------------BY RECURSION--------------
        public void dfsRecursion(int start){
//            if (!visited[start]){
//                System.out.print(start+" ");
////            }
//            visited[start] = true;
////            count++;
//            System.out.print(start+" ");
//
//            for (int i=0; i < adjList.get(start).size(); i++){
//                if (visited[adjList.get(start).get(i)] == false){
//
//                    dfsRecursion(adjList.get(start).get(i));
//                }
//            }

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
        g.dfs(0);
        System.out.println();
//        g.dfsRecursion(0);

    }
}
