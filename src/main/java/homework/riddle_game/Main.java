package homework.riddle_game;


import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        RiddlePlayer player = new RiddlePlayer();
        boolean wantToPlay = true;
        while (wantToPlay){
            RiddleGame game = new RiddleGame(100, player);
            game.play();
            int s = Integer.parseInt(JOptionPane.showInputDialog("Press 1 if you want to continue playing the game"));
            if (s != 1){
                wantToPlay = false;
            }
        }
        System.out.println("My best score is " + player.getBest_score());


    }
}
