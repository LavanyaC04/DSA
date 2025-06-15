class Solution {
    public void moveZeroes(int[] nums) {
        int n= nums.length;
        int[] temp = new int[n];
        int index = 0;

        // Step 2: Copy non-zero elements to temp[]
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp[index] = nums[i];
                index++;
            }
        }

        // Step 3: Copy all elements from temp[] back to original array
        for (int i = 0; i < n; i++) {
            nums[i] = temp[i];
        }
        
    }
}