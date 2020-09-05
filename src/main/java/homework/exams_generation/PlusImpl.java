package homework.exams_generation;

public class PlusImpl extends Exercise {

    public PlusImpl(double a, double b)
    {
        this.setA(a);
        this.setB(b);
        this.setAnswer(a + b);
        this.setOperator(Operator.PLUS);
    }
}
