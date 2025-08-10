class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> s=new HashSet<>();
        int start=0;
        int end=0;
        int n=nums.length;
        for(int i=end;i<nums.length;i++){
                if(s.contains(nums[i])){
                return true;
            }else{
                s.add(nums[i]);
                end++;
            }
            if(s.size()>k){
                s.remove(nums[start]);
                start++;
            }

            }
            return false;

        }
    }
