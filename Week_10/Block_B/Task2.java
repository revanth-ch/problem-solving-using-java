package Week_10.Block_B;

public class Task2 {

    public static int firstUniqChar(String s) {

        // Array to store character frequency
        int[] count = new int[26];

        // Count each character
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        // Find the first character with frequency 1
        for (int i = 0; i < s.length(); i++) {

            if (count[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }

        // No non-repeating character found
        return -1;
    }

    public static void main(String[] args) {

        String s = "loveleetcode";

        int result = firstUniqChar(s);

        System.out.println(result);
    }
}