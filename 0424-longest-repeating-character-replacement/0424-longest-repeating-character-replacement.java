class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,max=0,maxFreq=0;
        HashMap<Character,Integer> map=new HashMap<>();

        for(int right=0;right<s.length();right++)
        {
            char ch=s.charAt(right);

            map.put(ch,map.getOrDefault(ch,0)+1);

            maxFreq=Math.max(maxFreq,map.get(ch));

            while((right-left+1)-maxFreq>k)
            {
                char ch1=s.charAt(left);
                map.put(ch1,map.get(ch1)-1);

                if(map.get(ch1)==0)
                {
                    map.remove(ch1);
                }
                left++;
            }
            max=Math.max(right-left+1,max);
        }
        return max;
    }
}