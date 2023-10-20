class Solution {
    public int firstUniqChar(String s) {
        
          Map<Character, Integer> charCount = new HashMap<>();
        
        // Populate the map with character frequencies
        for (char c : s.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
     // Iterate through the string to find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (charCount.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // If no unique character is found, return -1
        return -1;
    }
}