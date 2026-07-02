class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(nums,0,nums.length-1);
        return nums;
    }

    public void mergeSort(int nums[],int st,int end)
    {
        while(st>=end)
        {
            return;
        }
        int mid=st+(end-st)/2;
        mergeSort(nums,st,mid);
        mergeSort(nums,mid+1,end);
        merge(nums,st,mid,end);
    }

    public void merge(int nums[],int st,int mid,int end)
    {
        int p1=st;
        int p2=mid+1;
        int p3=0;
        int temp[]=new int[end-st+1];

        while(p1<=mid && p2<=end)
        {
            if(nums[p1]<nums[p2])
            {
                temp[p3]=nums[p1];
                p1++;
            }
            else
            {
                temp[p3]=nums[p2];
                p2++;
            }
            p3++;
        }

        while(p1<=mid)
        {
            temp[p3]=nums[p1];
                p1++;
                p3++;
        }

        while(p2<=end)
        {
            temp[p3]=nums[p2];
            p2++;
            p3++;
        }

        for(int x=0;x<temp.length;x++)
        {
            nums[x+st]=temp[x];
        }
    }
}