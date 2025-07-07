/* This question is the continuation of Combination Sum 1 & 2
The only difference is that, instead of giving us an array 
We are asked to print all possible combinations using numbers 1 to 9 (both inclusive)
*/

class Solution{
    public void help(int i, int k, int sumTillNow, int n, List<Integer> subSet, List<List<Integer>> ans) {
        if(sumTillNow > n) 
            return ;
        if(k == 0) {
            if(sumTillNow == n) {
                ans.add(new ArrayList(subSet)); 
            }
            return;
        }
        if(i == 10) 
            return ;
        sumTillNow += i ;
        subSet.add(i) ;
        help(i + 1, k - 1, sumTillNow, n, subSet, ans) ;
        sumTillNow -= i ;
        subSet.remove(subSet.size()-1) ;
        help(i + 1, k, sumTillNow, n, subSet, ans); 
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<Integer> subSet = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        help(1, k, 0, n, subSet, ans) ;
        return ans ;
    }
}
