class Solution {
    public int[] constructRectangle(int area) {
        int[] ans= new int[2];
        int a=(int)Math.sqrt(area);
        if(a*a==area){
            ans[0]=a;
            ans[1]=a;
            return ans;
        }
        return rectangle(area, ans, a,0);
    }
    
    public int[] rectangle(int area, int[] ans, int a, int b){
        
        if(area%a==0){
            b=area/a;
            ans[0]=b;
            ans[1]=a;
            return ans;
        }
        return rectangle(area,ans,a-1,b);
    }
}