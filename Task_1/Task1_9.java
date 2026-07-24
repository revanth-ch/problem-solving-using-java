package Task_1;

public class Task1_9 {

    // Function to check prime number
    boolean isPrime(int number) {

        if (number <= 1) {

            return false;
        }

        for (int i = 2; i < number; i++) {

            if (number % i == 0) {

                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        // Creating object
        Task1_9 obj = new Task1_9();

        // Calling function
        boolean result = obj.isPrime(13);

        if (result) {

            System.out.println("Prime Number");

        } else {

            System.out.println("Not Prime Number");
        }
    }
}