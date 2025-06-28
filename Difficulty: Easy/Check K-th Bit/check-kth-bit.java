class CheckBit {
    static boolean checkKthBit(int n, int k) {
        // code here
        int bitmask = 1 << k;
        if((n & bitmask) == 0){
            return false;
        }
        else{
            return true;
        }
    }
}