package game_stream;

import models.Table;

import java.util.Comparator;
import java.util.PriorityQueue;

public class AI_chose {
    ShortestPath shortestPath = new ShortestPath();

    public ShortestPath getShortestPath() {
        return shortestPath;
    }

    int value = Integer.MIN_VALUE;
    int[][] list = new int[7][7];
    int temp = 0;
    public int negamax(int[][] cur_table, int depth, int alpha, int beta, int color){
        Table table = new Table();
        table.setGraph(table.changGragh());

        int dijkstra = shortestPath.dijkstra(table.getGraph(), 0, 48);

        //+winning check for every step of this part
        // which has not been written yet ------------------------------------------------------------------
        if (depth == 0){
            return color * dijkstra;
        }



        list = table.getNewBoard();


        for (int i = 0; i <= table.getborder().length; i++) {
            for (int j = 0; j <= table.getborder().length; j++) {
                System.out.println("alpha:" + alpha);
                System.out.println("beta:" + beta);
                temp = negamax(list, depth - 1, -alpha, -beta, color);
                if (value < -temp) {
                    value = temp;
                }
                if (alpha < value) {
                    alpha = value;
                }
                if (alpha >= beta) {
                    System.out.println("---------------------------------------------------------------");
                    return value;
                }
            }
        }
        return value;
    }


}

// A Java program for Dijkstra's single source the shortest path
// algorithm. The program is for adjacency matrix
// representation of the graph

class Task {
    int dist, row, col;

    public Task(int dist, int row, int col) {
        this.dist = dist;
        this.row = row;
        this.col = col;
    }
}


class TaskComparator implements Comparator<Task> {

    @Override
    public int compare(Task o1, Task o2) {
        return o1.dist - o2.dist;
    }
}

class ShortestPath {

    // A utility function to find the vertex with minimum
    // distance value, from the set of vertices not yet
    // included in the shortest path tree
    static final int V = 49;
    int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }
            //System.out.println(min_index + "\n" + min);
        return min_index;
    }

    // A utility function to print the constructed distance
    // array
    //    void printSolution(int dist[])
    //    {
    //        System.out.println(
    //                "Vertex \t\t Distance from Source");
    //        for (int i = 0; i < V; i++)
    //            System.out.println(i + " \t\t " + dist[i]);
    //    }

    // Function that implements Dijkstra's single source
    // the shortest path algorithm for a graph represented using
    // adjacency matrix representation
    public int dijkstra(int graph[][])
    {
        int dist[][] = new int[V][V]; // The output array.
        // dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex I is included in
        // the shortest path tree or shortest distance from src
        // to i is finalized

        // Initialize all distances as INFINITE and stpSet[]
        // as false
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Task> heap = new PriorityQueue<>(7, new TaskComparator());

        for (int r = 0; r < 7; r++) {
            heap.add(Task())
        }

        while (!heap.isEmpty()) {
            Task task = heap.poll();

            if (dist[task.row][task.col] <= task.dist) {
                continue;
            }

            dist[task.row][task.col] = task.dist;

        }

        // print the constructed distance array
        return 10000 - dist[sink];
    }
}