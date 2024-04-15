import java.util.ArrayList;
import java.util.List;

public class LeafSimilarTrees {

    private void helper(TreeNode root, List<Integer> sequence){
        if(root == null){
            return;
        }
        if(root.left == null && root.right == null){
            sequence.add(root.val);
        }
        if(root.left != null){
            helper(root.left, sequence);
        }
        if(root.right != null){
            helper(root.right, sequence);
        }
    }

    private int[] getLeafSequence(TreeNode root){
        List<Integer> sequence = new ArrayList<>();
        helper(root, sequence);
        return sequence.stream().mapToInt(Integer::intValue).toArray();
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        int[] root1Array = getLeafSequence(root1);
        int[] root2Array = getLeafSequence(root2);
        if(root1Array.length != root2Array.length){
            return false;
        }
        for(int i = 0 ; i < root1Array.length ; i++){
            if(root1Array[i] != root2Array[i]){
                return false;
            }
        }
        return true;
    }
}
