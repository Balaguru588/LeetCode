class Solution {
    public int firstUniqChar(String s) {
        char[] c=s.toCharArray();
        for(int i=0;i<=c.length-1;i++){
            boolean isfound=true;
            for(int j=0;j<=c.length-1;j++){
                if(c[i]==c[j] && i!=j){
                    isfound=false;
                    break;
            }
            }
        
            if(isfound){
                return i;
            }
    }
        return -1;
    }
}