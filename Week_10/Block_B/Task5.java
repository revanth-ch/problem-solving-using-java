package Week_10.Block_B;

import java.util.ArrayList;
import java.util.Scanner;

public class Task5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read number of lines
        int n = sc.nextInt();

        // Nested ArrayList
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // Read integers for each line
        for (int i = 0; i < n; i++) {

            int d = sc.nextInt();

            ArrayList<Integer> row = new ArrayList<>();

            for (int j = 0; j < d; j++) {
                row.add(sc.nextInt());
            }

            list.add(row);
        }

        // Number of queries
        int q = sc.nextInt();

        // Process queries
        for (int i = 0; i < q; i++) {

            int x = sc.nextInt();
            int y = sc.nextInt();

            // Convert 1-based position to 0-based index
            x--;
            y--;

            // Check whether position exists
            if (x < list.size() &&
                    y < list.get(x).size()) {

                System.out.println(list.get(x).get(y));

            } else {

                System.out.println("ERROR!");
            }
        }

        sc.close();
    }
}