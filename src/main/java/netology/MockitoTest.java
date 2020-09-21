package netology;

public class MockitoTest {
    String returnHello() {
        return "hello";
    }

    String returnWorld(Boolean asdf) {
        System.out.println(asdf);
        return "world";
    }
}
