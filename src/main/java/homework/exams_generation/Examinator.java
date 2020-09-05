package homework.exams_generation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    private final ExerciseFactoryImpl exerciseFactory = new ExerciseFactoryImpl();
    public List<Exercise> generate(int amount) {
        List<Exercise> exercises = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            exercises.add(exerciseFactory.createExercise());
        }
        return exercises;
    }

    public static void main(String[] args) {
        Examinator examinator = new Examinator();
        List<Exercise> exerciseList = examinator.generate(10);

    }
}
