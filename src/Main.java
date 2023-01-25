import game_stream.choose_turn;
import models.Table;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Table table = new Table();
        int[][] arr = {
                {0, 0, 2, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0},
                {0, 0, 2, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}
        };
        int graph[][]
                = new int[][] {
                { 0, 4, 0, 0, 0, 0, 0, 8, 0},
                { 4, 0, 8, 0, 0, 0, 0, 11, 0},
                { 0, 8, 0, 7, 0, 4, 0, 0, 2},
                { 0, 0, 7, 0, 9, 14, 0, 0, 0},
                { 0, 0, 0, 9, 0, 10, 0, 0, 0},
                { 0, 0, 4, 14, 10, 0, 2, 0, 0},
                { 0, 0, 0, 0, 0, 2, 0, 1, 6},
                { 8, 11, 0, 0, 0, 0, 1, 0, 7},
                { 0, 0, 2, 0, 0, 0, 6, 7, 0}
        };
        table.setborder(arr);

        choose_turn choose_turn=new choose_turn();
        game_stream.choose_turn.choose_character();






//

//        System.out.println("  1 2 3 4 5 6 7");
//        for (int i = 0; i < table.border.length; i++) {
//            int counter = i;
//
//            for (; counter > 0; counter--) {
//                System.out.print(" ");
//            }
//            System.out.print((i + 1) + " ");
//            for (int j = 0; j < table.border[i].length; j++) {
//                System.out.print(table.border[i][j] + " ");
//            }
//            System.out.println();


        }

    }
