class Solution {
    public List<String> validStrings(int n) {
        List<String> validStrings = new ArrayList<>();
        generateStrings(n, "", '\0', validStrings);
        return validStrings;
    }
    public void generateStrings(int n, String str, char prev, List<String> validStrings) {
        if (n == 0) {
            validStrings.add(str);
            return;
        }
        if (prev != '0') {
            generateStrings(n - 1, str + "0", '0', validStrings);
        }
        generateStrings(n - 1, str + "1", '1', validStrings);
    }
}
