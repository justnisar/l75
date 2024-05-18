import java.util.ArrayList;
import java.util.List;

public class CombinationSum3 {

    private void recFun(boolean[] used, List<List<Integer>> result, List<Integer> temp, int k, int n, int start){

        if(n < 0 || temp.size() > k){
            return;
        }

        // The buffer is full
        if(temp.size() == k){
            if(n == 0){
                result.add(new ArrayList(temp));
                //temp.clear();
            }
            return;
        }

        for(int i = start + 1 ; i < 10; i++){
            if(!used[i]){
                used[i] = true;
                temp.add(i);
                recFun(used, result, temp, k, n - i, i);

                if(!temp.isEmpty()) {
                    temp.remove(temp.size() - 1);
                }


                used[i] = false;
            }
        }

    }

    public List<List<Integer>> combinationSum3(int k, int n) {

        List<List<Integer>> result = new ArrayList<>();
        boolean[] used = new boolean[10];
        List<Integer> temp = new ArrayList<>();
        recFun(used, result, temp, k, n, 0);
        return result;
    }

    public static void main(String[] args) {
        CombinationSum3 obj = new CombinationSum3();
        obj.combinationSum3(3,7);
    }
}
