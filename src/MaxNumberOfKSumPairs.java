import java.util.HashMap;
import java.util.Map;

public class MaxNumberOfKSumPairs {

    public int maxOperations(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        for(int current : nums){

            if(map.getOrDefault(k - current,0) > 0){
                map.put(k - current, map.get(k - current) - 1);
                result++;
            }
            else{
                map.put(current, 1 + map.getOrDefault(current,0));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4};
        // [3,1,3,4,3]
        MaxNumberOfKSumPairs obj = new MaxNumberOfKSumPairs();
        obj.maxOperations(array, 5);

    }
}
