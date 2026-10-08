package Week_6;

import java.util.*;

public class Task10 {

    public static List<Integer> circularPalindromes(
            String s) {

        int n = s.length();

        List<Integer> result =
                new ArrayList<>();

        for (int start = 0; start < n; start++) {

            String rotated =
                    s.substring(start) +
                    s.substring(0, start);

            result.add(
                    longestPalindrome(rotated)
            );
        }

        return result;
    }

    private static int longestPalindrome(
            String s) {

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            max = Math.max(
                    max,
                    expand(s, i, i)
            );

            max = Math.max(
                    max,
                    expand(s, i, i + 1)
            );
        }

        return max;
    }

    private static int expand(
            String s,
            int left,
            int right) {

        while (left >= 0 &&
                right < s.length() &&
                s.charAt(left) ==
                s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}