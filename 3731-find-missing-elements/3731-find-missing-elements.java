class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=nums[0];
        int max=nums[0];
        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
            hs.add(nums[i]);
        }
        
        ArrayList<Integer> ans=new ArrayList<>();

        while(min<=max)
        {
            if(!hs.contains(min))
            {
                ans.add(min);
            }
            min++;
        }
        return ans;
    }
}