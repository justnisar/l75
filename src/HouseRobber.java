public class HouseRobber {

    public int rob(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }
        if(nums.length == 2){
            return Math.max(nums[0], nums[1]);
        }
        int[] array = new int[nums.length];
        array[0] = nums[0];
        array[1] = Math.max(nums[0], nums[1]);
        for(int i = 2 ; i < nums.length ; i++){
            array[i] = Math.max(nums[i] + array[i-2], array[i-1]);
        }
        return array[nums.length - 1];
    }

}
