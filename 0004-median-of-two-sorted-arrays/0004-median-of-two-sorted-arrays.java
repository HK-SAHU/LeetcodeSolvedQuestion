class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int m = nums2.length;
        int[] merged= new int[m+n];
        int len= merged.length;
        int start1=0;
        int start2=0;
        int start3=0;
        double median=0;
        
        while(start1<=n-1 && start2<=m-1){
            if(nums1[start1]<nums2[start2]){
                merged[start3++]=nums1[start1++];
            }
            else{
                merged[start3++]=nums2[start2++];
            }
        }
        while(start1<n){
            merged[start3++]=nums1[start1++];
        }
        while(start2<m){
            merged[start3++]=nums2[start2++];
        }
        int merSt=0;
        int merEd=len-1;
        if(len%2==0){
            int mid1=(merSt+merEd)/2;
            int mid2=mid1+1;
            median=(double)(merged[mid1]+merged[mid2])/2;
        }
        else{
            int mid1=(merSt+merEd)/2;
            median=merged[mid1];
        }
        return median;
    }
}