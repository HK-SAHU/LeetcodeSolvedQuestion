class Solution {
    public void swap(char[] chars, int start, int end){
        while(start<end){
            char temp= chars[start];
            chars[start++]=chars[end];
            chars[end--]= temp;
        }
    }
    public String reverseStr(String s, int k) {
        char[] chars= s.toCharArray();
        int n=chars.length;
        for(int i=0; i<n; i+=2*k){
            int start=i;
            int end= Math.min(start + k - 1, n - 1);
            swap(chars, start,end);
        }
        return String.valueOf(chars);
    }
}