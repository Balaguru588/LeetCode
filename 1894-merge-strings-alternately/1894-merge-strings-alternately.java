class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        
        // Loop until the end of the shorter string
        while (i < word1.length() && j < word2.length()) {
            result.append(word1.charAt(i));
            result.append(word2.charAt(j));
            i++;
            j++;
        }

        // Append remaining characters of word1, if any
        while (i < word1.length()) {
            result.append(word1.charAt(i));
            i++;
        }

        // Append remaining characters of word2, if any
        while (j < word2.length()) {
            result.append(word2.charAt(j));
            j++;
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        
        String word1 = "abc", word2 = "pqr";
        System.out.println(sol.mergeAlternately(word1, word2)); // Output: "apbqcr"
        
        word1 = "ab"; word2 = "pqrs";
        System.out.println(sol.mergeAlternately(word1, word2)); // Output: "apbqrs"
        
        word1 = "abcd"; word2 = "pq";
        System.out.println(sol.mergeAlternately(word1, word2)); // Output: "apbqcd"
    }
}
