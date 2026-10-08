package Week_4;

public class Task1_1 {

    public boolean halvesAreAlike(String s) {

        int mid = s.length() / 2;

        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < mid; i++) {
            if (isVowel(s.charAt(i))) {
                count1++;
            }
        }

        for (int i = mid; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) {
                count2++;
            }
        }

        return count1 == count2;
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}