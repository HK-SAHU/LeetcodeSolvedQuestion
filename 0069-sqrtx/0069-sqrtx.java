class Solution {
    public int mySqrt(int x) {
//         if (x == 0 || x == 1)
//             return x;

//         int start = 1, end = x, ans = 0;
//         while (start <= end) {
//             int mid = start + (end - start) / 2;

//             // Check if mid is the square root
//             if (mid <= x / mid) {
//                 start = mid + 1;
//                 ans = mid;
//             } else {
//                 end = mid - 1;
//             }
//         }
//         return ans;
        
        if (x == 0 || x == 1)
            return x;
        int start=1;
        int end=x;
        int result=0;
        while(start<=end){
            int mid=start+(end-start)/2;
            long val=(long)mid*mid;
            
            if(val==x){
                return mid;
            }
            else if(val<x){
                result=mid;
                start=mid+1;
            }
            else{
                end= mid-1;
                
            }
        }
        return result;
    }
}
