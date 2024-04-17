import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueNumberOfOccurrences {

    public boolean uniqueOccurrences(int[] arr) {

        Map<Integer, Long> map = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Set<Long> set = new HashSet<>();
        for(long element : map.values()){
            if(set.contains(element)){
                return false;
            }
            set.add(element);
        }
        return true;
    }

}
