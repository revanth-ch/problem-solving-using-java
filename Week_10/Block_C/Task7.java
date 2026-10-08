package Week_10.Block_C;

import java.util.*;

public class Task7 {

    static boolean routeExists(
            Map<Integer, List<Integer>> graph,
            int source,
            int destination) {

        Queue<Integer> queue =
                new LinkedList<>();

        Set<Integer> visited =
                new HashSet<>();

        queue.offer(source);

        visited.add(source);

        while (!queue.isEmpty()) {

            int current = queue.poll();

            if (current == destination) {
                return true;
            }

            for (int next :
                    graph.getOrDefault(
                            current,
                            new ArrayList<>())) {

                if (!visited.contains(next)) {

                    visited.add(next);

                    queue.offer(next);
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> graph =
                new HashMap<>();

        for (int i = 1; i <= n; i++) {

            graph.put(
                    i,
                    new ArrayList<>()
            );
        }

        for (int i = 0; i < m; i++) {

            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        int source = sc.nextInt();
        int destination = sc.nextInt();

        System.out.println(
                routeExists(
                        graph,
                        source,
                        destination
                )
                        ? "YES"
                        : "NO"
        );

        sc.close();
    }
}