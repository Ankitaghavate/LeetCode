class Solution {
    public int majorityElement(int[] nums) {
        int mele=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                mele=nums[i];
            }
             if(nums[i]==mele)
            {
                count++;
            }
            else 
            {
                count--;
            }
        }

        count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(mele==nums[i])
            {
                count++;
            }
        }
        int n=nums.length;

        if(count>n/2)
        {
            return mele;
        }
        return -1;
    }
}