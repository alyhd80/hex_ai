package game_stream;

import models.Table;
import models.game_turn;

import java.util.Scanner;

public class game_loop {


    public static void game_start() {


        while (true) {
            Scanner scanner = new Scanner(System.in);

            int column = scanner.nextInt();
            int row = scanner.nextInt();


        }


    }

    public static void showBorder() {

        Table table = new Table();

        System.out.println("  1 2 3 4 5 6 7");
        for (int i = 0; i < table.border.length; i++) {
            int counter = i;

            for (; counter > 0; counter--) {
                System.out.print(" ");
            }
            System.out.print((i + 1) + " ");
            for (int j = 0; j < table.border[i].length; j++) {
                System.out.print(table.border[i][j] + " ");
            }
            System.out.println();
        }

    }
}
