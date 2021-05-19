import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class DirectedGraphStronglyConnected {
    static class Graph{
        List<List<Integer>> adj_list;
        boolean[] visitedList;
        int nodes;
        public Graph(int node){
            adj_list = new ArrayList<>();
            visitedList = new boolean[node];
            this.nodes = node;
            for (int i=0; i<node;i++){
                adj_list.add(i, new ArrayList<>());
            }
        }
        public void addEdge(int a, int b){
            adj_list.get(a).add(b);
//            adj_list.get(b).add(a);
        }

        public void dfs(int start){
            Stack<Integer> stk = new Stack<>();
            stk.add(start);
            visitedList[start] = true;
            while (!stk.isEmpty()){
                int node = stk.pop();
                System.out.print(node+" ");
                List<Integer>neighbourList = adj_list.get(node);
                for (int i=0; i< neighbourList.size();i++){
                    if (visitedList[neighbourList.get(i)] == false){
                        visitedList[neighbourList.get(i)] = true;
                        stk.push(neighbourList.get(i));
                    }
                }
            }

        }
        public boolean ifDirectedGraphStronglyConnected() {
            for (int i = 0; i < nodes; i++) {
                dfs(i);
                System.out.println();
                for (int j = 0; j < nodes; j++) {
                    if (visitedList[j] == false) {
                        return false;
                    }
                }
                Arrays.fill(visitedList, false);
            }
            return true;
        }

    }

    public static void main(String[] args) {
        int nodes =4;
        Graph g = new Graph(nodes);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(0, 3);
        g.addEdge(3, 2);
        System.out.println(g.ifDirectedGraphStronglyConnected());
    }
}
