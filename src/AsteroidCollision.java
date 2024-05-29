import java.util.Stack;

public class AsteroidCollision {

    private boolean bothSameDirection(int x,int y){
        return (x < 0 && y < 0) || (x > 0 && y > 0);
    }

    private boolean bothNotColliding(int x, int y){
        return x < 0 && y > 0;
    }

    public int[] asteroidCollision(int[] asteroids) {

        Stack<Integer> stack = new Stack<>();
        for(int asteroid : asteroids){
            while(true){
                if(stack.isEmpty()){
                    stack.push(asteroid);
                    break;
                }
                int top = stack.peek();

                if(bothSameDirection(top, asteroid) || bothNotColliding(top, asteroid)){
                    stack.push(asteroid);
                    break;
                }
                else if(Math.abs(top) == Math.abs(asteroid)){
                    stack.pop();
                    break;
                }
                else if(Math.abs(top) > Math.abs(asteroid)){
                    break;
                }
                else{
                    stack.pop();
                }
            }
        }
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        AsteroidCollision obj = new AsteroidCollision();
        int[] array = {5,10,-5};
        obj.asteroidCollision(array);
    }
}
