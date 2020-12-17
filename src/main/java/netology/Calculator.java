package netology;

import java.util.Random;

public class Calculator {
    private Random random;

    public Calculator(int seed) {
        random = new Random(seed);
    }

    public Integer plus(Integer a, Integer b) {
        return a + b;
    }

    public Integer divide(Integer a, Integer b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            throw new IllegalArgumentException("b is 0");
        }
    }

    public Integer random() {
        return random.nextInt();
    }
}
