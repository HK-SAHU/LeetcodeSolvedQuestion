class Solution {
    public double myPow(double x, int n) {
        if(x==1){
            return 1;
        }
        if (n==Integer.MIN_VALUE){
            return 1/(x*myPow(x,Integer.MAX_VALUE));
        }
        if(n<0){
            n=-n;
            x=1/x;
            return myPow(x,n);
        }
        if(n==0){
            return 1;
        }
        if(n==1){
            return x;
        }
        
        if(n%2==0){
            double temp=myPow(x,n/2);
            return temp*temp;
        }
        else{
            double temp=myPow(x,n/2);
            return x*temp*temp;
        }
    }
}