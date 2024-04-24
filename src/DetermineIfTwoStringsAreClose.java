import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {
        Map<String, Long> word1Map = Arrays.stream(word1.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map<String, Long> word2Map = Arrays.stream(word2.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        if(word1Map.size() != word2Map.size()){
            return false;
        }

        for(Map.Entry<String, Long> entry : word1Map.entrySet()){
            String key = entry.getKey();
            if(! word2Map.containsKey(key)){
                return false;
            }
        }
        return false;
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
