class Solution {
    public int singleNonDuplicate(int[] nums) {
        int result=0;

        for(int ele:nums)
        {
            result=result^ele;
        }
        return result;
    }
}