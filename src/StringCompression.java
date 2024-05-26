import java.util.ArrayList;
import java.util.List;

public class StringCompression {

    List<Character> getDigitsFromNumber(int number){
        List<Character> result = new ArrayList<>();
        if(number == 1){
            return result;
        }
        while(number != 0){
            int digit = number % 10;
            number = number / 10;
            char digitCh = (char) (digit + '0');
            result.add(0, digitCh);
        }
        return result;
    }

    private int rewriteArray(int pointer, char[] chars, char prev, int count){
        chars[pointer] = prev;
        pointer++;
        List<Character> numberChars = getDigitsFromNumber(count);
        for(char ch : numberChars){
            chars[pointer] = ch;
            pointer++;
        }
        return pointer;
    }

    public int compress(char[] chars) {
        if(chars.length == 1){
            return 1;
        }
        int pointer = 0;
        int count = 1;
        char prev = chars[0];
        char current = ' ';
        for(int i = 1 ; i < chars.length ; i++){
            current = chars[i];

            if(current == prev){
                count++;
            }
            // point of change
            else{
                pointer = rewriteArray(pointer, chars, prev, count);
                prev = current;
                count = 1;
            }
        }
        pointer = rewriteArray(pointer, chars, current, count);
        return pointer;
    }

    public static void main(String[] args) {
        char[] chArr = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        StringCompression obj = new StringCompression();
        System.out.println(obj.compress(chArr));
    }
}
