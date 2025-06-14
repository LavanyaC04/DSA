class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int large=arr[0];
        int second_large=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                second_large=large;
                large=arr[i];
            }
            else if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
        }
        return second_large;
    }
}