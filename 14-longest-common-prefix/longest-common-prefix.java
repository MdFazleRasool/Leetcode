class Solution {
    public String longestCommonPrefix(String[] s) {
        if(s.length == 1) return s[0];
        String sb = s[0];
        for(int i = 1 ; i<s.length;i++){
            int j = 0 ;
            String ch = "" ;
            while(j < sb.length() && j < s[i].length() && s[i].charAt(j) == sb.charAt(j)){
                ch+=sb.charAt(j);
                j++ ;
            }
            sb=ch;
        }
        return sb;
    }
}