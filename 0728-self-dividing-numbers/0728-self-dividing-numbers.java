class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int num=left;num<=right;num++){
            if(selfDiv(num)) list.add(num);
        }
        return list;
    }
    public boolean selfDiv(int num){
        int temp=num;
        while(temp>0){
            if(temp%10==0 || num%(temp%10)!=0) return false;
            temp/=10;
        }
        return true;
    }
}