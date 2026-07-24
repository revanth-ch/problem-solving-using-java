package Task_1;

public class Task1_6 {

    // Function to find largest number
    int findLargest(int a, int b) {

        if (a > b) {

            return a;

        } else {

            return b;
        }
    }

    public static void main(String[] args) {

        // Creating object
        Task1_6 obj = new Task1_6();

        // Calling function
        int largest = obj.findLargest(30, 45);

        System.out.println("Largest = " + largest);
    }
}