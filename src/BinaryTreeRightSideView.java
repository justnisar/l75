import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Value{
    public int value;
    public Value(int value) {
        this.value = value;
    }
}



public class BinaryTreeRightSideView {

    private void recFun(TreeNode root, int currentLevel, Value max, List<Integer> result){
        if(root == null){
            return;
        }
        if(currentLevel == max.value){
            result.add(root.val);
            max.value++;
        }
        recFun(root.right, currentLevel + 1, max, result);
        recFun(root.left, currentLevel + 1, max, result);
    }

    public List<Integer> rightSideView(TreeNode root) {
        Value max = new Value(0);
        List<Integer> result = new ArrayList<>();
        recFun(root, 0, max, result);
        return result;
    }
}
