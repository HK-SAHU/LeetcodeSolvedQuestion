class Solution {
    public int balancedStringSplit(String s) {
        int count=0;
        int inc=0;
        int n= s.length();
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='R'){
                inc++;
            }
            else if(s.charAt(i)=='L'){
                inc--;
            }
            if(inc==0){
                count++;
            }
        }
        return count;
    }
}