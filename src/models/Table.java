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

    public int[][] getGraph() {return graph;}

    public void setGraph(int[][] graph) {Table.graph = graph;}
}
