class Solution {
    public int differenceOfSum(int[] nums) {
        int n=nums.length;
        int eleSum=0, digiSum=0;
        for(int i=0;i<n;i++){
            eleSum+=nums[i];
            int temp=nums[i];
            while(temp>0){
                digiSum+=temp%10;
                temp/=10;
            }
        }
        if(eleSum>digiSum) return eleSum-digiSum;
        return digiSum-eleSum;
    }
}