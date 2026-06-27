class Solution {
    public int thirdMax(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>();

        for(int i=0;i<nums.length;i++)
        {
            hs.add(nums[i]);
        }

        for(int ele:hs)
        {
            pq.add(ele);
            if(pq.size()>3)
            {
                pq.remove();
            }
        }

        if(hs.size()<3)
        {
            while(pq.size()>1)
            {
                pq.remove();
            }
        }
        return pq.peek();
    }
}