class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int as=0;
        int cs=0;
        int n=grid.length;
        int repeated=0;
        int missing=0;

        HashSet<Integer> hs=new HashSet<>();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                cs+=grid[i][j];

                if(hs.contains(grid[i][j]))
                {
                    repeated=grid[i][j];
                }
                hs.add(grid[i][j]);
            }
        }

        as=n*n*(n*n+1)/2;

        missing=as-(cs-repeated);

        int ans[]=new int[2];
        ans[0]=repeated;
        ans[1]=missing;

        return ans;
    }
}