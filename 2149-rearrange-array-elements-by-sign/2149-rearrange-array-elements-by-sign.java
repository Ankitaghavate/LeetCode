class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int pos[]=new int[n/2];
        int neg[]=new int[n/2];
        int posIdx=0;
        int negIdx=0;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                pos[posIdx]=nums[i];
                posIdx++;
            }
            else
            {
                neg[negIdx]=nums[i];
                negIdx++;
            }
        }
        int idx=0;
        int ans[]=new int[n];
        posIdx=0;
        negIdx=0;

        while(idx<n)
        {
            ans[idx]=pos[posIdx];
            posIdx++;
            idx++;

            ans[idx]=neg[negIdx];
            negIdx++;
            idx++;
        }
        return ans;
    }
}