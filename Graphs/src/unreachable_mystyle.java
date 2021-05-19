import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class unreachable_mystyle {
    static class Graph{
        List<List<Integer>> adj_list;
        boolean[] visitedList;
        Graph(int nodes){
            adj_list = new ArrayList<>();
            visitedList = new boolean[nodes];
            for (int i = 0; i< nodes;i++){
                adj_list.add(i, new ArrayList<>());
            }
        }
        public void addEdge(int a, int b){
            adj_list.get(a).add(b);
            adj_list.get(b).add(a);
        }

        public void dfs(int start){
            Stack<Integer> stk = new Stack<>();
//            int count=0;
            visitedList[0] = true;
            stk.push(0);
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
        public boolean iGraphConnected(){
            int startIndex = 0;
            dfs(startIndex);
            for (int i=0; i< visitedList.length;i++){
                if (visitedList[i] == false){
                    return false;
                }
            }
            return true;
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
//        g.addEdge(4, 6);
        System.out.println(g.iGraphConnected());


    }
}
