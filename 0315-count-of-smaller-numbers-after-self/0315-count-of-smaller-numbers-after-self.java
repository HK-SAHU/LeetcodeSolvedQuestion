class Solution {
    public List<Integer> countSmaller(int[] nums) {
        List<Integer> res= new LinkedList<>();
        List<Integer> sorted= new ArrayList<>();
        if(nums==null || nums.length==0) return res;
        
        for(int i=nums.length-1;i>=0;i--){
            int left=0;
            int right= sorted.size();
            while (left<right){
                int mid= left+(right- left)/2;
                if(nums[i]<=sorted.get(mid)){
                    right= mid;
                }
                else{
                    left= mid+1;
                }
            }
            sorted.add(left, nums[i]);
            res.add(0, left);
        }
        return res;
    }
}