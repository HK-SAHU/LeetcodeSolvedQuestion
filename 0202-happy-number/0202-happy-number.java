class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        int sum=n, temp=n;
        while(sum>9){
            sum=0;
            while(temp>0){
                sum+=Math.pow(temp%10,2);
                temp=temp/10;
            }
            if(sum==1) return true;
            temp=sum;
        }
        if(sum==7) return true;
        return false;
    }
}