class Solution {
    public int[] sortEvenOdd(int[] nums) {
        ArrayList<Integer> even=new ArrayList<>();
        ArrayList<Integer> odd=new ArrayList<>();

        int n=nums.length;

        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                even.add(nums[i]);
            }
            else
            {
                odd.add(nums[i]);
            }
        }

        int e=0,o=0;

        Collections.sort(even);
        Collections.sort(odd,Collections.reverseOrder());

        for(int i=0;i<nums.length;i++)
        {
            if(i%2==0)
            {
                nums[i]=even.get(e);
                e++;
            }
            else
            {
                nums[i]=odd.get(o);
                o++;
            }
        }
        return nums;
    }
}