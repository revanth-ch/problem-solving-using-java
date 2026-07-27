package Task_0;

public class program5 {

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
        program5 obj = new program5();

        // Calling function
        obj.checkEvenOdd(7);
    }
}