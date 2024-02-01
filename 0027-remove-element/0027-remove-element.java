class Solution {
    public int removeElement(int[] nums, int val) {
        int n= nums.length;
        // int[] expectedNums= new int[n];
        int start=0;
        for(int i =0 ; i<n; i++){
            if(nums[i]!=val){
                nums[start++]=nums[i];
            }
        }
        return start;
    }
}