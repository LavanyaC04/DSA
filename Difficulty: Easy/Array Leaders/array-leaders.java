class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        int maxFromRight = arr[n - 1];
        ans.add(maxFromRight);
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                ans.add(maxFromRight);
            }
        }
        Collections.reverse(ans);
        return ans;
    }
}
