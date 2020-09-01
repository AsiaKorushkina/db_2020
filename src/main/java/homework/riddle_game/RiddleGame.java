package homework.riddle_game;

import design_patterns.template_method.Game;
import design_patterns.template_method.Pair;

import javax.swing.*;
import java.util.List;
import java.util.Random;

/**
 * @author Evgeny Borisov
 */
public class RiddleGame implements Game {

    //todo
    private final int maxLimit;
    private final RiddlePlayer player;
    private final int num;
    private int attempts;

    public RiddleGame(int max, RiddlePlayer player) {
        Random random = new Random();
        maxLimit = max;
        num = random.nextInt(max);
        this.player = player;
    }



    @Override
    public void play() {
        boolean endOfGame = false;
        while (!endOfGame || attempts > maxLimit) {
            player.makeMove();
            attempts++;
            int ans = player.getAns();
            if (ans == num){
                double score = calculatedScore();
                player.setScore(score);
                if (score > player.getBest_score()) {
                    player.setBest_score(score);
                }
                endOfGame = true;
            }
            else {
                if (ans < num){
                    System.out.println(ans + " is less than what the computer guessed. Try again!");
                }
                else {
                    System.out.println(ans + " is larger than what the computer guessed. Try again!");
                }
            }
        }

    }

    private double calculatedScore() {
        double MAX_SCORE = 100.0;
        return MAX_SCORE / attempts;
    }
}
