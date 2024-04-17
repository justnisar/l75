public class MinCostClimbingStairs {

    public int minCostClimbingStairs(int[] cost) {

        int[] array = new int[cost.length + 1];
        array[0] = 0;
        array[1] = 0;

        for(int i = 2 ; i < array.length ; i++){
            array[i] = Math.min(array[i-1]+ cost[i-1], array[i-2] + cost[i-2]);
        }

        return array[array.length - 1];

    }

    public static void main(String[] args) {
        MinCostClimbingStairs obj = new MinCostClimbingStairs();
        int[] array = {10, 15, 20};
        obj.minCostClimbingStairs(array);
    }

}
