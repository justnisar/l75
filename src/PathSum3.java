import java.util.ArrayList;
import java.util.List;

public class PathSum3 {
/*
    private int pathCount = 0;
    private List<Integer> getPaths(TreeNode root, int targetSum){

        if(root == null){
            return null;
        }
        List<Integer> result = new ArrayList<>();
        if(root.left == null && root.right == null){
            if(root.val == targetSum){
                pathCount++;
            }
            result.add(root.val);
            return result;
        }

        List<Integer> leftList = getPaths(root.left, targetSum);
        List<Integer> rightList = getPaths(root.right, targetSum);

        if(leftList != null){
            for(int leftElement : leftList){
                if(root.val + leftElement == targetSum){
                    pathCount++;
                }
                result.add(root.val + leftElement);
            }
        }
        if(rightList != null){
            for(int rightElement : rightList){
                if(root.val + rightElement == targetSum){
                    pathCount++;
                }
                result.add(root.val + rightElement);
            }
        }

        if(root.val == targetSum){
            pathCount++;
        }
        result.add();

        return result;
    }

    public int pathSum(TreeNode root, int targetSum) {

        getPaths(root, targetSum);
        return pathCount;
    }
*/
}
