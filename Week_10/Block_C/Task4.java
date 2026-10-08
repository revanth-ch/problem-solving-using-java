package Week_10.Block_C;

import java.util.*;

public class Task4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, List<String>> groups =
                new HashMap<>();

        for (int i = 0; i < n; i++) {

            String word = sc.next();

            char[] chars = word.toCharArray();

            Arrays.sort(chars);

            String key = new String(chars);

            groups
                .computeIfAbsent(
                        key,
                        k -> new ArrayList<>()
                )
                .add(word);
        }

        for (List<String> group : groups.values()) {

            System.out.println(group);
        }

        sc.close();
    }
}