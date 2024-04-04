public class MaximumAverageSubarray1 {

    public double findMaxAverage(int[] nums, int k) {

        // Compute a sum array
        int[] sumArray = new int[nums.length + 1];
        int sum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
            sumArray[i+1] = sum;
        }

        double maxAvg = -10000;

        for(int i = k; i < sumArray.length ; i++){
            double currentAvg = (double)(sumArray[i] - sumArray[i-k])/k;
            if(currentAvg > maxAvg){
                maxAvg = currentAvg;
            }
        }

        return maxAvg;
    }

}


/*
Example 1:

Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
Example 2:

Input: nums = [5], k = 1
Output: 5.00000
 */