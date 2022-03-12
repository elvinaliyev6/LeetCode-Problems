import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode firstNode = new ListNode();
        ListNode tail = firstNode;
        while(list1!=null && list2!=null){
            if(list1.val < list2.val){
                tail.next = list1;
                list1 = list1.next;
                tail = tail.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
                tail = tail.next;
            }
        }
        tail.next = (list1!=null) ? list1 : list2;
        return firstNode.next;
    }
}
