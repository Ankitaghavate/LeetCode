class Solution {
    public int[] sortArray(int[] nums) {
        int n=nums.length;

        for(int i=n/2;i>=0;i--)
        {
            heapify(nums,i,n);
        }

        for(int i=n-1;i>=0;i--)
        {
            int temp=nums[0];
            nums[0]=nums[i];
            nums[i]=temp;

            heapify(nums,0,i);
        }
        return nums;
    }

    public void heapify(int arr[],int i,int n)
    {
        int minIdx=i;
        int left=2*i+1;
        int right=2*i+2;

        if(left<n && arr[left]>arr[minIdx])
        {
            minIdx=left;
        }

        if(right<n && arr[right]>arr[minIdx])
        {
            minIdx=right;
        }

        if(i!=minIdx)
        {
            int temp=arr[i];
            arr[i]=arr[minIdx];
            arr[minIdx]=temp;

            heapify(arr,minIdx,n);
        }
    }

}