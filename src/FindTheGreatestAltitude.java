public class FindTheGreatestAltitude {

    public int largestAltitude(int[] gain) {

        int max = 0;
        int current = 0;
        for(int step: gain){
            current += step;
            if(current > max){
                max = current;
            }
        }
        return max;
    }
}
