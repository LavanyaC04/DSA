class Solution {
    public String countAndSay(int n) {
        if(n == 1){
            return "1";
        }
        String say = countAndSay(n - 1);
        StringBuilder result = new StringBuilder();
        
        int count = 1;
        for(int i = 1; i < say.length(); i++){
            if(say.charAt(i) == say.charAt(i - 1)){
                count++;
            } else {
                result.append(count).append(say.charAt(i - 1));
                count = 1; // Reset count
            }
        }
        // Append the last group
        result.append(count).append(say.charAt(say.length() - 1));
        
        return result.toString();
    }
}
