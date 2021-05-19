import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DirectedGraphHasCycle {
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

        public boolean ifDirectedGraphHasCycle() {
            for (int i=0;i<nodes;i++){
                if (visitedList[i] == false){
                    if (Cycle(i, -1)){
                        return true;
                    }
                }
            }
            return false;
        }
        //        --------------------------------
        public boolean ifCycle(int index, int parent) {

            visitedList[index] = true;

            List<Integer> neighbourList = adj_list.get(index);

            for(Integer neighbour: neighbourList) {
                if(!visitedList[neighbour]) {
//            ifCycle(neighbour, index);
                    if(ifCycle(neighbour,index)){
                        return true ;
                    }
                } else if(neighbour != parent) {
                    return true;
                }
            }

            return false;
        }
        //        ---------------------------------------
        public boolean Cycle(int start, int parent){
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
                        parent = node;
//                        start = neighbourList.get(i);
                        System.out.println(parent+" "+ start);
                    }
                    else if (neighbourList.get(i) != parent){
                        return true;
                    }
                }
            }
            return false;

        }

    }

    public static void main(String[] args) {
        int nodes = 5;

        Graph g = new Graph(nodes);

        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(0, 3);
        g.addEdge(3, 4);
        g.addEdge(4, 0);
        System.out.println(g.ifDirectedGraphHasCycle());
    }
}
