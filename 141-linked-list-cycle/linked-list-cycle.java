/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp = head;
        Map<ListNode,Integer> nodemap = new HashMap<>();
        while(temp != null){
            if(nodemap.containsKey(temp)){
                return true;
            }
            nodemap.put(temp , 1);
            temp = temp.next;
        } 
        return false;
    }
}