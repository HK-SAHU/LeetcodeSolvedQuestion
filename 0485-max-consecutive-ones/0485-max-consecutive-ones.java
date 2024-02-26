class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int count1 = 0;
        int count2 = 0;
        
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count1++;
            } else {
                // If we encounter a zero, update count2 if count1 is greater
                if (count1 > count2) {
                    count2 = count1;
                }
                // Reset count1 to zero
                count1 = 0;
            }
        }
        
        // Check if the last sequence of ones is the longest
        if (count1 > count2) {
            count2 = count1;
        }
        
        return count2;
    }
}
