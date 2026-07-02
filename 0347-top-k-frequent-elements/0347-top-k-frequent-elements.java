class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int ele:nums)
        {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort((a,b)->
        {
            if(b.getValue().equals(a.getValue()) )
            {
                return b.getKey()-a.getKey();
            }
            return b.getValue()-a.getValue();
        });

        int ans[]=new int[k];

        for(int i=0;i<k;i++)
        {
            ans[i]=list.get(i).getKey();
        }
        
        return ans;
    }
}