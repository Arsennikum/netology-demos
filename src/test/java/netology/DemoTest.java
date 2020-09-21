package netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.AssertionsKt;

import java.io.File;

public class DemoTest {


    @org.junit.jupiter.api.Test
    public void test() {
        new NetologyDemo().prepare();

        File file = new File("filename.txt");
        Assertions.assertTrue(file.exists());
    }

    @org.junit.jupiter.api.Test
    public void testDelete() {
        File file = new File("filename.txt");
        Assertions.assertTrue(file.exists());

        new NetologyDemo().delete();

        Assertions.assertFalse(file.exists());
    }

}
