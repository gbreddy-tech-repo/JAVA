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
