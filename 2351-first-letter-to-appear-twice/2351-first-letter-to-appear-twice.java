class Solution {
    public char repeatedCharacter(String s) {
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
            if(freq[c-'a']>1){
                return c;
            }
        }
        return '0';
    }
}