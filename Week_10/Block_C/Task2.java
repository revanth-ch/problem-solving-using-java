package Week_10.Block_C;

import java.util.*;

public class Task2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Integer> frequency =
                new HashMap<>();

        for (int i = 0; i < n; i++) {

            String s = sc.next();

            frequency.put(
                    s,
                    frequency.getOrDefault(s, 0) + 1
            );
        }

        int q = sc.nextInt();

        while (q-- > 0) {

            String query = sc.next();

            System.out.println(
                    frequency.getOrDefault(query, 0)
            );
        }

        sc.close();
    }
}