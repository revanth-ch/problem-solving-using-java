package Week_10.Block_D;

import java.util.*;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Integer> freq = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String tag = sc.next();

            freq.put(tag, freq.getOrDefault(tag, 0) + 1);
        }

        List<String> hashtags = new ArrayList<>(freq.keySet());

        hashtags.sort((a, b) -> {
            int cmp = Integer.compare(freq.get(a), freq.get(b));

            if (cmp != 0) {
                return cmp;
            }

            return a.compareTo(b);
        });

        for (String tag : hashtags) {
            System.out.println(tag + " " + freq.get(tag));
        }

        sc.close();
    }
}