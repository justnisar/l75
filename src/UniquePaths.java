import java.util.HashSet;
import java.util.Set;

public class UniquePaths {
    public int uniquePaths(int m, int n) {
        int[][] array = new int[m][n];
        for(int i = 0 ; i < m ; i++){
            for(int j = 0 ; j < n; j++){
                if(i == 0 || j == 0){
                    array[i][j] = 1;
                }
                else{
                    array[i][j] = array[i-1][j] + array[i][j-1];
                }
            }
        }
        return array[m-1][n-1];
    }

    private void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private void changeArray(int[] array){
        array[5] = 11;
    }

    public static void main(String[] args) {
        Set<Pair> set = new HashSet<>();
        Pair array1 = new Pair(1,2);
        Pair array2 = new Pair(1,2);
        set.add(array1);
        set.add(array2);
        System.out.println(set.size());
    }
}

class Pair{
    int a;
    int b;
    public Pair(int a, int b){
        this.a = a;
        this.b = b;
    }
}
