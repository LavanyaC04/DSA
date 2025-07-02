class Solution {
    public int[] singleNumber(int[] nums) {
        int n = nums.length;
        int xor = 0;
        for (int i = 0 ; i < n ; i++) {
            xor = xor ^ nums[i];
        }
        int rightmost = xor & -xor;
        int bucket1 = 0, bucket2 = 0;
        for (int i = 0 ; i < n ; i++) {
            if ((nums[i] & rightmost) != 0) {
                bucket1 = bucket1 ^ nums[i];
            } else {
                bucket2 = bucket2 ^ nums[i];
            }
        }
        return new int[]{bucket1, bucket2};

    }
}