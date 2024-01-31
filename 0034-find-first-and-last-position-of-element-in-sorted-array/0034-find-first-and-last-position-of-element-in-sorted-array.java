class Solution {
    
    public int[] searchRange(int[] nums, int target) {

        int[] result = new int[2];
        result[0] = searchFirst(nums, target);
        result[1] = searchLast(nums, target);

        return result;
    }

  
    public int searchFirst(int[] nums, int target){
        int left = 0; 
        int right = nums.length - 1; 
        int index = -1; 

        while(left <= right){

            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                index = mid; 
                right = mid - 1; 
            }

            else if(nums[mid] < target){
                left = mid + 1; 
            }
            else{
                right = mid - 1; 
            }
        }

        return index;
    }

    public int searchLast(int[] nums, int target){
        int left = 0; 
        int right = nums.length - 1; 
        int index = -1; 

        while(left <= right){

            int mid = left + (right - left) / 2;

            if(nums[mid] == target){
                index = mid; 
                left = mid + 1;
            }

            else if(nums[mid] < target){
                left = mid + 1; 
            }
            else{
                right = mid - 1;
            }
        }

        return index;
    }
    /*public int[] searchRange(int[] nums, int target) {
        int[] ans= new int[2];
        ans[0]= assignFirst(nums, target);
        ans[1]=assignLast(nums, target);
        return ans;
    }
    
    public int assignFirst(int[] nums, int target){
        int n= nums.length;
        int found=-1;
        for(int i=0; i<n;i++){
            if(nums[i]==target){
                found=i;
                break;
            }
        }
        return found;
    }
    
    public int assignLast(int[] nums, int target){
        int n= nums.length;
        int found=-1;
        for(int i=n-1; i>=0;i--){
            if(nums[i]==target){
                found=i;
                break;
            }
        }
        return found;
    }*/
    
    
}