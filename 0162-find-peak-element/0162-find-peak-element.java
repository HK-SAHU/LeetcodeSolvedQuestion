class Solution {
    public int findPeakElement(int[] nums) {
        int n=nums.length;
        int start =0;
        int end =n-1;
        int mid= (start+end)/2;
        while(start<end){
            if(nums[mid]<nums[mid+1]){
                start =mid+1;
            }
            else{
                end= mid;
            }
        // mid= (start+(end- start))/2;
        mid= (start+end)/2;
            
        }
        return start;
    }
}