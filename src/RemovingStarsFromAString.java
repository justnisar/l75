import java.util.Stack;

public class RemovingStarsFromAString {

    public String removeStars(String s) {

        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch != '*'){
                stack.push(ch);
            }
            else{
                stack.pop();
            }
        }
        String result = "";
        for(char ch : stack){
            result += ch;
        }
        return result;
    }

    public static void main(String[] args) {
        RemovingStarsFromAString obj = new RemovingStarsFromAString();
        obj.removeStars("leet**cod*e");
    }
}
