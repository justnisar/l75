import java.util.LinkedList;
import java.util.Queue;

public class MaximumLevelSumOfABinaryTree {

    public int maxLevelSum(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        int maxLevel = 0;
        int currentLevel = 0;
        int currentSum = 0;
        queue.add(root);
        queue.add(null);

        while(!queue.isEmpty()){

            TreeNode top = queue.remove();

            if(top == null){

                currentLevel++;
                if(currentSum > maxSum){
                    maxSum = currentSum;
                    maxLevel = currentLevel;
                }
                currentSum = 0;

                if(queue.isEmpty()){
                    break;
                }
                queue.add(null);
                continue;
            }

            currentSum += top.val;
            if(top.left != null){
                queue.add(top.left);
            }
            if(top.right != null){
                queue.add(top.right);
            }
        }
        return maxLevel;
    }

    public static void main(String[] args) {
        System.out.println(Integer.MIN_VALUE);
    }
}
