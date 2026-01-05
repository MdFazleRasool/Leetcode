class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for(int i = left ; i<=right ; i++){
            String s = words[i];
            if(isVowel(s.charAt(0))&& isVowel(s.charAt(s.length()-1))) count+=1;
        }
        return count;
    }
    public boolean isVowel(char a){
        if(a == 'a') return true;
        if(a == 'e') return true;

        if(a == 'i') return true;
        if(a == 'o') return true;

        if(a == 'u') return true;
        return false ;
    }
}