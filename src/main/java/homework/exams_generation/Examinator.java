package homework.exams_generation;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    private ExerciseFactoryImpl exerciseFactory;
    private ConstraintsExercise constraintsExercise;

    public Examinator(){
        exerciseFactory = new ExerciseFactoryImpl();
    }
    
    public Examinator(double minBond, double maxBond){
        constraintsExercise = new ConstraintsExercise(minBond, maxBond);
        exerciseFactory = new ExerciseFactoryImpl(constraintsExercise);
    }
    public List<Exercise> generate(int amount) {
        List<Exercise> exercises = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            exercises.add(exerciseFactory.createExercise());
        }
        return exercises;
    }

    public static void main(String[] args) {
        //Examinator examinator = new Examinator();
        Examinator examinator = new Examinator(0, 10); //мне нужны задания где числа от 0 до 10.
        List<Exercise> exerciseList = examinator.generate(10);

    }
}
