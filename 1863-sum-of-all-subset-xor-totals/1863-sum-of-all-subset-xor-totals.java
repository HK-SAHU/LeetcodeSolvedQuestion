class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }
    
    public int helper(int[] nums, int i, int xors){
        if(i==nums.length) return xors;
        int x=helper(nums, i+1,xors);
        int y= helper(nums,i+1,nums[i]^xors);
        return x+y;
    }
}