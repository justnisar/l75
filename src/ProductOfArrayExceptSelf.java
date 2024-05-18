public class ProductOfArrayExceptSelf {

    private int recFun(int[] nums, int[] result, int start, int product){

        if(start == nums.length){
            return 1;
        }
        int returnValue = recFun(nums, result, start + 1, product * nums[start]);
        result[start] = returnValue * product;
        returnValue = returnValue * nums[start];
        return returnValue;
    }

    public int[] productExceptSelf(int[] nums) {

        int[] result = new int[nums.length];
        recFun(nums, result, 0, 1);
        return result;

    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        ProductOfArrayExceptSelf obj = new ProductOfArrayExceptSelf();
        System.out.println(obj.productExceptSelf(array));
    }
}
// [24,12,8,6]