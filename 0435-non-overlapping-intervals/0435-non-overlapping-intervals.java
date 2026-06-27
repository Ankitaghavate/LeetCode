class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int max=0;
        int lastend=Integer.MIN_VALUE;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));

        for(int i=0;i<intervals.length;i++)
        {
            if(intervals[i][0]>=lastend)
            {
                max++;
                lastend=intervals[i][1];
            }
        }
        return intervals.length-max;
    }
}