class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums1.length;i++)
        {
            map.put(nums1[i],map.getOrDefault(nums1[i],0)+1);
        }

        ArrayList<Integer> ans=new ArrayList<>();

        for(int num:nums2)
        {
            if(map.containsKey(num))
            {
                ans.add(num);
                map.put(num,map.get(num)-1);

                if(map.get(num)==0)
                {
                    map.remove(num);
                }
            }
        }
        
        int result[]=new int[ans.size()];

        for(int i=0;i<ans.size();i++)
        {
            result[i]=ans.get(i);
        }
        return result;
    }
}