class Solution {
    public List<Integer> majorityElement(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        int count1=0;
        int count2=0;
        int ele1=Integer.MIN_VALUE;
        int ele2=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(count1==0 && nums[i]!=ele2){
                count1=1;
                ele1=nums[i];
            }
            else if(count2==0 && nums[i]!= ele1){
                count2=1;
                ele2= nums[i];
            }
            else if(ele1==nums[i]){
                count1++;
            }
            else if(ele2== nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        int c1=0; int c2=0;
        for(int num: nums){
            if(num == ele1 ) c1++;
            else if(num == ele2) c2++;
        }
        if(c1> n/3){
            list.add(ele1);
        }
        if(c2> n/3){
            list.add(ele2);
        }
    return list;
        
    }
}