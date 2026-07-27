package Task_0;

public class program6 {

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
        program6 obj = new program6();

        // Calling function
        int largest = obj.findLargest(30, 45);

        System.out.println("Largest = " + largest);
    }
}