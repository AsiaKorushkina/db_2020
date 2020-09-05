package homework.exams_generation;

public class MultImpl extends Exercise {
    MultImpl(double a, double b) {
        this.setA(a);
        this.setB(b);
        this.setAnswer(a * b);
        this.setOperator(Operator.MULTIPLY);
    }
}
