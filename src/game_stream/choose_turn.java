package game_stream;

import models.game_turn;

import java.util.Objects;
import java.util.Scanner;

public class choose_turn {


    public static void choose_character() {

        game_loop.make_line();
        Scanner scanner = new Scanner(System.in);
        game_turn game_turn = new game_turn();
        game_loop gameLoop = new game_loop();

        while (true) {
            System.out.println("do you want to start first? (y/n)");

            String getInput = scanner.next();
            if (Objects.equals(getInput, "Y")) {
                System.out.println("y");

                game_turn.setUser_starter(true);
                gameLoop.game_start();

            } else if (Objects.equals(getInput, "N")) {
                System.out.println("n");
                game_turn.setUser_starter(false);
                gameLoop.game_start();


            }
        }
    }


}
