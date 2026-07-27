package Task_1;

import java.util.Scanner;

interface Fibonacci {
    int find(int n);
}

public class program7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        Fibonacci fib = (num) -> {
            if (num == 0) {
                return 0;
            }

            if (num == 1) {
                return 1;
            }

            int a = 0;
            int b = 1;
            int c = 0;

            for (int i = 2; i <= num; i++) {
                c = a + b;
                a = b;
                b = c;
            }

            return c;
        };

        System.out.println("Fibonacci = " + fib.find(n));

        sc.close();
    }
}