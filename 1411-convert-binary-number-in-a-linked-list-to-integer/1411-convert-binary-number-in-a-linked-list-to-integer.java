/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public String ListToString(ListNode head){
        StringBuilder str = new StringBuilder();
        while(head != null){
            str.append(head.val);
            head = head.next;
        }
        return str.toString();
    }
    public int getDecimalValue(ListNode head) {
        String s = ListToString(head);
        int res = 0;
        for(int i=0;i<s.length();i++){
            res = res*2 + (s.charAt(i)-'0');
        }
        return res;
    }
}