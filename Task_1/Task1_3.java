package Task_1;

public class Task1_3 {

    // Function with return value
    int add(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        // Creating object
        Task1_3 obj = new Task1_3();

        // Calling function and storing returned value
        int result = obj.add(15, 25);

        System.out.println("Result = " + result);
    }
}