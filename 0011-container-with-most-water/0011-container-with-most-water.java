class Solution {
    public int maxArea(int[] height) 
    {
        int lp=0;
        int rp=height.length-1;
        int maxwater=0;

        while(lp<rp)
        {
            int width=rp-lp;
            int ht=Math.min(height[lp],height[rp]);

            int currwater=width*ht;
            maxwater=Math.max(maxwater,currwater);

            if(height[lp]<height[rp])
            {
                lp++;
            }
            else
            {
                rp--;
            }
        }
        return maxwater;
    }
}