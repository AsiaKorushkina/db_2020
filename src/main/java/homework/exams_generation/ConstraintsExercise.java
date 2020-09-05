package homework.exams_generation;

import lombok.Getter;

@Getter
public class ConstraintsExercise {
    private double maxBond = 1.0;
    private double minBond = 0.0;

    public ConstraintsExercise(){}
    public ConstraintsExercise(double minBond, double maxBond){
        this.maxBond = maxBond;
        this.minBond = minBond;
    }
}
