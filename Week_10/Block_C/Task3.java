package Week_10.Block_C;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        Map<Integer, Integer> freq =
                new HashMap<>();

        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

            freq.put(
                    arr[i],
                    freq.getOrDefault(arr[i], 0) + 1
            );
        }

        int k = sc.nextInt();

        PriorityQueue<Integer> pq =
                new PriorityQueue<>(
                        (a, b) ->
                                freq.get(a) - freq.get(b)
                );

        for (int x : freq.keySet()) {

            pq.offer(x);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<Integer> result = new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        Collections.reverse(result);

        for (int x : result) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}