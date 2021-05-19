import java.util.Stack;

public class MST_myStyle {
        static class Vertex{
            int label;
            boolean wasVisited;
            Vertex(int lab){
                label = lab;
                wasVisited = false;
            }
        }
        static class Graph{
            private final int Max_vert = 20;
            private Vertex[] visitedList;
            private int[][] adj_mat;
            private int nverts;
            private Stack<Integer> stk;
            Graph(){
                visitedList = new Vertex[Max_vert];
                adj_mat = new int[Max_vert][Max_vert];
                nverts=0;
                stk = new Stack<>();
            }
            public void addVertex(int labe){
                visitedList[nverts++] = new Vertex(labe);
            }
            public void addEdge(int start, int end){
                adj_mat[start][end] = 1;
                adj_mat[end][start] = 1;
            }
            public void displayVertex(int vert){
                System.out.print(visitedList[vert].label+" ");
            }
            public int getAdjUnVisitedVertex(int vert){
                for (int i=0; i<nverts;i++){
                    if (adj_mat[vert][i] == 1 && visitedList[i].wasVisited == false){
                        return i;
                    }
                }
                return -1;
            }
            public void mst(){
                visitedList[0].wasVisited = true;
                stk.push(0);
                while (!stk.isEmpty()){
                    int node = stk.peek();
                    int vert = getAdjUnVisitedVertex(node);
                    if (vert == -1){
                        stk.pop();
                    }
                    else {
                        visitedList[vert].wasVisited = true;
                        displayVertex(node);
                        displayVertex(vert);
                        System.out.print(" ");
                        stk.push(vert);
                    }
                }
            }
        }
        public static void main(String[] args) {
            Graph g = new Graph();

            g.addVertex(1);
            g.addVertex(2);
            g.addVertex(3);
            g.addVertex(4);
            g.addVertex(5);

            g.addEdge(0, 1);
            g.addEdge(0, 2);
            g.addEdge(0, 3);
            g.addEdge(0, 4);
            g.addEdge(1, 2);
            g.addEdge(1, 3);
            g.addEdge(1, 4);
            g.addEdge(2, 3);
            g.addEdge(2, 4);
            g.addEdge(3, 4);
            g.mst();
        }
}
