class Solution {
    public int removeDuplicates(int[] nums) {
        int start =0;
        for(int j: nums){
            if(start<2 || j > nums[start-2]){
                nums[start++]= j;
            }
        }
        return start;  
    }
}