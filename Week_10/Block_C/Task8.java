package Week_10.Block_C;

import java.util.*;

public class Task8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Integer> freq =
                new HashMap<>();

        for (int i = 0; i < n; i++) {

            String word = sc.next();

            freq.put(
                    word,
                    freq.getOrDefault(word, 0) + 1
            );
        }

        int k = sc.nextInt();

        PriorityQueue<String> pq =
                new PriorityQueue<>((a, b) -> {

                    if (!freq.get(a).equals(freq.get(b))) {

                        return Integer.compare(
                                freq.get(a),
                                freq.get(b)
                        );
                    }

                    return b.compareTo(a);
                });

        for (String word : freq.keySet()) {

            pq.offer(word);

            if (pq.size() > k) {
                pq.poll();
            }
        }

        List<String> result =
                new ArrayList<>();

        while (!pq.isEmpty()) {
            result.add(pq.poll());
        }

        Collections.reverse(result);

        for (String word : result) {
            System.out.println(word);
        }

        sc.close();
    }
}