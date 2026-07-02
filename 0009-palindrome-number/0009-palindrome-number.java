class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int rev=0;

        while(num>0)
        {
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }

        if(rev==x)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}