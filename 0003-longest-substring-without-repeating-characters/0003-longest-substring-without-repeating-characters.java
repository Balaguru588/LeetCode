class Solution {
    public int lengthOfLongestSubstring(String s) {
        char[] c=s.toCharArray();
        Set<Character> s1=new HashSet<>();
        int left=0;
        int right=0;
        int maxlength=0;
        while (right < c.length) {
            if (!s1.contains(c[right])) {
                s1.add(c[right]);
                maxlength = Math.max(maxlength, right - left + 1);
                right++;
            } else {
                s1.remove(c[left]);
                left++;
            }
        }
        return maxlength;
        
    }
}