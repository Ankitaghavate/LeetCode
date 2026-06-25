class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n=nums.length;
        int ans[]=new int[n];
        int ptr=0;

        for(int i=0;i<n;i++)
        {
            if(nums[i]%2==0)
            {
                ans[ptr]=nums[i];
                ptr++;
            }
        }

        for(int i=0;i<n;i++)
        {
            if(nums[i]%2!=0)
            {
                ans[ptr]=nums[i];
                ptr++;
            }
        }
        return ans;
    }
}