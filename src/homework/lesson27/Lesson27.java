package homework.lesson27;

public class Lesson27 {
    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        tiger.eat("myaso");
        try {
            tiger.drink("voda");
            try {
                tiger.drink("pivo");
            } catch (NeVodaException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("Eto inner finally block");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class NeMyasoException extends RuntimeException {
    NeMyasoException(String message) {
        super(message);
    }
}

class NeVodaException extends Exception {
    NeVodaException(String message) {
        super(message);
    }
}

class Tiger {

    void eat(String meal) {
        if (meal != "myaso") {
            throw new NeMyasoException("Tigr ne est " + meal);
        } else {
            System.out.println("Tigr est myaso");
        }
    }

    void drink(String drink) throws NeVodaException {
        if (drink != "voda") {
            throw new NeVodaException("Tigr ne pyet " + drink);
        } else {
            System.out.println("Tigr pyet vodu");
        }
    }

}
