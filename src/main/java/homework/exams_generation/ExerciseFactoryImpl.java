package homework.exams_generation;

import homework.never_use_switch.MailSender;
import lombok.SneakyThrows;
import org.reflections.Reflections;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ExerciseFactoryImpl implements ExerciseFactory {

    private Map<Operator, Exercise> exerciseMap = new HashMap<>();

    @SneakyThrows
    public ExerciseFactoryImpl() {
        Random random = new Random();

        Reflections scanner = new Reflections("homework.exams_generation");
        Set<Class<? extends Exercise>> classes = scanner.getSubTypesOf(Exercise.class);
        for (Class<? extends Exercise> aClass : classes) {
            Exercise exercise = aClass.getDeclaredConstructor(double.class, double.class).newInstance(random.nextDouble(), random.nextDouble());
            exerciseMap.put(exercise.getOperator(), exercise);
        }
    }
    @Override
    public Exercise createExercise() {
        Random random = new Random();
        Operator[] operator = Operator.values();
        return exerciseMap.get(operator[random.nextInt(operator.length)]);
    }
}
