import java.util.Stack;

public class DailyTemperatures {

    public int[] dailyTemperatures(int[] temperatures) {

        Stack<Integer> stack = new Stack<>();
        int[] result = new int[temperatures.length];
        for(int i = 0 ; i < temperatures.length; i++){

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]){
                int index = stack.pop();
                result[index] = i - index;
            }
            stack.push(i);
        }
        return result;
    }


    public static void main(String[] args) {
        DailyTemperatures obj = new DailyTemperatures();
        int[] array = {73,74,75,71,69,72,76,73};
        obj.dailyTemperatures(array);
    }

}
