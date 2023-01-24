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
        int[][] arr = {{0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 8, 0, 0, 0, 0},
                {0, 5, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0}};
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
