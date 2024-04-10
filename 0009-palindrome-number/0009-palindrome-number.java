class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int sum=0, temp=x,r;
        while(x>0){
            r=x%10;
            sum=(sum*10)+r;
            x=x/10;
        }
        if(temp==sum) return true;
        else return false;
    }
}