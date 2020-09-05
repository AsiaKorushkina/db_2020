package homework.exams_generation;

public class DivideImpl extends Exercise {
    public DivideImpl(double a, double b) {
        this.setA(a);
        this.setB(b);
        this.setAnswer(a / b);
        this.setOperator(Operator.DIVIDE);
    }
}
