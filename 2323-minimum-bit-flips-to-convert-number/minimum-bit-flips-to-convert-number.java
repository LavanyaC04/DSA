class Solution {
    public int minBitFlips(int start, int goal) {
        int x = start^goal;
        return numberOfSetBits(x);
    }
    public static int numberOfSetBits(int n){
        int count=0;
        while(n>0){
            count+=n&1;
            n=n>>1;
        }
        return count;
    }
}