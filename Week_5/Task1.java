package Week_5;

public class Task1 {

    public int maxSubArray(int[] nums) {

        int maxSum = nums[0];

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                sum += nums[j];

                maxSum = Math.max(maxSum, sum);
            }
        }

        return maxSum;
    }
}