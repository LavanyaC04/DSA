class Solution {
    public int beautySum(String s) {
        int n = s.length();
        int total = 0;
        for(int i = 0 ; i < n ; i++){
            int[] freq = new int [26];
            for(int j = i ; j < n ; j++){
                freq[s.charAt(j) - 'a']++;
                int min = 1000;
                int max = 0;
                for(int k = 0 ; k < 26 ; k++){
                    if(freq[k] > 0){
                        min = Math.min(min , freq[k]);
                        max = Math.max(max , freq[k]);
                    }
                }
                int beauty = max - min;
                total = total + beauty;
            }
        }
        return total;
    }
}