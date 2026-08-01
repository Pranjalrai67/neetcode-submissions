class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int n =  nums.length;
        int smallest = nums[0] * nums[1];
        int largest = nums[n-1] * nums[n-2];

        return largest - smallest;
    }
}