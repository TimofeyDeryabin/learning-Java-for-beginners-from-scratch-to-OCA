package lesson27;

import java.io.*;

public class Test4 {
    void abc() throws FileNotFoundException {
        File f = new File("test8.txt");
//        try {
        FileInputStream fis = new FileInputStream(f);
//            fis.read();
        System.out.println("Vsem xoroshego dnya!");
//        } catch (FileNotFoundException e) {
//            System.out.println("Bil poyman exception " + e);
//        }
    }

    void def() throws FileNotFoundException {
        System.out.println("privet");
//        try {
        abc();
//        } catch (FileNotFoundException e) {
//            System.out.println("Bil poyman exception " + e);
//        }

    }

    public static void main(String[] args) throws FileNotFoundException {
        Test4 t = new Test4();
        try {
        t.def();}
        catch (FileNotFoundException e) {
            System.out.println("Exception poyman");
            IOException f = e;
            System.out.println(e);
//            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
    }
}
