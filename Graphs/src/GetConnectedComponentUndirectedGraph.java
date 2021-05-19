import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GetConnectedComponentUndirectedGraph {
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
            adj_list.get(b).add(a);
        }

        public void dfs(int start){
            Stack<Integer> stk = new Stack<>();
            stk.add(start);
            visitedList[start] = true;
            while (!stk.isEmpty()){
                int node = stk.pop();
//                System.out.print(node+" ");
                List<Integer>neighbourList = adj_list.get(node);
                for (int i=0; i< neighbourList.size();i++){
                    if (visitedList[neighbourList.get(i)] == false){
                        visitedList[neighbourList.get(i)] = true;
                        stk.push(neighbourList.get(i));
                    }
                }
            }

        }
        public int connectedComponent(){
            int count=0;
            for (int i=0; i< nodes;i++){
                if (visitedList[i] == false){
                    dfs(i);
                    count++;
                }
            }
            return count;
        }

    }

    public static void main(String[] args) {
        int nodes =7;
        Graph g = new Graph(nodes);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);

        g.addEdge(4, 5);
        g.addEdge(4, 6);
        System.out.println(g.connectedComponent());
    }
}
