import java.util.LinkedList;
import java.util.Queue;

public class bfs_ajdMatrix {
    public static class Vertex{
        char label;
        boolean wasVisited;
        public Vertex(char lab){
            label = lab;
            wasVisited = false;
        }
    }
    public static class Graph{
        public int MAX_Vert = 20;
        public Vertex[] vertexList;
        public int nVertex;
        public int[][] adjMatrix;
        public Queue<Integer> q;
        public Graph(){
            vertexList = new Vertex[MAX_Vert];
            adjMatrix = new int[MAX_Vert][MAX_Vert];
            nVertex = 0;
            q = new LinkedList<>();
        }
        public void addVertex(char V){
            vertexList[nVertex++] = new Vertex(V);
        }
        
        public void addEdges(int start, int end){
            adjMatrix[start][end] = 1;
            adjMatrix[end][start] = 1;
        }
        
        public void displayVertex(int ver){
            System.out.print(vertexList[ver].label+" ");
        }

        public int getUncoveredVertex(int vert){
            for (int i=0; i< nVertex; i++){
                if (adjMatrix[vert][i]== 1 && vertexList[i].wasVisited == false){
                    return i;
                }
            }
            return -1;
        }
        
        public void bfs_adjMatrix(){
            vertexList[0].wasVisited = true;
            displayVertex(0);
            q.add(0);
            int v2;
          while (!q.isEmpty()){
              int v1 = q.remove();
              while (( v2 = getUncoveredVertex(v1)) != -1){
                  vertexList[v2].wasVisited = true;
                  displayVertex(v2);
                  q.add(v2);
              }
//              q.poll();
//              int vert = getUncoveredVertex(q.peek());
//              if (vert == -1){
//                  q.poll();
//              }
//              else {
//                  vertexList[vert].wasVisited = true;
//                  displayVertex(vert);
//                  q.add(vert);
//              }
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

        g.bfs_adjMatrix();
    }
}
