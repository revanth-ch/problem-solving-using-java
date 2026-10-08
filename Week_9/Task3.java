package Week_9;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");

            int n = sc.nextInt();

            System.out.println("Number = " + n);

        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter an integer.");
        }

        sc.close();
    }
}