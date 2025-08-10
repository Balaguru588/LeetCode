class Solution {
    public String longestPalindrome(String s) {
        int maxlength=0;
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                String sub=s.substring(i,j);
                if(isPalindrome(sub) && sub.length()>maxlength){
                    longest=sub;
                    maxlength=sub.length();
                }
            }
        }return longest;
        
    }
    private boolean isPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

}