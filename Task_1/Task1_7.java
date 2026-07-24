package Task_1;

public class Task1_7 {

    // Function to calculate factorial
    int findFactorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {

            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        // Creating object
        Task1_7 obj = new Task1_7();

        // Calling function
        int result = obj.findFactorial(5);

        System.out.println("Factorial = " + result);
    }
}