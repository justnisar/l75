public class LongestSubarrayOf1sAfterDeletingOneElement {

    public int longestSubarray(int[] nums) {

        int max = 0;
        int start = 0;
        int end = 0;
        int zeroCount = 1;
        int count = 0;
        while(end < nums.length){

            if(nums[end] == 0){
                zeroCount--;
                if(zeroCount < 0){

                }
            }
            else{
                count++;
                if(count > max){
                    max = count;
                }
            }
            end++;
        }

        return max;
    }
}
