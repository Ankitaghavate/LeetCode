class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[]={-1,-1};
        
        ans[0]=firstOccurance(nums,target);
        ans[1]=lastOccurance(nums,target);

        return ans;
    }

    public int firstOccurance(int nums[],int target)
    {
        int st=0;
        int end=nums.length-1;
        int ans=-1;

        while(st<=end)
        {
            int mid=st+(end-st)/2;

            if(nums[mid]==target)
            {
                ans=mid;
                end=mid-1;
            }
            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else if(nums[mid]<target)
            {
                st=mid+1;
            }
        }
        return ans;
    }

    public int lastOccurance(int nums[],int target)
    {
        int st=0;
        int end=nums.length-1;
        int ans=-1;

        while(st<=end)
        {
            int mid=st+(end-st)/2;

            if(nums[mid]==target)
            {
                ans=mid;
                st=mid+1;
            }
            if(nums[mid]>target)
            {
                end=mid-1;
            }
            else if(nums[mid]<target)
            {
                st=mid+1;
            }
        }
        return ans;
    }
}