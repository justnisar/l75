public class ContainerWithMostWater {

    public int maxArea(int[] height) {

        int i = 0 , j = height.length - 1;
        int finalMax = 0;
        while(i < j){
            int currentMax = (j - i) * Math.min(height[i], height[j]);
            if(currentMax > finalMax){
                finalMax = currentMax;
            }
            if(height[i] <= height[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return finalMax;
    }
}
