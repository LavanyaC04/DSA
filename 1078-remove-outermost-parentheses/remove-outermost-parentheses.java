class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                
                if(!stack.isEmpty()){
                    result+=ch;
                }
                stack.push(ch);
            }
            else{
                stack.pop();
                if(!stack.isEmpty()){
                    result+=ch;
                }
            }
        }
        return result;
    }
}
