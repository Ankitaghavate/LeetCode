class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int left=0;
        int sum=0;
        int maxSum=0;

        HashSet<Integer> hs=new HashSet<>();

        for(int right=0;right<nums.length;right++)
        {
            int ele=nums[right];

            sum+=nums[right];

            while(hs.contains(ele))
            {
                sum=sum-nums[left];
                hs.remove(nums[left]);
                left++;
            }
            hs.add(ele);
            maxSum=Math.max(maxSum,sum);
        }
        return maxSum;
    }
}