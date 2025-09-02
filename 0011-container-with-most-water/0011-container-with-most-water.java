class Solution {
    public int maxArea(int[] height) {
        int area=0;
        int left=0;
        int right=height.length-1;
        int maxwater=0;

        while(left<right){
            int width=right-left;
            int h1=Math.min(height[left],height[right]);
            area=width*h1;
            maxwater=Math.max(maxwater,area);
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxwater;
        
    }
}