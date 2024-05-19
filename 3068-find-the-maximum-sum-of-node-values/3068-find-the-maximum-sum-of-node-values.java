class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long maxSum = 0;
    int changedCount = 0;
    int minChangeDiff = Integer.MAX_VALUE;
    // Iterate through each number in the nums array
    for (int num : nums) {
      // Calculate the maximum value between the number itself and the result of num XOR k
      maxSum += Math.max(num, num ^ k);
      // Count how many times the XOR operation increased the number
      if ((num ^ k) > num) {
        changedCount++;
      }
      // Keep track of the smallest difference caused by the XOR operation
      minChangeDiff = Math.min(minChangeDiff, Math.abs(num - (num ^ k)));
    }
    // If the number of increases (changedCount) is even, return the maxSum
    if (changedCount % 2 == 0) {
      return maxSum;
    }
    // If changedCount is odd, subtract the smallest difference to make the count even
    return maxSum - minChangeDiff;
    }
}