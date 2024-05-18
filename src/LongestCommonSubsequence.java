public class LongestCommonSubsequence {

    public int longestCommonSubsequence(String text1, String text2) {

        int rows = text1.length() + 1;
        int cols = text2.length() + 1;
        int[][] array = new int[rows][cols];

        for(int i = 0 ; i < rows ; i++){
            for(int j = 0 ; j < cols; j++){
                if(i == 0 || j == 0){
                    array[i][j] = 0;
                }
                else if(text1.charAt(i-1) == text2.charAt(j-1)){
                    array[i][j] = 1 + array[i-1][j-1];
                }
                else{
                    array[i][j] = Math.max(array[i-1][j],array[i][j-1]);
                }
            }
        }

        return array[rows-1][cols-1];
    }
}
