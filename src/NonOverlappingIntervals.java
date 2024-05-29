import java.util.*;

public class NonOverlappingIntervals {

    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
       int k = Integer.MIN_VALUE;
       int result = 0;
        for(int i = 0 ; i < intervals.length ; i++){
            if(intervals[i][0] >= k){
                k = intervals[i][1];
            }
            else{
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
