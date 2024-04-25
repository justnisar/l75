import java.util.Stack;

public class Dota2Senate {

    // Always try to solve naive first
    public String predictPartyVictory(String senate) {

      Stack<Character> stack = new Stack<>();
      for(char ch : senate.toCharArray()){
        if(stack.isEmpty()){
            stack.push(ch);
            continue;
        }
        char top = stack.peek();
        if(ch != top){
            stack.pop();
        }
        stack.push(ch);
      }
        return stack.peek() == 'D' ? "Dire" : "Radiant";
    }

    public static void main(String[] args) {
        Dota2Senate obj = new Dota2Senate();
        System.out.println(obj.predictPartyVictory("RD"));
    }

}
