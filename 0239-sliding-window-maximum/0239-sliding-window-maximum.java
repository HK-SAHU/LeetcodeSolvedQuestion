class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null || nums.length<k) return new int[0]; 
        int n= nums.length;
        int[] arr= new int[n-k+1];
        Deque<Integer> deque= new ArrayDeque<>();
        
        for(int i=0;i<n;i++){
            if(!deque.isEmpty() && deque.peekFirst()==i-k){
                deque.pollFirst();  // remove the first element to maintain the size of the window
            }
            while(!deque.isEmpty() && nums[deque.peekLast()] < nums[i]){
                deque.pollLast();  // we ahve to maintain the increasing fashion
            }
            deque.offerLast(i);  // add the new element
            // the front of the deque contains the index of the maximum element of the current value
            
            if(i>=k-1){
                arr[i-k+1]=nums[deque.peekFirst()];
            }
        }
        return arr;
    }
}