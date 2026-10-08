package Week_10.Block_A;

import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Add marks dynamically
        for (int i = 0; i < n; i++) {

            System.out.print(
                    "Enter marks of student " + (i + 1) + ": "
            );

            int mark = sc.nextInt();
            marks.add(mark);
        }

        // Display marks
        System.out.println("\nStudent Marks:");

        for (int mark : marks) {
            System.out.println(mark);
        }

        // Calculate total and highest mark
        int total = 0;
        int highest = marks.get(0);

        for (int mark : marks) {

            total += mark;

            if (mark > highest) {
                highest = mark;
            }
        }

        double average = (double) total / marks.size();

        System.out.println("\nTotal Marks = " + total);
        System.out.println("Average Marks = " + average);
        System.out.println("Highest Mark = " + highest);

        sc.close();
    }
}