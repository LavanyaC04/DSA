class Solution {
    public String removeOuterParentheses(String s) {
        String result = "";
        int counter = 0;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(counter > 0){
                    result+=ch;
                }
                counter++;
            }
            else{
                counter--;
                if(counter > 0){
                    result+=ch;
                }
            }
        }
        return result;
    }
}
