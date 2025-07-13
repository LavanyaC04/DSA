class Solution {
    public int maxDepth(String s) {
        int count = 0 ;
        Stack <Integer> stack = new Stack <> ();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                stack.push(i);
                if(count < stack.size()){
                    count = stack.size();
                }
            }
            else if(ch == ')'){
                
                stack.pop();
            }
        }
        return count;
    }
}