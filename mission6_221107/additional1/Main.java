package mission6_221107.additional1;

import mission6_221107.additional1.wordrelay.*;
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        // Timer 카운트다운

        // Game GaeeBuilder
        // Rule iterface > WordRelay impl


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(TextContent.SET_PLAYER_NUMBERS);

        Game game = new GameBuilder()
                .numberOfPlayers(br.readLine())
                .playerList(new ArrayList<>())
                .build();

        for (int i = 0; i < game.getNumberOfPlayers(); i++) {
            System.out.print(TextContent.SET_PLAYER_NAME);
            game.addPlayer(br.readLine());
        }
        Rule rule = new Rule();
        System.out.print(game.getPlayerList().get(0)+" >>");
        rule.next(br.readLine());
        System.out.print(game.getPlayerList().get(1)+" >>");
        rule.next(br.readLine());

//        TimeCounter tc = new TimeCounter();
//        tc.countDown();




    }
}
