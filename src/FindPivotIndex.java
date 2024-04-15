import java.util.Arrays;

public class FindPivotIndex {

    public int pivotIndex(int[] nums) {

        int totalSum = Arrays.stream(nums).sum();
        int sumTillNow = 0;
        for(int i = 0 ; i < nums.length ; i++){

            sumTillNow += nums[i];
            int leftSum = sumTillNow - nums[i];
            int rightSum = totalSum - sumTillNow;
            if(leftSum == rightSum){
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        FindPivotIndex obj = new FindPivotIndex();
        int[] array = {1,7,3,6,5,6};
        obj.pivotIndex(array);
    }
}
