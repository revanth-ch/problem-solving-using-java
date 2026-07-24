package Task_1;

public class Task1_2 {

    // Function with parameters
    void add(int a, int b) {

        int sum = a + b;

        System.out.println("Sum = " + sum);
    }

    public static void main(String[] args) {

        // Creating object
        Task1_2 obj = new Task1_2();

        // Passing arguments
        obj.add(10, 20);
    }
}