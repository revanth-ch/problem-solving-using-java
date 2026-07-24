package Task_1;

public class Task1_4 {

    // Function to find square
    int findSquare(int number) {

        return number * number;
    }

    public static void main(String[] args) {

        // Creating object
        Task1_4 obj = new Task1_4();

        // Calling function
        int square = obj.findSquare(5);

        System.out.println("Square = " + square);
    }
}