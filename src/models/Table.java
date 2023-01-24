package models;

import java.util.ArrayList;

public class Table {
    public static int[][] border = new int[7][7];

  public void  setborder(int[][] border){
        this.border=border;
    }

 public    int[][]  getborder(){
     return  border;
    }


}
