import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber {

    /*

    2 -> abc
    3 -> def
    4 -> ghi
    5 -> jkl
    6 -> mno
    7 -> pqrs
    8 -> tuv
    9 -> wxyz


     */

    private Map<Integer,String> populateMap(){
        Map<Integer,String> map = new HashMap<>();
        map.put(2 , "abc");
        map.put(3 , "def");
        map.put(4 , "ghi");
        map.put(5 , "jkl");
        map.put(6 , "mno");
        map.put(7 , "pqrs");
        map.put(8 , "tuv");
        map.put(9 , "wxyz");
        return  map;
    }


    public List<String> letterCombinations(String digits) {

        Map<Integer,String> map = populateMap();
        List<String> result = new ArrayList<>();


        return null;

    }
}
