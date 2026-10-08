package Week_10.Block_B;

import java.util.Scanner;

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of bird sightings
        int n = sc.nextInt();

        // Array to count each bird type
        int[] count = new int[6];

        // Read bird types and count them
        for (int i = 0; i < n; i++) {

            int bird = sc.nextInt();

            count[bird]++;
        }

        int max = 0;
        int result = 0;

        // Find the bird with maximum frequency
        for (int i = 1; i <= 5; i++) {

            if (count[i] > max) {

                max = count[i];
                result = i;
            }
        }

        // Print the most frequently sighted bird
        System.out.println(result);

        sc.close();
    }
}