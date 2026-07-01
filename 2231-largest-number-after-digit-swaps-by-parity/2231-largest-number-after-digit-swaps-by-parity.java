class Solution {
    public int largestInteger(int num) {
        char arr[]=String.valueOf(num).toCharArray();

        List<Character> even=new ArrayList<>();
        List<Character> odd=new ArrayList<>();

        for(char ch:arr)
        {
            if((ch-'0')%2==0)
            {
                even.add(ch);
            }
            else
            {
                odd.add(ch);
            }
        }
            odd.sort(Collections.reverseOrder());
            even.sort(Collections.reverseOrder());

            int o=0,e=0;

            StringBuilder sb=new StringBuilder();

            for(char ch:arr)
            {
                if((ch-'0')%2==0)
                {
                    sb.append(even.get(e));
                    e++;
                }
                else
                {
                    sb.append(odd.get(o));
                    o++;
                }
            }
        
        return Integer.parseInt(sb.toString());
    }
}