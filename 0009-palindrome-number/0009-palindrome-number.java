class Solution {
    public boolean isPalindrome(int x) {
        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }
        
        int original = x;  // Store the original number
        int reversed = 0;
        
        while (x != 0) {
            int digit = x % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Build the reversed number
            x /= 10;  // Remove the last digit from x
        }
        
        // Compare the original number with the reversed number
        return original == reversed;
    }
}

public class Main {
    public static void main(String[] args) {
        int param_1 = 121; // Example number to check
        boolean ret = new Solution().isPalindrome(param_1); // Calling the isPalindrome method
        System.out.println(ret); // Output the result (true/false)
    }
}
