package models;

import java.util.ArrayList;

public class Table {
    public static int[][] border = new int[7][7];
    public static int[][] graph = new int[7][7];

    public void setborder(int[][] border) {
        this.border = border;
    }

    public int[][] getborder() {
        return border;
    }

    public static int[][] listOfMoves(int[][] newtable, int color) {
        int[][] list = new int[7][7];
        for (int i = 0; i < Table.border.length; i++) {
            for (int j = 0; j < Table.border[i].length; j++) {
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
        int[][] temparray;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                graph[i][j] = 1000;
            }
        }

        test:
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (border[i][j] == 1) {

                } else {
                    if (border[i][j] == 2) {
                        graph[i][j] = 0;
                    } else {
                        graph[i][j] = 1;
                    }
                }
                if (i == 6) {
                    graph[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (border[i][j] == 2) {

                } else if (i > 0 && j > 0) {
                    temparray = checkAroundArr(i, j);
                    for (int k = 0; k < 7; k++) {
                        if (temparray[0][k] == border[i - 1][j - 1] && temparray[1][k] == border[i][j + 1]) {
                            if (border[i - 1][j - 1] == 2) {
                                graph[i - 1][j - 1] = 0;
                            }
                            if (border[i-1][j-1] == 0) {

                            }
                        }
                    }
                    }
                }
            }

            return graph;
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


