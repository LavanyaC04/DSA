class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int freq = 0;
        int max_freq = 0;
        for(int i = 0 ; i < n ; i++){
            if(nums[i] == 1){
                freq++;
                max_freq = Math.max(max_freq, freq);
            }
            else{
                freq = 0;
            }
        }
        return  max_freq;
    }
}