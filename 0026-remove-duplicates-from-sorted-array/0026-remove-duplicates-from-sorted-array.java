class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0; // Points to the last unique element

        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;              // Move i to next position
                nums[i] = nums[j]; // Copy new unique number
            }
        }

        return i + 1; // Total number of unique elements
    }

  /*  public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1, 1, 2, 2, 3};

        int newLength = sol.removeDuplicates(nums);
  
        System.out.print("Unique values: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }*/
}
