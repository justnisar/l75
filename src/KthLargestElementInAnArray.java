import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            queue.add(num);
        }
        int result = 0;
        while(k != 0){
            result = queue.poll();
            k--;
        }
        return result;
    }

    public static void main(String[] args) {
        KthLargestElementInAnArray obj = new KthLargestElementInAnArray();
        int[] array = {3,2,1,5,6,4};
        obj.findKthLargest(array, 2);
    }
}
