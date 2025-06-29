class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            ans.add(generateRow(row));
        }
        return ans;
    }

    public static List<Integer> generateRow(int row) {
        long ans = 1;
        List<Integer> ansRow = new ArrayList<>();

        for (int col = 0; col <= row; col++) {
            if (col == 0) {
                ansRow.add(1);
            } else {
                ans = ans * (row - col + 1);
                ans = ans / col;
                ansRow.add((int) ans);
            }
        }
        return ansRow;
    }
}
