package Task_0;

public class program4 {

    // Function to find square
    int findSquare(int number) {

        return number * number;
    }

    public static void main(String[] args) {

        // Creating object
        program4 obj = new program4();

        // Calling function
        int square = obj.findSquare(5);

        System.out.println("Square = " + square);
    }
}