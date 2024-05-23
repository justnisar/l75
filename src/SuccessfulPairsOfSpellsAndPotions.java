import java.util.Arrays;
public class SuccessfulPairsOfSpellsAndPotions {

    public int[] successfulPairs(int[] spells, int[] potions, long success) {

        int[] result = new int[spells.length];
        Arrays.sort(potions);
        //Arrays.binarySearch()



        return result;
    }

    public static void main(String[] args) {
        int[] array = {5,10,15,20,25};
        System.out.println(Arrays.binarySearch(array, 10));
        System.out.println(Arrays.binarySearch(array, 21));
    }
}
