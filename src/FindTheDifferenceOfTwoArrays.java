import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindTheDifferenceOfTwoArrays {

    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> nums1Set = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
        Set<Integer> nums2Set = Arrays.stream(nums2).boxed().collect(Collectors.toSet());

        result.add(Arrays.stream(nums1).distinct().filter(i -> !nums2Set.contains(i)).boxed().collect(Collectors.toList()));
        result.add(Arrays.stream(nums2).distinct().filter(i -> !nums1Set.contains(i)).boxed().collect(Collectors.toList()));

        return result;
    }

    public static void main(String[] args) {
        FindTheDifferenceOfTwoArrays obj = new FindTheDifferenceOfTwoArrays();
        obj.findDifference(new int[]{1,2,3} , new int[]{2,4,6});
    }
}
