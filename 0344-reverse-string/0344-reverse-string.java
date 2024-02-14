class Solution {
    public static void swap(char[] s, int i, int j){
        char temp= s[i];
        s[i]=s[j];
        s[j]= temp;
    }
    public void reverseString(char[] s) {
        int str =s.length;
        int i=0;
        int j=str-1;
        while(i<j){
            swap(s, i, j);
            i++;
            j--;
        }
    }
}