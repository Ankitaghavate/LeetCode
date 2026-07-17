class Solution {
    public int majorityElement(int[] nums) {
        int maxele=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                maxele=nums[i];
            }

            if(nums[i]==maxele)
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
            if(nums[i]==maxele)
            {
                count++;
            }
        }

        if(count>nums.length/2)
        {
            return maxele;
        }
        else
        {
            return -1;
        }
    }
}