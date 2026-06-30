class Solution {
    public double myPow(double x, int n) {
        if(x==0)
        {
            return 0.0;
        }

        if(x==1 || n==0)
        {
            return 1.0;
        }
        long BF=n;
        double ans=1;

        if(n<0)
        {
            x=1/x;
            BF=-BF;
        }
       
        while(BF>0)
        {
            if(BF%2==1)
            {
                ans*=x;
            }

            x=x*x;

            BF=BF/2;
        }
        return ans;
    }
}