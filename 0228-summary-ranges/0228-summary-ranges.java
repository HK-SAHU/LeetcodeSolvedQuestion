class Solution {
    public List<String> summaryRanges(int[] nums) {
        /*List<String> list=new ArrayList();
        if(nums.length==1){
            list.add(nums[0]+"");
            return list;
        }
        for(int i=0;i<nums.length;i++){
            int a=nums[i];
            while(i+1<nums.length&&(nums[i+1]-nums[i])==1){
                i++;
            }
            if(a!=nums[i]){
                list.add(a+"->"+nums[i]);
            }else{
                list.add(a+"");
            }
        }
        return list;*/
        
        List<String> ans = new ArrayList<>();

    for (int i = 0; i < nums.length; ++i) {
      final int begin = nums[i];
      while (i + 1 < nums.length && nums[i] == nums[i + 1] - 1)
        ++i;
      final int end = nums[i];
      if (begin == end)
        ans.add("" + begin);
      else
        ans.add("" + begin + "->" + end);
    }

    return ans;
    }
}