package models;

import java.util.ArrayList;

public class Table {
    public static int[][] border = new int[7][7];
    public static int[][] graph = new int[49][49];

    public void setborder(int[][] border) {
        this.border = border;
    }

    public int[][] getborder() {
        return border;
    }

    public static int[][] listOfMoves(int[][] newtable, int color) {
        int[][] list = new int[49][49];
        for (int i = 0; i < Table.graph.length; i++) {
            for (int j = 0; j < Table.graph[i].length; j++) {
                if (color == 2) {
                    list[i][j] = newtable[i][j];
                } else {
                    list[i][j] = -1;
                }
            }
        }
        return list;
    }

    public int[][] getGraph() {
        return graph;
    }

    public void setGraph(int[][] graph) {
        Table.graph = graph;
    }

    public int[][] changGragh() {
        for (int i = 0; i < 49; i++) {
            for (int j = 0; j < 49; j++) {
                graph[i][j] = 1000;
            }
        }
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                for (int[] neighbor :
                        checkAroundArr(i, j)) {
                    int ni = neighbor[0], nj = neighbor[1];
                    if (checkBounds(i ,j, ni, nj)){
                        if (border[i][j] == 1){
                            continue;
                        } else if (border[i][j] == 2) {
                            graph[i*7+j][ni*7+nj] = 0;
                        } else {
                            graph[i*7+j][ni*7+nj] = 1;
                        }
                    }
                }
            }
        }
        return graph;
    }

    private boolean checkBounds(int i, int j, int ni, int nj) {
        if (i < 7 && j < 7 &&i > 0 && j > 0){
            if ((i + 1)< 7 && (j + 1) < 7){
                if ((i + 1) < 7 && (j + 1) < 7){
                    if (ni * 7 + nj >= 0 && ni * 7 + nj < 49){
                        return true;
                    }
                    else return false;
                }
                else return false;
            }
            else return false;
        }
        else return false;
    }

    private static int[][] checkAroundArr(int i, int j){
            int[][] arr = {{i - 1, j + 1},
                    {i, j + 1},
                    {i + 1, j},
                    {i + 1, j - 1},
                    {i, j - 1},
                    {i - 1, j},
            };

            return arr;

        }

}


