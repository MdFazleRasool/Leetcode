class Solution {
    public String longestCommonPrefix(String[] s) {
        StringBuilder sb = new StringBuilder(s[0]);
        //String s1 = s[0];
        for(int i = 1 ; i<s.length;i++){
            int j = 0 ;
            while(j < sb.length() && j < s[i].length() && s[i].charAt(j) == sb.charAt(j))
                j++ ;
            
            sb.setLength(j);
        }
        return sb.toString();
    }
}