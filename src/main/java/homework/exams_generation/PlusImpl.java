package homework.exams_generation;

import lombok.Getter;

@Getter
public class PlusImpl extends Exercise {
    private final Operator operator = Operator.PLUS;
    public PlusImpl(double a, double b)
    {
        this.setA(a);
        this.setB(b);
        this.setAnswer(a + b);
    }

    public PlusImpl(ConstraintsExercise c){
        double num1 = RandomNumber.getRandomNumber(c);
        double num2 = RandomNumber.getRandomNumber(c);
        this.setA(num1);
        this.setB(num2);
        this.setAnswer(num1 + num2);

    }

}
