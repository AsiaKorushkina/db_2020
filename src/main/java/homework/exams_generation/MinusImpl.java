package homework.exams_generation;

public class MinusImpl extends Exercise {
    public MinusImpl(double a, double b)
    {
        this.setA(a);
        this.setB(b);
        this.setAnswer(a - b);
        this.setOperator(Operator.MINUS);
    }
}
