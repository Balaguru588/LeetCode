class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Loop through the array
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) { // Use a nested loop to find the second number
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j}; // Correctly return indices of the two numbers
                }
            }
        }

        // If no solution is found, throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}

// Example usage
public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {2, 7, 11, 5}; // Example array
        int target = 9;             // Example target
        int[] result = solution.twoSum(nums, target);
        
        System.out.println("Indices of the two numbers are: " + result[0] + " and " + result[1]);
    }
}
