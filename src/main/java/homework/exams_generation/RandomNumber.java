package homework.exams_generation;

import java.util.Random;

public class RandomNumber {
    public static double getRandomNumber(ConstraintsExercise c){
            Random random = new Random();
            return c.getMinBond() + c.getMaxBond() * random.nextDouble();
    }
}
