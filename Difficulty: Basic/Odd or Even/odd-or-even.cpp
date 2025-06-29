class Solution {
  public:
    bool isEven(int n) {
        // code here
        if ((n ^ 1) == (n + 1))
            return true;
        else
            return false;

    }
};