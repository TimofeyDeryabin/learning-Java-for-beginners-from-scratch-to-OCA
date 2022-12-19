package lesson27;

public class Test15 {
    void marathon(int temperaturaVozduxa, int tempBega) throws PodvernutNoguException {
        if (tempBega > 12) {
            throw new PodvernutNoguException("Temp bega bil slishkom visokim: " + tempBega);
        }
        if (temperaturaVozduxa > 32) {
            throw new SveloMishcuException();
        }
        System.out.println("Vi probejaly marathon");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
        t.marathon(20, 13);}
        catch (PodvernutNoguException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("V lubom sluchaye vi poluchite gramotu!!!");
        }
    }
}

class PodvernutNoguException extends Exception {
    PodvernutNoguException(String message) {
        super(message);
    }

    PodvernutNoguException() {

    }
}

class SveloMishcuException extends RuntimeException {
    SveloMishcuException(String message) {
        super(message);
    }

    SveloMishcuException() {

    }
}