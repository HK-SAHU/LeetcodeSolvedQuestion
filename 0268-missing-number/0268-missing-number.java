class Solution {
    public int missingNumber(int[] nums) {
        int n= nums. length;
        int sum=0;
        int naturalSum=0;
        for(int i =0; i<n;i++){
            sum+= nums[i];
        }
        naturalSum= (n*(n+1))/2;
        int missingNumber= naturalSum- sum;
        return missingNumber;
    }
}