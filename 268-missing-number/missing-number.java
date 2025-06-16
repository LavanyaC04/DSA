class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int s1 = 0;
        int s2 = 0;
        s1 = (n*(n+1))/2;
        for(int i = 0 ; i < n ; i++){
           s2 += nums[i];
        }
        int missing = s1 - s2;
        return missing;
    }
}