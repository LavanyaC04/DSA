class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int j=n-2;j>=0;j--){
            rightMax[j]=Math.max(height[j],rightMax[j+1]);
        }
        int trapped_water=0;
        for(int k=0;k<n;k++){
            int waterlevel=Math.min(leftMax[k],rightMax[k]);
            trapped_water+=waterlevel-height[k];
        }
        return trapped_water;
    }
}