class Solution {
    public String removeDuplicateLetters(String s) {
        if (s.length() == 0) return "";

        int[] freq = new int[26];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int pos = 0; // Index of the smallest character (lexicographically)
        for (int i = 0; i < s.length(); i++) {
            // Always try to pick the smallest character
            if (s.charAt(i) < s.charAt(pos)) {
                pos = i;
            }

            freq[s.charAt(i) - 'a']--;

            // If this is the last occurrence of s.charAt(i), stop
            if (freq[s.charAt(i) - 'a'] == 0) {
                break;
            }
        }

        char ch = s.charAt(pos);

        // Remove all instances of ch from the rest of the string
        String remaining = s.substring(pos + 1).replaceAll("" + ch, "");

        // Recursively build the result
        return ch + removeDuplicateLetters(remaining);
    }
}
