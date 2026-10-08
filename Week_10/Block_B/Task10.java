package Week_10.Block_B;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // Number of junctions
        int m = sc.nextInt(); // Number of roads

        // Create graph
        ArrayList<ArrayList<Integer>> graph =
                new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add roads
        for (int i = 0; i < m; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // Source and destination
        int source = sc.nextInt();
        int destination = sc.nextInt();

        // BFS
        boolean[] visited = new boolean[n + 1];

        Queue<Integer> queue = new LinkedList<>();

        queue.add(source);
        visited[source] = true;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            for (int next : graph.get(current)) {

                if (!visited[next]) {

                    visited[next] = true;

                    queue.add(next);
                }
            }
        }

        // Check destination
        if (visited[destination]) {

            System.out.println("YES");

        } else {

            System.out.println("NO");
        }

        sc.close();
    }
}