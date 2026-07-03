class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean ascending = true;

        for(int i =1;i< nums.length;i++){
            if(nums[i] >= nums[i-1]){
                continue;
            }else{
                ascending = false;
                break;
            }
            
        }
        boolean decending = true;
         for(int i =1;i< nums.length;i++){
            if(nums[i] <= nums[i-1]){
                continue;
            }else{
                decending = false;
                break;
            }
            
        }
        if(decending || ascending){
            return true;
        }
        return false;
    }
}