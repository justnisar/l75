import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class EqualRowAndColumnPairs {

    public int equalPairs(int[][] grid) {

        Map<String,Integer> map = new HashMap<>();
        for(int[] row: grid){
            String key = Arrays.toString(row);
            map.put(key, 1 + map.getOrDefault(key,0));
        }
        int n = grid.length;
        int result = 0;
        for(int i = 0 ; i < n; i++){
            int[] columnArray = new int[n];
            for(int j = 0 ; j < n ; j++){
                columnArray[j] = grid[j][i];
            }
            result += map.getOrDefault(Arrays.toString(columnArray), 0);
        }

        return result;
    }


    public static void main(String[] args) {
        int[][] grid = {{3,2,1},
                        {1,7,6},
                        {2,7,7}};
        EqualRowAndColumnPairs obj = new EqualRowAndColumnPairs();
        System.out.println(obj.equalPairs(grid));
    }
}
