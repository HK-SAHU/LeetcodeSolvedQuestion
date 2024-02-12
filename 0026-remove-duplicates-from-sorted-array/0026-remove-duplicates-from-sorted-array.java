class Solution {
    public int removeDuplicates(int[] nums) {
        int start=0;
        for(int j: nums){
            if(start<1 || j > nums[start-1]){
                nums[start++]=j;
            }
        }
        return start;
    }
}