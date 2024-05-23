public class IncreasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums) {
        int firstLargest = Integer.MAX_VALUE;
        int secondLargest = Integer.MAX_VALUE;
        for(int current : nums){
            if(current < firstLargest){
                firstLargest = current;
            }
            else if(current < secondLargest){
                secondLargest = current;
            }
            else{
                return true;
            }
        }
        return false;
    }

}
