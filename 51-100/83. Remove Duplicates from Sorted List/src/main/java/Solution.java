public class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null){
            return null;
        }
        ListNode temp = head.next;
        ListNode prev = head;

        while(temp != null){
            if(temp.val != prev.val){
                prev = temp;
                temp = temp.next;
            }
            else{
                prev.next = temp.next;
                temp = temp.next;
            }
        }
        return head;
    }
}
