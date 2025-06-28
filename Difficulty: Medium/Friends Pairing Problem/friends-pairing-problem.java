// User function Template for Java

class Solution {
    public int countFriendsPairings(int n) {
        // code here
        if(n == 1 || n == 2){
            return n;
        }
        int fm1 = countFriendsPairings(n-1);
        int fm2 = countFriendsPairings(n-2);
        int total = fm1 + (n-1) * fm2;
        return total;
    }
}
