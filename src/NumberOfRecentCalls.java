import java.util.PriorityQueue;
import java.util.Queue;

public class NumberOfRecentCalls {

    private Queue<Integer> queue;
    public NumberOfRecentCalls() {
        queue = new PriorityQueue<>();
    }

    public int ping(int t) {
        queue.add(t);
        while(!queue.isEmpty()){
            int element = queue.peek();
            if(!(element >= t-3000 && element <= t)){
                queue.poll();
            }
            else{
                break;
            }
        }
        return queue.size();
    }
}
