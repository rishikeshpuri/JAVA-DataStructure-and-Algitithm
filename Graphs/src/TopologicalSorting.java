import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TopologicalSorting {
    static int[] visited = new int[200001];
    static ArrayList<Integer> arr[] = new ArrayList[200001];
    static int flag = 0;
    public static void dfs(int node){
        visited[node] = 1;
        for (int i=0; i < arr[node].size(); i++){
            int neighbour = arr[node].get(i);
//            if ( neighbour == parent){
//                continue;
//            }
            if (visited[neighbour] == 0){
                dfs(neighbour);
            }
            if (visited[neighbour] == 1){
                flag=1;
                return;
            }
        }
        visited[node] = 2;
    }

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split(" ");
        int N = Integer.parseInt(s[0]);
        int M = Integer.parseInt(s[1]);
//        adjacency List
        for (int i=0; i<=N; i++){
            arr[i] = new ArrayList<>();
        }
//          edges
        for (int i=1; i<=M; i++){
            String[] strArr = br.readLine().split(" ");
            int a = Integer.parseInt(strArr[0]);
            int b = Integer.parseInt(strArr[1]);
            arr[a].add(b);
        }
        for (int i=0; i<N; i++){
            if (visited[i] == 0){
                dfs(i);
            }
        }
        if (flag == 1){
            System.out.println("0");//cycle exist, so can't perform topological sort
        }
        else {
            System.out.println("1"); // cycle doesnot exit
        }
    }
}
