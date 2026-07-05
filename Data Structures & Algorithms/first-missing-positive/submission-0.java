class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        boolean found = false;
        for(int i = 0; i< n;i++){
            if(nums[i] == 1){
                found = true;
            }
            if(nums[i] > n|| nums[i] == 0 || nums[i] < 0){
                nums[i] = 1;
            }
        }
        if(!found){
            return 1;
        }

        for(int i = 0; i< n;i++){
            int val = Math.abs(nums[i]);
            int ind = val -1;
            if(nums[ind] < 0){
                continue;
            }
            nums[ind] = nums[ind] * -1;
        }
        for(int i = 0;i < n;i++){
            if(nums[i] > 0){
                return i+1;
            }
        }
        return n+1;

    }
}