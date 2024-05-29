import java.util.ArrayList;
import java.util.List;

public class LongestZigZagPathInABinaryTree {

    int max = 0;

    private void recFun(TreeNode root,  boolean left, int height){
        if(root == null){
            return;
        }
        max = Math.max(max, height);
        if(left){
            recFun(root.left, false, 1);
            recFun(root.right, true, 1 + height);
        }
        else{
            recFun(root.left, true, 1 + height);
            recFun(root.right, false, 1 );
        }

    }

    public int longestZigZag(TreeNode root) {
        recFun(root, true, 0);
        recFun(root, false, 0);
        return max;
    }
}
