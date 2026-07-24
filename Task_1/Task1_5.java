package Task_1;

public class Task1_5 {

    // Function to check even or odd
    void checkEvenOdd(int number) {

        if (number % 2 == 0) {

            System.out.println(number + " is Even");

        } else {

            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        // Creating object
        Task1_5 obj = new Task1_5();

        // Calling function
        obj.checkEvenOdd(7);
    }
}