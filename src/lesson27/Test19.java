package lesson27;

import java.io.*;

public class Test19 {
    public static void main(String[] args) {
        Animal2 a = new Mouse();
        try {
        a.run();}
        catch (IOException e) {
            System.out.println("Exception poyman");
        }
    }
}

class Animal2 {
    void run() throws IOException {
        System.out.println("Animal runs");
    }
}

class Mouse extends Animal2 {
    void run()  throws FileNotFoundException {
        System.out.println("Mouse runs");
    }
}
