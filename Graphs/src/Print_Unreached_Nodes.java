//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Print_Unreached_Nodes {
//    static int[] visited = new int[100001];
//    static ArrayList<Integer> arr[] = new ArrayList[100001];
//    static int count=0;
//
//    public static void dfs(int node){
//        visited[node] = 1;
//        count++;
//        for (int i=0; i < arr[node].size(); i++){
//            if (visited[arr[node].get(i)] == 0){
//                dfs(arr[node].get(i));
//            }
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
////        adjacency List
//        for (int i=0; i<=N; i++){
//            arr[i] = new ArrayList<>();
//        }
////          edges
//        for (int i=1; i<=M; i++){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//            arr[a].add(b);
//            arr[b].add(a);
//        }
//        int head = sc.nextInt();
//        dfs(head);
//
//        int NodeUncovered = N - count;
//        System.out.println(NodeUncovered);
//    }
//}
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Print_Unreached_Nodes {
    static int count=0;
    public static class Graph{
        List<List<Integer>> graph;
        boolean[] visited;

        public Graph(int nodes){
            graph = new ArrayList<>();
            visited = new boolean[nodes];

            for (int i=0; i < nodes; i++){
                graph.add(i,new ArrayList<>());
            }
        }
        public void addEdge(int a, int b){
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        public void dfs(int start){
            Stack<Integer> stk = new Stack<>();
            stk.push(start);
            visited[start] = true;
            count++;
            while (!stk.isEmpty()){
                Integer node = stk.pop();
                System.out.print(node+" ");
                List<Integer> neighbourList = graph.get(node);
                for (int i=0; i<neighbourList.size();i++){
                    if (visited[neighbourList.get(i)] == false){
                        stk.push(neighbourList.get(i));
                        visited[neighbourList.get(i)] = true;
                        count++;
                    }
                }
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int nodes = N+1;

        Graph g = new Graph(nodes);

        for (int i= 1; i<= M;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            g.addEdge(a,b);
        }
        int head = sc.nextInt();
        g.dfs(head);
        System.out.println();
        int NodeUncovered = N - count;
        System.out.println(NodeUncovered);
    }
}

