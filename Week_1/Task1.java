package Week_1;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        while (n-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();

            if (x == 1) {
                System.out.println(y % 2 == 0 ? "EVEN" : "ODD");

            } else if (x == 2) {
                boolean prime = y > 1;

                for (int i = 2; i * i <= y; i++) {
                    if (y % i == 0) {
                        prime = false;
                        break;
                    }
                }

                System.out.println(prime ? "PRIME" : "COMPOSITE");

            } else if (x == 3) {
                System.out.println(isPalindrome(y) ? "PALINDROME" : "NOT PALINDROME");
            }
        }
    }

    static boolean isPalindrome(int n) {
        int original = n;
        int reverse = 0;

        while (n > 0) {
            reverse = reverse * 10 + n % 10;
            n /= 10;
        }

        return original == reverse;
    }
}