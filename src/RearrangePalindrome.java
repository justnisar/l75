import java.util.ArrayList;
import java.util.List;

public class RearrangePalindrome {

    private int[] getCountArray(String str){
        int[] array = new int[26];
        for(char ch : str.toCharArray()){
            array[ch - 'a']++;
        }
        return array;
    }

    private int doesStringContainOnlyOneCharacterType(int[] array){
        String str = "";
        int count = 0;
        for(int i = 0 ; i < 26; i++){
            if(array[i] != 0){
                count++;
            }
            if(count > 1){
                return 2;
            }
        }
        return count;
    }

    private String formString(int[] array){
        String str = "";
        for(int i = 0 ; i < 26; i++){
            if(array[i] != 0){
                int count = array[i];
                while(count != 0){
                    str += (char)('a' + i);
                    count -= 1;
                }
                break;
            }
        }
        return str;
    }

    private List<String> recFun(int[] array){

        int check = doesStringContainOnlyOneCharacterType(array);
        List<String> result = new ArrayList<>();
        if(check == 0){
            result.add("");
            return result;
        }
        if(check == 1){
            result.add(formString(array));
            return result;
        }

        for(int i = 0 ; i < 26; i++){
            if(array[i] != 0 && array[i] >= 2){
                array[i] -= 2;
                List<String> temp = recFun(array);
                for(String t : temp){
                    char ch = (char) ('a' + i);
                    result.add(ch + t + ch);
                }
                array[i] += 2;
            }
        }
        return result;
    }

    private List<String> rearrangePalindromes(String str){
        int[] array = getCountArray(str);
        return recFun(array);
    }

    public static void main(String[] args) {
        RearrangePalindrome obj = new RearrangePalindrome();
        List<String> result = obj.rearrangePalindromes("abba");
    }
}

/*
    For charactersSet = "ababb", the output should be
    solution(charactersSet) = ["abbba", "babab"].
 */
