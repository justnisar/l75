import java.util.ArrayList;
import java.util.List;

public class StringCompression {

    private List<Character> getConvertedCharacterList(int number){
        List<Character> result = new ArrayList<>();
        if(number == 1){
            return result;
        }
        while(number != 0){
            int remainder = number % 10;
            char ch = (char) (remainder + 48);
            result.set(0, ch);
            number /= 10;
        }
        return result;
    }

    public int compress(char[] chars) {

        int pointer = 0;
        int count = 1;
        char prev = chars[0];

        for(int i = 1 ; i < chars.length ; i++){

            char current = chars[i];
            if(current == prev){
                count++;
            }
            else{



            }

        }

        return 0;
    }
}
