
class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode ans = new ListNode(0);
        ListNode curr = ans;

        int sum = 0;
        head = head.next;

        while (head != null) {

            if (head.val != 0) {
                sum = sum + head.val;
            } else {
                curr.next = new ListNode(sum);
                curr = curr.next;
                sum = 0;
            }

            head = head.next;
        }

        return ans.next;
    }
}
