class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length, sum=(n*(1+n))/2;

        for(int i = 0; i <= nums.length-1; i++)
        {
            sum -=nums[i];
        }
        return sum;
    }
    
}