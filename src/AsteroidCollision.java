import java.util.Stack;

public class AsteroidCollision {

    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for(int asteroid : asteroids){
            if(stack.isEmpty()){
                stack.push(asteroid);
                continue;
            }

            int top = stack.peek();
            if(asteroid + top == 0){
                stack.pop();
            }
            else if((asteroid > 0 && top > 0) || (asteroid < 0 && top < 0)){
                stack.push(asteroid);
            }
            else{

                while(!stack.isEmpty()){

                    //int currentPower = Math.abs(asteroid);
                    if(Math.abs(asteroid) >= Math.abs(top)){
                        stack.pop();
                    }
                    else{

                    }


                }

            }

        }

        return stack.stream().mapToInt(Integer::intValue).toArray();

    }
}
