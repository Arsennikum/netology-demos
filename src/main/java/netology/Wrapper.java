package netology;

import java.util.Random;

public class Wrapper {
    private final MockitoTest obj;

    public Wrapper(MockitoTest obj) {
        this.obj = obj;
    }

    public void testMethod() {
        System.out.println(obj.returnHello());
        System.out.println(obj.returnHello());
        System.out.println(obj.returnHello());

        boolean b = true; //new Random().nextBoolean();
        obj.returnWorld(b);
    }
}
