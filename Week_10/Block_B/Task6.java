package Week_10.Block_B;

import java.util.ArrayList;
import java.util.List;

public class Task6 {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {

                // First and last elements are always 1
                if (j == 0 || j == i) {

                    row.add(1);

                } else {

                    // Add the two numbers from previous row
                    int value =
                            triangle.get(i - 1).get(j - 1)
                            + triangle.get(i - 1).get(j);

                    row.add(value);
                }
            }

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {

        int numRows = 5;

        System.out.println(generate(numRows));
    }
}