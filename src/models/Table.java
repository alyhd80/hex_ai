package models;

import java.util.ArrayList;

public class Table {
    public static int[][] border = new int[7][7];
    public static int[][] graph = new int[9][9];

    public void  setborder(int[][] border){
        this.border=border;
    }

    public    int[][]  getborder(){
     return  border;
    }

    public static int[][] listOfMoves(){
        int[][] list = new int[7][7];
        for (int i = 0; i < Table.border.length; i++){
            for (int j = 0; j < Table.border[i].length; j++){
                if (Table.border[i][j] != 'R' || Table.border[i][j] != 'B'){
                    list[i][j] = Table.border[i][j];
                }else {
                    list[i][j] = -1;
                }
            }
        }
        return list;
    }

    public int[][] getGraph() {return graph;}

    public void setGraph(int[][] graph) {Table.graph = graph;}
}
