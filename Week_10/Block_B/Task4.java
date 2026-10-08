package Week_10.Block_B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Number of students
        int n = sc.nextInt();
        sc.nextLine();

        // Store student names and grades
        String[] names = new String[n];
        double[] grades = new double[n];

        // Input student details
        for (int i = 0; i < n; i++) {

            names[i] = sc.nextLine();

            grades[i] = sc.nextDouble();
            sc.nextLine();
        }

        // Find the lowest grade
        double lowest = grades[0];

        for (int i = 0; i < n; i++) {

            if (grades[i] < lowest) {
                lowest = grades[i];
            }
        }

        // Find the second lowest grade
        double secondLowest = Double.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (grades[i] > lowest &&
                    grades[i] < secondLowest) {

                secondLowest = grades[i];
            }
        }

        // Store names with second lowest grade
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            if (grades[i] == secondLowest) {
                result.add(names[i]);
            }
        }

        // Sort names alphabetically
        Collections.sort(result);

        // Print names
        for (String name : result) {
            System.out.println(name);
        }

        sc.close();
    }
}