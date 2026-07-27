package Task_0;

public class program3 {

    // Function with return value
    int add(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        // Creating object
        program3 obj = new program3();

        // Calling function and storing returned value
        int result = obj.add(15, 25);

        System.out.println("Result = " + result);
    }
}