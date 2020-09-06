package homework.exams_generation;

import java.util.List;

public interface ExerciseFactory {
    Exercise createExercise();
    Exercise createExercise(Operator operator);
}
