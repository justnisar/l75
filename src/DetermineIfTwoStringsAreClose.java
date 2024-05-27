import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {

        if(word1.length() != word2.length()){
            return false;
        }
        int[] array1 = new int[26];
        int[] array2 = new int[26];

        for(char ch : word1.toCharArray()){
            array1[ch - 'a']++;
        }
        for(char ch : word2.toCharArray()){
            array2[ch - 'a']++;
        }

        for(int i = 0 ; i < 26 ; i++){
            if((array1[i] == 0 && array2[i] > 0 ) || (array1[i] > 0 && array2[i] == 0)){
                return false;
            }
        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        return Arrays.equals(array1,array2);
    }

    public static void main(String[] args) {
        DetermineIfTwoStringsAreClose obj = new DetermineIfTwoStringsAreClose();
        obj.closeStrings("abbzzca", "babzzcz");
        //obj.closeStrings("a", "aa");
        //obj.closeStrings("cabbba", "abbccc");
    }

    /*

    a b b z z c a
    b a b z z c z

     */
}
