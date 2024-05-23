import java.util.Stack;
public class DecodeString {

    private boolean isStringInteger(String str){
        try{
            Integer.parseInt(str);
        }
        catch(NumberFormatException ex){
            return false;
        }
        return true;
    }

    private String getRepeatedString(String str, int times){
        String result = "";
        while(times != 0){
            result = str + result;
            times--;
        }
        return result;
    }

    public String decodeString(String s) {

        Stack<String> stack = new Stack<>();

        for(char ch : s.toCharArray()){

            if(stack.isEmpty()){
                stack.push(String.valueOf(ch));
                continue;
            }

            String top = stack.peek();

            if(Character.isDigit(ch)){
                if(isStringInteger(top)){
                    stack.pop();
                    stack.push(top + ch);
                }
                else{
                    stack.push(String.valueOf(ch));
                }
            }
            else if(ch == '['){
                stack.push(String.valueOf(ch));
            }
            else if(ch == ']'){

                String temp = "";
                while(!stack.isEmpty()){
                    top = stack.pop();
                    if(top.equals("[")){
                        break;
                    }
                    temp = top + temp;
                }
                int number = Integer.parseInt(stack.pop());
                String newStr = getRepeatedString(temp, number);
                stack.push(newStr);
            }
            else{
                stack.push(String.valueOf(ch));
            }
        }

        String result = "";
        while(!stack.isEmpty()){
            result = stack.pop() + result;
        }
        return result;
    }

    public static void main(String[] args) {
        DecodeString obj = new DecodeString();
        System.out.println(obj.decodeString("3[a]2[bc]"));
    }
}
