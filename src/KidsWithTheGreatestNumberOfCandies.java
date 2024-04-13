import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {

    private boolean check(int max, int candies, int extra){
        return candies+extra >= max;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int max = Arrays.stream(candies).max().getAsInt();
        Arrays.stream(candies).forEach(i -> result.add(check(max, i , extraCandies)));
        return result;
    }
}
