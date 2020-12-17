package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StringTest {

    @Test
    void positiveTest() {
        // given:
        String first = "Neto";
        String second = "logy";

        // when:
        String result = first.concat(second);

        // then:
        Assertions.assertEquals("Netology", result);
    }

    @Test
    void secondTest() {
        // given:
        String first = "Netology";

        // expect:
        Assertions.assertThrows(NullPointerException.class, () -> {
            first.concat(null);
        });
    }



}
