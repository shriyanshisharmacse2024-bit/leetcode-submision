
class Solution {
    public ListNode mergeNodes(ListNode head) {

        ListNode fast = head.next;
        
        ListNode slow = head;
        while(fast != null){
            int sum = 0;
        while(fast.val != 0){
            sum += fast.val;
            fast = fast.next;
        }slow.val = sum;
            slow.next= fast.next;
            slow = slow.next;
            fast = fast.next;
        }
        
        return head;

} 
    }

