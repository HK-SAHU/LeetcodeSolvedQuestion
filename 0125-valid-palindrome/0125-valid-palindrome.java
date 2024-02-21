class Solution {
    public boolean isPalindrome(String s) {
        // boolean yes=false;
        // s=s.toLowerCase();
        // s=s.trim();
        // s=s.replaceAll("[^a-z0-9]","");
        // int n=s.length();
        // int start=0;
        // int end=n-1;
        // while(start<=end){
        //     if(s.charAt(start)==s.charAt(end)){
        //         start++;
        //         end--;
        //     } 
        //     else{
        //         return yes;
        //     }
        // }
        // return !yes;
        
        
        s=s.toLowerCase();
        int n= s.length();
        int start=0;
        int end=n-1;
        while(start<=end){
            if(!isAlphanumeric(s.charAt(start))){
                start++;
            }
            else if(!isAlphanumeric(s.charAt(end))){
                end--;
            }
            else if(s.charAt(start)!=s.charAt(end)){
                return false;
            }
            else{
                start++;
                end--;
            }
        }
        return true;
        
    }
    
    static boolean isAlphanumeric(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}