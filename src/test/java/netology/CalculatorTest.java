package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;

    @BeforeEach
    void before() {
        calculator = new Calculator(5);
    }

    @Test
    void plus() {
        // given:
        int a = 2;
        int b = 3;

        // when:
        Integer sum = calculator.plus(a, b);

        // then:
        assertEquals(5, sum);
    }

    @Test
    void divide() {
        // given:
        int a = 2;
        int b = 0;

        // expect:
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(a, b);
        });
    }

    @Test
    void random22() {
        // when:
        Integer random = calculator.random();

        // then:
        assertEquals(-1157408321, random);
    }

    @Test
    void random33() {
        // when:
        Integer random = calculator.random();

        // then:
        assertEquals(-1157408321, random);
    }
}
