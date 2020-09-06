package homework.exams_generation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Examinator examinator = new Examinator();
        Examinator examinator = new Examinator(0, 10); //мне нужны задания где числа от 0 до 10.
        /*Map<Operator, Integer> count = new HashMap<>(); //мне надо определенное число заданий на какую-то операцию
        Operator[] operators = Operator.values();
        for (Operator operator : operators) {
            count.put(operator, new Random().nextInt(5));
        }
        List<Exercise> exerciseList = examinator.generate(count);*/
        List<Exercise> exerciseList = examinator.generate(10);//рандомное задание
        for (Exercise exercise: exerciseList){
            System.out.println(exercise.getA() + exercise.getOperator().getSign() + exercise.getB());
        }

    }
}
