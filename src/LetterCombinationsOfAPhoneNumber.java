import java.util.*;

public class LetterCombinationsOfAPhoneNumber {

    private Map<Character,List<String>> populateMap(){
        Map<Character,List<String>> map = new HashMap<>();
        map.put('2' , Arrays.asList("a", "b", "c"));
        map.put('3' , Arrays.asList("d", "e", "f"));
        map.put('4' , Arrays.asList("g", "h", "i"));
        map.put('5' , Arrays.asList("j", "k", "l"));
        map.put('6' , Arrays.asList("m", "n", "o"));
        map.put('7' , Arrays.asList("p", "q", "r", "s"));
        map.put('8' , Arrays.asList("t", "u", "v"));
        map.put('9' , Arrays.asList("w", "x", "y", "z"));
        return  map;
    }

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0){
            return result;
        }
        Map<Character,List<String>> map = populateMap();
        result.addAll(map.get(digits.charAt(0)));
        for(int i = 1 ; i < digits.length() ; i++){
            List<String> temp = new ArrayList<>();
            for(String str1 : result){
                for(String str2 : map.get(digits.charAt(i))){
                    temp.add(str1 + str2);
                }
            }
            result = new ArrayList<>(temp);
        }
        return result;
    }

    public static void main(String[] args) {
        LetterCombinationsOfAPhoneNumber obj = new LetterCombinationsOfAPhoneNumber();
        obj.letterCombinations("234");
    }
}
