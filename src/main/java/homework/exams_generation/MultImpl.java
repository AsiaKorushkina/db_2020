package homework.exams_generation;

import lombok.Getter;

@Getter
public class MultImpl extends Exercise {
    private final Operator operator = Operator.MULTIPLY;

    public MultImpl(double a, double b) {
        this.setA(a);
        this.setB(b);
        this.setAnswer(a * b);
    }

    public MultImpl(ConstraintsExercise c){
        double num1 = RandomNumber.getRandomNumber(c);
        double num2 = RandomNumber.getRandomNumber(c);
        this.setA(num1);
        this.setB(num2);
        this.setAnswer(num1 * num2);
    }
}
