class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int CI= nums[i]-1;
            while(nums[i]>0 && nums[i]<n  && nums[i]!=nums[CI]){
                int temp = nums[i];
                nums[i]=nums[CI];
                nums[CI]=temp;
                CI=nums[i]-1;
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]!=i+1){
                return i+1;
            }
        }
        return n+1;
        
    }
}