class Solution {
    public String longestCommonPrefix(String[] v) {
        Arrays.sort(v);
        String ans = "";
        String first = v[0];
        String last = v[v.length - 1];
        for(int i = 0 ; i < first.length() ; i ++){
            if(first.charAt(i) != last.charAt(i)){
                return ans;
            }
            ans += first.charAt(i);
        }
        return ans;
    }
}