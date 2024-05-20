class Solution {
    public int firstUniqChar(String s) {
        // HashMap<Character, Integer> map= new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     if(map.containsKey(s.charAt(i))){
        //         map.put(s.charAt(i), map.get(s.charAt(i))+1);
        //     }
        //     else{
        //         map.put(s.charAt(i),1);
        //     }
        // }
        // int result=-1;
        // for(int i=0;i<s.length();i++){
        //     if(map.get(s.charAt(i))==1) return i;
        // }
        // return result;
        
        int[] freq= new int[26];
        for(int i=0;i<s.length();i++){
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++){
            if(freq[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}