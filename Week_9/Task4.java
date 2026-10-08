package Week_9;

class NegativeNumberException extends Exception {

    NegativeNumberException(String message) {
        super(message);
    }
}

public class Task4 {

    static void checkNumber(int n) throws NegativeNumberException {

        if (n < 0) {
            throw new NegativeNumberException(
                "Negative numbers are not allowed"
            );
        }

        System.out.println("Valid number: " + n);
    }

    public static void main(String[] args) {

        try {
            checkNumber(-5);

        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}