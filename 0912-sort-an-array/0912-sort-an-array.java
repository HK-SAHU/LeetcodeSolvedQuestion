class Solution {
    public static void merge(int[] nums, int start, int mid, int end){
        //i= leftsubbarray pointer, j= right subarray poinnter, k= original subarray pointer
        int n1= mid- start +1;
        int n2=end-mid;
        
        int[] left= new int[n1];
        int[] right= new int[n2];
        
        // copy data to temp arrays
        for(int i=0;i<n1;i++){
            left[i]= nums[start+i];
        }
        
        for(int j=0;j<n2;j++){
            right[j]=nums[mid+1+j];
        }
        
        int i=0;
        int j=0;
        int k=start;
        while(i<n1 && j<n2){
            if(left[i]<=right[j]){
                nums[k]=left[i];
                i++;
            }
            else{
                nums[k]=right[j];
                j++;
            }
            k++;
        }
        
        //if elements are left in leftSubarray
        while(i<n1){
            nums[k]= left[i];
            i++;
            k++;
        }
        
        while(j<n2){
            nums[k]= right[j];
            j++;
            k++;
        }
        
    }
    public static void mergeSort(int[] nums, int start, int end){
        if(start<end){
            int mid= start+(end-start)/2;
            mergeSort(nums,start, mid);
            mergeSort(nums, mid+1, end);
            merge(nums, start, mid, end);
            
        }
    }
    public int[] sortArray(int[] nums) {
        if(nums==null || nums.length==0) return nums;
        mergeSort(nums, 0, nums.length-1);
        return nums;
    }
}

//////////////////////////////////////////////////////////////// Quick Sort /////////////////////////////////////////////////////////////////////////

// class Solution{
    
//     public static int partition(int[] nums, int start, int end){
//         int i = start;    // i will take care of the smaller element than the pivot
//         int pivot= nums[start];   // pivot as the first element of an array
        
//         for(int j= start+1; j<=end;j++){     // j will take care of the bigger element than the pivot
//             if(nums[j]<=pivot){
//                 i++;
//                 int temp = nums[i];
//                 nums[i]= nums[j];
//                 nums[j]= temp;
//             }
//         }
//         // to return or place the pivot at the correct position
//         int temp= nums[start];
//         nums[start]= nums[i];
//         nums[i]= temp;
        
//         return i;
//     }
    
    
//     public static void quickSort(int[] nums, int start, int end){
//         if(start< end){
//             int m= partition(nums,start, end);
//             quickSort(nums, start, m-1);
//             quickSort(nums, m+1, end);
//         }
//     }
    
//     public int[] sortArray(int[] nums){
//         if(nums==null || nums.length==0) return nums;
//         for(int i=0;i<nums.length-1;i++){
//             if(nums[i]==nums[i+1]){
                
//             }
//             else break;
//             return nums;
//         }
//         quickSort(nums, 0, nums.length-1);
//         return nums;
//     }
// }