package game_stream;

import models.Table;
import models.game_turn;

import java.util.Scanner;

public class game_loop {


    public  void game_start() {


        while (true) {

        showBorder();
        AI_chose ai_chose = new AI_chose();
        Table table = new Table();
        ai_chose.getShortestPath().dijkstra(table.getGraph(), 0);
        }
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
                        System.out.print("C" + " ");

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
