class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str = new StringBuilder();
        int count=0;
        char[] ch= s.toCharArray();
        int n = ch.length;
        for(int i=0; i<n; i++){
            if(ch[i]=='('){
                count++;
            }
            else if(ch[i]==')'){
                count--;
            }
            if(count==1 && ch[i]=='('){
                continue;
            }
            if(count==0 && ch[i]==')'){
                continue;
            }
            str.append(ch[i]);
        }
        
        return str.toString();
    }
}