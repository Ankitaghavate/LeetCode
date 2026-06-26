class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=merge(nums1,nums2);
        int n=ans.length;

        if(n%2==0)
        {
            double res=(ans[n/2]+ans[n/2-1])/2.0;
            return res;
        }else
        {
            double res=ans[n/2];
            return res;
        }
    }

    public int[] merge(int nums1[],int nums2[])
    {
        int p1=0;
        int p2=0;
        int ans[]=new int[nums1.length+nums2.length];
        int ptr=0;

        while(p1<nums1.length && p2<nums2.length)
        {
            if(nums1[p1]<nums2[p2])
            {
                ans[ptr]=nums1[p1];
                p1++;
            }
            else 
            {
                ans[ptr]=nums2[p2];
                p2++;
            }
            ptr++;
        }
        while(p1<nums1.length)
        {
            ans[ptr]=nums1[p1];
            p1++;
            ptr++;
        }

        while(p2<nums2.length)
        {
            ans[ptr]=nums2[p2];
            p2++;
            ptr++;
        }
        return ans;
    }
}