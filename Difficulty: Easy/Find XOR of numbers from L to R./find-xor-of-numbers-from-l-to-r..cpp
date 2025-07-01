// User function Template for C++

class Solution {
  public:
    int findXOR(int l, int r) {
        int xorTillL = XOR(l - 1);
        int xorTillR = XOR(r);
        return xorTillL ^ xorTillR;
    }
    int XOR(int n){
        if(n % 4 == 1){
            return 1;
        }
        else if(n % 4 == 2){
            return n + 1;
        }
        else if(n % 4 == 3){
            return 0;
        }
        else{
            return n;
        }
        
    }
};