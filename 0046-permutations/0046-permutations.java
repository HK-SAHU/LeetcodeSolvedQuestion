class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> per, int[] nums){
        if(per.size()==nums.length){
            res.add(new ArrayList(per));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(per.contains(nums[i])) continue;
            per.add(nums[i]);
            backtrack(res, per, nums);
            per.remove(per.size()-1);
        }
    }
}