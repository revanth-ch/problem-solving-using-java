package Task_0;

public class program8 {

    // Function to reverse a number
    int reverse(int number) {

        int reverse = 0;

        while (number != 0) {

            int digit = number % 10;

            reverse = reverse * 10 + digit;

            number = number / 10;
        }

        return reverse;
    }

    public static void main(String[] args) {

        // Creating object
        program8 obj = new program8();

        // Calling function
        int result = obj.reverse(1234);

        System.out.println("Reversed Number = " + result);
    }
}