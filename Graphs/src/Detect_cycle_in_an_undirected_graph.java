import java.util.ArrayList;
import java.util.Scanner;

public class Detect_cycle_in_an_undirected_graph {
    static int[] visited = new int[100001];
    static ArrayList<Integer> arr[] = new ArrayList[1001];
    static int flag = 0;
    public static void dfs(int node, int parent){
        visited[node] = 1;
        for (int i=0; i < arr[node].size(); i++){
            int neighbour = arr[node].get(i);
            if ( neighbour == parent){
                continue;
            }
            if (visited[neighbour] == 0){
                dfs(neighbour, node);
            }
            if (visited[neighbour] == 1){
                flag=1;
                return;
            }
        }
        visited[node] = 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
//        adjacency List
        for (int i=0; i<=N; i++){
            arr[i] = new ArrayList<>();
        }
//          edges
        for (int i=1; i<=M; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[a].add(b);
            arr[b].add(a);
        }
        for (int i=0; i<N; i++){
            if (visited[i] == 0){
                dfs(i, -1);
            }
        }
        if (flag == 1){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}
