public class OddEvenLinkedList {

    public ListNode oddEvenList(ListNode head) {

        if(head == null || head.next == null || head.next.next == null){
            return head;
        }

        ListNode oddHead = null;
        ListNode evenHead = null;
        ListNode oddTail = null;
        ListNode evenTail = null;
        ListNode current = head;
        int count = 1;
        while(current != null){

            // current node is odd
            if(count % 2 == 1){
                if(oddHead == null){
                    oddHead = oddTail = current;
                }
                else{
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            // current node is even
            else{
                if(evenHead == null){
                    evenHead = evenTail = current;
                }
                else{
                    evenTail.next = current;
                    evenTail = current;
                }
            }

            count++;
            current = current.next;
        }

        if(oddTail.next == evenTail){
            oddTail.next = null;
        }
        if(evenTail.next == oddTail){
            evenTail.next = null;
        }

        // link
        oddTail.next = evenHead;
        return head;
    }

}
