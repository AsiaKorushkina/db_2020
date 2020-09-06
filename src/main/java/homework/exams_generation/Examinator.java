package homework.exams_generation;

import java.util.*;

/**
 * @author Evgeny Borisov
 */
public class Examinator {
    private ExerciseFactoryImpl exerciseFactory;

    public Examinator(){
        exerciseFactory = new ExerciseFactoryImpl();
    }
    
    public Examinator(double minBond, double maxBond){
        ConstraintsExercise constraintsExercise = new ConstraintsExercise(minBond, maxBond);
        exerciseFactory = new ExerciseFactoryImpl(constraintsExercise);
    }

    public List<Exercise> generate(int amount) {
        List<Exercise> exercises = new ArrayList<>();
        for (int i = 0; i < amount; i++){
            exercises.add(exerciseFactory.createExercise());
        }
        return exercises;
    }

    public List<Exercise> generate(Map<Operator, Integer> count){
        List<Exercise> exercises = new ArrayList<>();
        for (Operator o: count.keySet()){
            gen(exercises, o, count.get(o));
        }

        return exercises;
    }

    private void gen(List<Exercise> exercises, Operator operator, int count){
        for (int i = 0; i < count; i++){
            exercises.add(exerciseFactory.createExercise(operator));
        }
    }

}
