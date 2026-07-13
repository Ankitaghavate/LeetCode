class Solution {
    public int longestOnes(int[] nums, int k) {
        int left=0,max=0,zerocount=0;

        for(int right=0;right<nums.length;right++)
        {
            int ele=nums[right];

            if(ele==0)
            {
                zerocount++;
            }

            while(zerocount>k)
            {
                if(nums[left]==0)
                {
                    zerocount--;
                }
                left++;
            }

            max=Math.max(right-left+1,max);
        }
        return max;
    }
}