
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet <Character> s1=new HashSet<>();
        int start=0;
        int maxlen=0;
        for(int end=0;end<=s.length()-1;end++){
            while(s1.contains(s.charAt(end))){
                s1.remove(s.charAt(start));
                start++;
            }
            s1.add(s.charAt(end));
            maxlen=Math.max(maxlen,end-start+1);
        }
        return maxlen;
        
    }
}