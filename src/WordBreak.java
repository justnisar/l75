import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String> set = new HashSet<>(wordDict);

        boolean[] array = new boolean[s.length() + 1];
        array[0] = true;

        for(int i = 1 ; i < s.length() + 1 ; i++){
            for(int j = 0 ; j <= i ; j++){
                if(array[j] && set.contains(s.substring(j, i))){
                    array[i] = true;
                    break;
                }
            }
        }

        return array[s.length()];

    }

    public static void main(String[] args) {
        WordBreak obj = new WordBreak();
        List<String> list = new ArrayList<>();
        list.add("leet");
        list.add("code");
        obj.wordBreak("leetcode", list);
    }
}
