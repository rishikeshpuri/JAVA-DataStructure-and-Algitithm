import java.util.LinkedList;
import java.util.Stack;

public class DFS_adjMatrix {

    static class Vertex{
        public char label;
        public boolean wasVisited;

        public Vertex(char lab){
            label = lab;
            wasVisited = false;
        }
    }

    static class Graph{

        public int MAX_Vertex = 20;
        public Vertex[] vertexList;
        public int[][] ajdMatrix;
        public int nVertex;
        public Stack<Integer> stk;

        public Graph(){
            vertexList = new Vertex[MAX_Vertex];
            ajdMatrix = new int[MAX_Vertex][MAX_Vertex];
            nVertex=0;
            stk = new Stack<>();
        }
        public void addVertex(char lab){
            vertexList[nVertex++] = new Vertex(lab);
//            nVertex++;
        }
        public void addEdges(int start, int end){
            ajdMatrix[start][end] = 1;
            ajdMatrix[end][start] = 1;
        }
//        print vertex
        public void displayVertex(int V){
            System.out.print(vertexList[V].label + " ");
        }

        public int getAdjUnvisitedVertex(int v){
            for (int i = 0; i < nVertex; i++){
                if (ajdMatrix[v][i] == 1 && vertexList[i].wasVisited == false){
                    return i;
                }
            }
            return -1;
        }
        public void dfs_adjMat(){
            vertexList[0].wasVisited = true;
            displayVertex(0);
            stk.push(0);

            while (!stk.isEmpty()){
                int vert = getAdjUnvisitedVertex(stk.peek());
                if (vert == -1){
                    stk.pop();
                }
                else {
                    vertexList[vert].wasVisited = true;
                    displayVertex(vert);
                    stk.push(vert);

                }
            }


        }

    }


    public static void main(String[] args) {
        Graph g = new Graph();

        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');
        g.addVertex('F');

        g.addEdges(0,1);
        g.addEdges(1,2);
        g.addEdges(0,3);
        g.addEdges(3,4);
        g.addEdges(4,5);
        g.addEdges(1,3);
        g.dfs_adjMat();
//        for (int i=0; i< g.MAX_Vertex;i++){
//            if (g.vertexList[i] == null){
//                System.out.print(0+" ");
//            }
//            else {
//                System.out.print(g.vertexList[i].label+" ");
//            }
//
//        }
//        System.out.println(g.vertexList.length);

    }
}
