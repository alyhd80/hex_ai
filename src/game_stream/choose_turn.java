package game_stream;

import models.game_turn;

import java.util.Objects;
import java.util.Scanner;

public class choose_turn {


   public static void choose_character(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("do you want to start first? (y/n)");
        String getInput = scanner.next();
       game_turn game_turn=new  game_turn();


        if (Objects.equals(getInput, "Y")) {
            System.out.println("y");

            game_turn.setUser_starter(true);


        } else if (Objects.equals(getInput, "N")) {
            System.out.println("n");
            game_turn.setUser_starter(false);

        }
    }
}
