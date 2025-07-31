class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        int count = 0;
        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> prev = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            HashSet<Integer> curr = new HashSet<>();
            curr.add(arr[i]);
            for (int val : prev) {
                curr.add(val | arr[i]);
            }
            for (int val : curr) {
                if (!set.contains(val)) {
                    set.add(val);
                    count++;
                }
            }
            prev = curr;
        }
        return count;
    }
}
