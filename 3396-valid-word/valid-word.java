class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3){
            return false;
        }
        boolean hasVowel = false;
        boolean hasConsonant = false;
        for(int i = 0 ; i < word.length() ; i++){
            if(!Character.isLetterOrDigit(word.charAt(i))){
                return false;
            }
            else if (Character.isLetter(word.charAt(i))){
                char lower = Character.toLowerCase(word.charAt(i));
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
            
        }
        return hasVowel && hasConsonant;

    }
}