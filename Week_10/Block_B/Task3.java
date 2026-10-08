package Week_10.Block_B;

public class Task3 {

    public static int findShortestSubArray(int[] nums) {

        // Maximum value is 49999
        int[] count = new int[50000];
        int[] first = new int[50000];
        int[] last = new int[50000];

        // Initialize first occurrence array
        for (int i = 0; i < 50000; i++) {
            first[i] = -1;
        }

        int degree = 0;

        // Find frequency, first position and last position
        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (first[num] == -1) {
                first[num] = i;
            }

            last[num] = i;
            count[num]++;

            // Find maximum frequency
            if (count[num] > degree) {
                degree = count[num];
            }
        }

        int minLength = nums.length;

        // Find the shortest subarray
        for (int i = 0; i < 50000; i++) {

            if (count[i] == degree) {

                int length = last[i] - first[i] + 1;

                if (length < minLength) {
                    minLength = length;
                }
            }
        }

        return minLength;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 2, 3, 1};

        System.out.println(findShortestSubArray(nums));
    }
}