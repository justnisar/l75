import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DetermineIfTwoStringsAreClose {

    public boolean closeStrings(String word1, String word2) {
        Map<Character, Long> = word1.chars().collect(Function.identity(), Collectors.groupingBy(i -> i))
    }
}
