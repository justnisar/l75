public class NthTribonacciNumber {

    public int tribonacci(int n) {

        if(n == 0){
            return 0;
        }
        else if(n <= 2){
            return 1;
        }
        else{
            int[] triArray = new int[n+1];
            triArray[0] = 0;
            triArray[1] = 1;
            triArray[2] = 1;
            for(int i = 3 ; i < n+1 ; i++){
                triArray[i] = triArray[i-1] + triArray[i-2] + triArray[i-3];
            }
            return triArray[n];
        }
    }
}
