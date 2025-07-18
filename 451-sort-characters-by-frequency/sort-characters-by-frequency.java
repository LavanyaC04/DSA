class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a)); 
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(String.valueOf(c).repeat(freq.get(c)));
        }
        return result.toString();
    }
}
