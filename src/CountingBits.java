import java.util.Arrays;
import java.util.Collections;

public class CountingBits {

    private int countOnes(int n){

        int sum = 0;
        while(n > 0){
            if(n % 2 == 1){
                sum += 1;
            }
            n /= 2;
        }
        return sum;
    }

    public int[] countBits(int n) {

        int[] result = new int[n+1];
        for(int i = 0 ; i < n+1 ; i++){
            result[i] = i;
        }
        Arrays.stream(result).forEach(i -> result[i] = countOnes(i));
        return result;
    }

}
