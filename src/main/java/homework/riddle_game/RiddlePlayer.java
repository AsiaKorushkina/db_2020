package homework.riddle_game;

import design_patterns.template_method.Player;
import lombok.Getter;
import lombok.Setter;

import javax.swing.*;

public class RiddlePlayer implements Player {
    @Getter
    private int ans;

    @Setter
    private double score;

    @Getter
    @Setter
    private double best_score;

    @Override
    public void makeMove() {
        ans = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
    }
}
