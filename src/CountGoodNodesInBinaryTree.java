

public class CountGoodNodesInBinaryTree {

    private void recFun(TreeNode root, int max, Value obj){
        if(root == null){
            return;
        }
        if(root.val >= max){
            max = root.val;
            obj.value++;
        }
        recFun(root.left , max, obj);
        recFun(root.right, max, obj);
    }

    public int goodNodes(TreeNode root) {
        Value obj = new Value(0);
        recFun(root, Integer.MIN_VALUE,obj);
        return obj.value;
    }
}
