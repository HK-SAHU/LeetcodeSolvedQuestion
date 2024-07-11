class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res= new ArrayList<>();
        backtrack(res, new ArrayList<>(), 1, n, k);
        return res;
    }
    public void backtrack(List<List<Integer>> res, List<Integer> com, int start,int n, int k){
        if(com.size()==k){
            res.add(new ArrayList<>(com));
            return;
        }
        for(int i=start; i<=n;i++){
            // if(com.contains(i)) continue;   
            com.add(i);
            backtrack(res, com, i+1,n,k);
            com.remove(com.size()-1);
        }
    }
}