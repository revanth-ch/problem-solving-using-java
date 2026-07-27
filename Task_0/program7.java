package Task_0;

public class program7 {

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
        program7 obj = new program7();

        // Calling function
        int result = obj.findFactorial(5);

        System.out.println("Factorial = " + result);
    }
}