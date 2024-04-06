public class ReverseLinkedList {

    public ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode prev = null;
        ListNode current = head;
        ListNode next = current.next;
        while (current != null) {
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

}
