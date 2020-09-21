package netology;

import java.io.File;
import java.io.IOException;

public class NetologyDemo {
    public void prepare() {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void delete() {
        File gamesDir = new File("filename.txt");
        gamesDir.delete();
    }
}
