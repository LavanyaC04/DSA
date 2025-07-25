class Solution {
    int maxLen(int arr[]) {
        // code here
        HashMap<Integer, Integer> mpp = new HashMap<Integer, Integer>();
        int max = 0;
        int sum = 0;
        int n = arr.length;
        for (int i = 0 ; i < n ; i++){
            sum += arr[i];
            if(sum == 0){
                max = i + 1;
            }
            else if(mpp.get(sum) != null) {
                max = Math.max(max, i - mpp.get(sum)); 
            }
            else{
                mpp.put(sum , i);
            }
            
        }
        return max;
    }
}