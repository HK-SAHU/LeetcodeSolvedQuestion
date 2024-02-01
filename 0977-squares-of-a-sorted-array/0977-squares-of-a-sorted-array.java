class Solution {
    public void swap(int[] nums, int left, int right){
        int temp= nums[left];
        nums[left]= nums[right];
        nums[right]= temp;
    }
    
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int left = 0, j = n-1;  //initalizing j form the back side of the array
        int right = n - 1;
        int[] ans= new int[n];
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                ans[j--] = nums[left] * nums[left];  
                // swap(arr, left, right);
                left++;
            }

            else {
                ans[j--] = nums[right] * nums[right];
                right--;
            }
        }
        return ans;
}
}