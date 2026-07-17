class Solution {
    public int maxSubArray(int[] nums) {
        int cs=nums[0];
        int maxSum=nums[0];

        for(int i=1;i<nums.length;i++)
        {
            if(cs<0)
            {
                cs=0;
            }
            
            cs+=nums[i];
            
            maxSum=Math.max(maxSum,cs);
        }
        return maxSum;
    }
}