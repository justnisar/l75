import java.util.ArrayList;
import java.util.List;

public class ReverseWordsInAString {

    public String reverseWords(String s) {
        String[] strArr = s.split("\\s+");
        List<String> list = new ArrayList<>();
        for(String x : strArr){
            list.add(x);
        }
        String result = "";
        for(int i = list.size() - 1 ; i >= 0 ; i--){
            result += list.get(i) + " ";
        }
        return result.trim();
    }
}
