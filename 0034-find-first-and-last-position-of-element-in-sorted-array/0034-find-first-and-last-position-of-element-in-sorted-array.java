class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans= new int[2];
        ans[0]= assignFirst(nums, target);
        ans[1]=assignLast(nums, target);
        return ans;
    }
    
    public int assignFirst(int[] nums, int target){
        int n= nums.length;
        int found=-1;
        for(int i=0; i<n;i++){
            if(nums[i]==target){
                found=i;
                break;
            }
        }
        return found;
    }
    
    public int assignLast(int[] nums, int target){
        int n= nums.length;
        int found=-1;
        for(int i=n-1; i>=0;i--){
            if(nums[i]==target){
                found=i;
                break;
            }
        }
        return found;
    }
    
    
}