import java.util.ArrayList;

public class MaximumTwinSumOfALinkedList {

    int max = 0;
    ListNode current = null;
    private ListNode findMiddle(ListNode head){
        ListNode slow = head, fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private void recFun(ListNode node){
        if(node == null){
            return;
        }
        recFun(node.next);
        int currentMax = node.val + current.val;
        if(max < currentMax){
            max = currentMax;
        }
        current = current.next;
    }

    public int pairSum(ListNode head) {

        ListNode middleHead = findMiddle(head);
        current = head;
        recFun(middleHead);
        return max;
    }

    public static void main(String[] args) {
        MaximumTwinSumOfALinkedList obj = new MaximumTwinSumOfALinkedList();
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        obj.pairSum(head);
    }
}
