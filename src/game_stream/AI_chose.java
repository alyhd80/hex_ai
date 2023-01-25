package game_stream;

import models.Table;

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
        table.changGragh();

        int dijkstra = shortestPath.dijkstra(table.getGraph(), 0, 48);

        //+winning check for every step of this part
        // which has not been written yet ------------------------------------------------------------------
        if (depth == 0){
            return color * dijkstra;
        }

        list = table.listOfMoves(table.getGraph(), color);

        System.out.println(depth);

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
    public int dijkstra(int graph[][], int src, int sink)
    {
        int dist[] = new int[V]; // The output array.
        // dist[i] will hold
        // the shortest distance from src to i

        // sptSet[i] will true if vertex I is included in
        // the shortest path tree or shortest distance from src
        // to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[]
        // as false
        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find the shortest path for all vertices
        for (int count = 0; count < V - 1; count++) {
            // Pick the minimum distance vertex from the set
            // of vertices not yet processed. u is always
            // equal to src in first iteration.
            int u = minDistance(dist, sptSet);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of
            // the picked vertex.
            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in sptSet,
                // there is an edge from u to v, and total
                // weight of path from src to v through u is
                // smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v] != 0
                        && dist[u] != Integer.MAX_VALUE
                        && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }
        // print the constructed distance array
        return 10000 - dist[sink];
    }
}