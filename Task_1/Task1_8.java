package Task_1;

public class Task1_8 {

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
        Task1_8 obj = new Task1_8();

        // Calling function
        int result = obj.reverse(1234);

        System.out.println("Reversed Number = " + result);
    }
}