package Task_0;

public class program2 {

    // Function with parameters
    void add(int a, int b) {

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        // Creating object
        program2 obj = new program2();

        // Passing arguments
        obj.add(10, 20);
    }
}