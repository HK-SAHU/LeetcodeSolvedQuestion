class Solution {
    static int size=265;
    public boolean isIsomorphic(String s, String t) {
        int m= t.length();
        int n= s.length();
        if(m!=n){
            return false;
        }
        Boolean[] marked = new Boolean[size];
        Arrays.fill(marked, Boolean.FALSE);
 
        // To store mapping of every character from str1 to
        // that of str2. Initialize all entries of map as
        // -1.
        int[] map = new int[size];
        Arrays.fill(map, -1);
 
        // Process all characters one by one
        for (int i = 0; i < n; i++) {
            // If current character of str1 is seen first
            // time in it.
            if (map[s.charAt(i)] == -1) {
                // If current character of str2 is already
                // seen, one to one mapping not possible
                if (marked[t.charAt(i)] == true)
                    return false;
 
                // Mark current character of str2 as visited
                marked[t.charAt(i)] = true;
 
                // Store mapping of current characters
                map[s.charAt(i)] = t.charAt(i);
            }
 
            // If this is not first appearance of current
            // character in str1, then check if previous
            // appearance mapped to same character of str2
            else if (map[s.charAt(i)] != t.charAt(i))
                return false;
        }
 
        return true;
    }
}