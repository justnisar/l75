public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int nonZeroIndex = 0;
        for(int number : nums){
            if(number != 0){
                nums[nonZeroIndex] = number;
                nonZeroIndex++;
            }
        }

        for(int i = nonZeroIndex ; i < nums.length ;i++){
            nums[i] = 0;
        }
    }
}

