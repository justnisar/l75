public class EditDistance {

    public int minDistance(String word1, String word2) {
        int rows = word1.length() + 1;
        int cols = word2.length() + 1;
        int[][] array = new int[rows][cols];
        for(int i = 0 ; i < rows; i++){
            for(int j = 0 ; j < cols; j++){

                if(i == 0){
                    array[i][j] = j;
                }
                else if(j == 0){
                    array[i][j] = i;
                }
                else if(word1.charAt(i - 1) == word2.charAt(j - 1)){
                    array[i][j] = array[i-1][j-1];
                }
                else{
                    array[i][j] = 1 + Math.min(array[i-1][j], Math.min(array[i-1][j-1], array[i][j-1]));
                }
            }
        }
        return array[rows - 1][cols - 1];
    }

    public static void main(String[] args) {
        EditDistance obj = new EditDistance();
        System.out.println(obj.minDistance("horse", "ros"));
    }

    /*

     \0 h o r s e
  \0  0 1 2 3 4 5
  r   1 1 1 2 3 4
  o   2 2 1 2 3 4
  s   3 3 2 2 2 3

     */


}

/*
Example 1:

Input: word1 = "horse", word2 = "ros"
Output: 3
Explanation:
horse -> rorse (replace 'h' with 'r')
rorse -> rose (remove 'r')
rose -> ros (remove 'e')
Example 2:

Input: word1 = "intention", word2 = "execution"
Output: 5
Explanation:
intention -> inention (remove 't')
inention -> enention (replace 'i' with 'e')
enention -> exention (replace 'n' with 'x')
exention -> exection (replace 'n' with 'c')
exection -> execution (insert 'u')

 */