class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int large=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>large){
                large=arr[i];
            }
        }
        int second_large=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>second_large && arr[i]!=large){
                second_large=arr[i];
            }
        }
        return second_large;
    }
}