class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        int arrLen=nums.length-1;
        for(int i= 0;i<arrLen;i++)
        {
            if(nums[i] == nums[i+1])
            {
                moveLeft(nums,i+1,arrLen-i);
            }
            
            length++;
        }
        return length;
    }
    
    static void moveLeft(int[] nums,int j,int len)
    {
        int k = j;
        for(;k<len;k++)
        {
               nums[k]=nums[k+1]; 

        }
    }

}
