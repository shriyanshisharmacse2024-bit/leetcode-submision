
class Solution {
    public ListNode removeNodes(ListNode head) {
        // Step 1: Reverse the linked list
        head = reverse(head);

        ListNode curr = head;
        int max = Integer.MIN_VALUE;

        // Step 2: Remove nodes smaller than max
        ListNode prev = null;

        while (curr != null) {
            if (curr.val >= max) {
                max = curr.val;
                prev = curr;
            } else {
                prev.next = curr.next;
            }

            curr = curr.next;
        }

        // Step 3: Reverse again to restore order
        return reverse(head);
    }

    private ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }
}
