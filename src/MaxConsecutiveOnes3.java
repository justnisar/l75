import java.util.LinkedList;
import java.util.Queue;

public class MaxConsecutiveOnes3 {


    public int longestOnes(int[] nums, int k) {

        int max = 0;
        int left = 0;
        int right = 0;
        Queue<Integer> queue = new LinkedList<>();

        while(right < nums.length){

            if(nums[right] == 0){
                k--;
                queue.add(right);
            }

            if(k < 0){
                left = queue.remove() + 1;
                k = 0;
            }

            max = Math.max(max, right - left + 1);
            right++;
        }
        queue.clear();
        return max;
    }





    public static void main(String[] args) {
        int[] array = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        MaxConsecutiveOnes3 obj = new MaxConsecutiveOnes3();
        System.out.println(obj.longestOnes(array, 3));
    }

}
