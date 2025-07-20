class Solution {
    public String longestCommonPrefix(String[] v) {
        if(v.length == 0) return "";
        Arrays.sort(v);
        String ans = "";
        String first = v[0];
        String last = v[v.length - 1];
        for(int i = 0 ; i < Math.min(first.length() , last.length()) ; i ++){
            if(first.charAt(i) != last.charAt(i)){
                return ans;
            }
            ans += first.charAt(i);
        }
        return ans;
    }
}