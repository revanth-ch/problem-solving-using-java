package Week_10.Block_C;

import java.util.*;

public class Task6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt();

        Map<Integer, Integer> freq =
                new HashMap<>();

        // First window
        for (int i = 0; i < k; i++) {

            freq.put(
                    arr[i],
                    freq.getOrDefault(arr[i], 0) + 1
            );
        }

        int maxDistinct = freq.size();

        // Slide the window
        for (int i = k; i < n; i++) {

            int outgoing = arr[i - k];

            freq.put(
                    outgoing,
                    freq.get(outgoing) - 1
            );

            if (freq.get(outgoing) == 0) {
                freq.remove(outgoing);
            }

            int incoming = arr[i];

            freq.put(
                    incoming,
                    freq.getOrDefault(incoming, 0) + 1
            );

            maxDistinct =
                    Math.max(
                            maxDistinct,
                            freq.size()
                    );
        }

        System.out.println(maxDistinct);

        sc.close();
    }
}