package game_stream;

import models.Table;
import models.game_turn;

import java.util.Scanner;

public class game_loop {


    public  void game_start() {

        AI_chose ai_chose = new AI_chose();
        Table table = new Table();
        //int min = Integer.MIN_VALUE;
        //int max = Integer.MAX_VALUE;
        int min = -10000;
        int max = 10000;
        int[][] array = new int[7][7];

        int iholder = 1;
        int jholder = 1;

        while (true) {

            int hex = -10000;
            showBorder();

            for (int i = 0;i < table.getborder().length; i++){
                for (int j = 0; j < table.getborder().length; j++) {
                    array[i][j] = ai_chose.negamax(table.getGraph(), 1, min, max, 2);
                    if (hex < array[i][j]){
                        hex = array[i][j];
                        iholder = i;
                        jholder = j;
                    }
                }
            }
            table.border[iholder][jholder] = 2;
        }
    }

    public static int findMax(int[][] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (max > array[i][j]){
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static void showBorder() {
        Scanner scanner = new Scanner(System.in);
        Table table = new Table();

        while (true) {
            make_line();
            System.out.println("  1 2 3 4 5 6 7");
            for (int i = 0; i < table.border.length; i++) {
                int counter = i;

                for (; counter > 0; counter--) {
                    System.out.print(" ");
                }
                System.out.print((i + 1) + " ");
                for (int j = 0; j < table.border[i].length; j++) {
                    if (table.border[i][j] == 1) {
                        System.out.print("R" + " ");

                    } else if (table.border[i][j] == 2) {
                        System.out.print("B" + " ");

                    } else {
                        System.out.print(table.border[i][j] + " ");
                    }
                }
                System.out.println();
            }


            System.out.println("which row?");
            int row = scanner.nextInt();
            System.out.println("which column?");
            int column = scanner.nextInt();

            if (table.border[row - 1][column - 1] == 0) {
                table.border[row - 1][column - 1] = 1;
                break;
            }
        }
    }
        public static void make_line() {
            for (int i = 0; i < 20; i++)
                System.out.println();
        }
}
