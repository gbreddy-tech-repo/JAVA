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
    public int getDecimalValue(ListNode head) {
        int desVal = 0;
        
         
           if(head == null)
               return -1;
         
          while(head!=null)
          {
              
              desVal= desVal << 1;
              desVal = desVal+head.val;              
              head = head.next;
          }
          return desVal;
        
    }
}
